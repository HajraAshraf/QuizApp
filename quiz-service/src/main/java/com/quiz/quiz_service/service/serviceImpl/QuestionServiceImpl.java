package com.quiz.quiz_service.service.serviceImpl;

import com.quiz.quiz_service.compositeKey.OptionsId;
import com.quiz.quiz_service.entity.Options;
import com.quiz.quiz_service.entity.Question;
import com.quiz.quiz_service.entity.Subject;
import com.quiz.quiz_service.form.OptionForm;
import com.quiz.quiz_service.form.QuestionForm;
import com.quiz.quiz_service.form.SubjectForm;
import com.quiz.quiz_service.repository.OptionRepository;
import com.quiz.quiz_service.repository.QuestionRepository;
import com.quiz.quiz_service.repository.SubjectRepository;
import com.quiz.quiz_service.response.APIResponse;
import com.quiz.quiz_service.service.QuestionService;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional
public class QuestionServiceImpl implements QuestionService
{
    @PersistenceContext
    private EntityManager entityManager;
    @Autowired
    private SubjectRepository subjectRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private OptionRepository optionRepository;

    @Override
    public APIResponse addQuestion(QuestionForm questionForm) {
        if (!subjectRepository.existsById(questionForm.getSubjectId())) {
            return APIResponse.builder()
                    .status(400)
                    .message("Question could not be added as subjectId does not exist.").build();
        }

        Question question = questionForm.toQuestion();
        questionRepository.save(question);
        return APIResponse.builder().status(200).message("Question added successfully").build();
    }


    @Override
    public APIResponse addSubject(SubjectForm subjectForm) {
        if (subjectRepository.existsById(subjectForm.getSubjectId())) {
            return APIResponse.builder()
                    .status(400)
                    .message("Subject with ID " + subjectForm.getSubjectId() + " already exists")
                    .build();
        }

        subjectRepository.save(subjectForm.toSubject()); // ✅ handles user IDs

        return APIResponse.builder()
                .status(200)
                .message("Subject added successfully")
                .build();
    }



    @Override
    public APIResponse addOptions(OptionForm optionForm){
        Options options=optionForm.toOptions();
        optionRepository.save(options);
        return APIResponse.builder().status(200).message("Options added successfully").build();
    }
    @Override
    public APIResponse getAllQuestions(int subjectId){
            List<Question> questions = questionRepository.findAllBySubjectId(subjectId);
            return APIResponse.builder()
                    .status(1)
                    .code(200)
                    .message("Questions fetched successfully")
                    .data(Map.of("questions", questions))
                    .build();
        }

        @Override
       public APIResponse getAllSubjects() {
            List<Subject> subjects = subjectRepository.findAll();
            if (subjects.isEmpty())
                return APIResponse.builder().status(0).code(204).
                        message("No subjects found").build();

            return APIResponse.builder().
                    status(1).code(200).message("Subjects fetched successfully")
                    .data(Map.of("subjects",subjects)).build();
        }
        @Override
        public APIResponse getAllOptions(int subjectId, int questionId){
            OptionsId optionsId = new OptionsId(subjectId, questionId);
            Optional<Options> optionalOptions = optionRepository.findById(optionsId);

            if (optionalOptions.isPresent()) {
                return APIResponse.builder().status(0).
                        code(204).message("Options for the subject and the questionId not found").build();
            } else {
                return APIResponse.builder().
                        status(1).code(200).
                        message("All options for the question fetched successfully").build();
            }
        }
        @Override
        public APIResponse deleteSubject(int subjectId){
            Optional<Subject> optionalSubject=subjectRepository.findById(subjectId);
            if(optionalSubject.isEmpty()){
                return APIResponse.builder().
                        status(0).code(204).message("Subject with the given Id is not found").build();
            }
            else {
                return APIResponse.builder().status(1).code(200).
                        message("Subject with the given Id deleted").build();
            }
        }
        @Override
        public APIResponse deleteQuestion(int questionId){
        Optional<Question> optionalQuestion=questionRepository.findById(questionId);
            if(optionalQuestion.isEmpty()){
                return APIResponse.builder().
                        status(0).code(204).message("Question with the given Id is not found").build();
            }
            else {
                return APIResponse.builder().status(1).code(200).
                        message("Question with the given Id deleted").build();
            }
        }
        @Override
       public APIResponse deleteOptions(OptionsId id){
        Optional<Options> optionalOption=optionRepository.findById(id);
            if(optionalOption.isEmpty()){
                return APIResponse.builder().
                        status(0).code(204).message("Options with the given Id is not found").build();
            }
            else {
                return APIResponse.builder().status(1).code(200).
                        message("Options with the given Id deleted").build();
            }
    }
}
