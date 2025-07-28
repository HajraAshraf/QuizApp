package com.quiz.quiz_service.controller;


import com.quiz.quiz_service.compositeKey.OptionsId;
import com.quiz.quiz_service.form.OptionForm;
import com.quiz.quiz_service.form.QuestionForm;
import com.quiz.quiz_service.form.SubjectForm;
import com.quiz.quiz_service.response.APIResponse;
import com.quiz.quiz_service.service.QuestionService;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1/quiz")
public class QuizController
{
   private final QuestionService questionService;

    public QuizController(QuestionService questionService) {

        this.questionService = questionService;
    }
    @PostMapping("/add-question")
    public APIResponse addQuiz(@RequestBody QuestionForm questionForm){
        return questionService.addQuestion(questionForm);
    }
    @GetMapping("/get-all-questions")
    public APIResponse getAllQuestions(@RequestParam int subjectId){
        return questionService.getAllQuestions(subjectId);
    }
    @GetMapping("/get-all-subjects")
    public APIResponse getAllSubjects() {
        return questionService.getAllSubjects();
    }

    @GetMapping("/get-all-options")
    public APIResponse getAllOptions(@RequestParam int subjectId,@RequestParam int questionId){
        return questionService.getAllOptions(subjectId,questionId);
    }

    @PostMapping("/add-subject")
    public APIResponse addSubject(@RequestBody SubjectForm subjectForm){
        return questionService.addSubject(subjectForm);
    }
    @PostMapping("/add-options")
    public APIResponse addOptions(@RequestBody OptionForm optionForm){
        return questionService.addOptions(optionForm);
    }

    @DeleteMapping("/delete-subject")
    public APIResponse deleteSubject(@RequestParam int subjectId){
        return questionService.deleteSubject(subjectId);
    }
    @DeleteMapping("/delete-question")
    public APIResponse deleteQuestion(@RequestParam int questionId){
        return questionService.deleteQuestion(questionId);
    }
    public APIResponse deleteOptions(@RequestParam OptionsId id){
        return questionService.deleteOptions(id);
    }

    @PostMapping("/attempt-quiz/{subjectId}")
    public APIResponse attemptQuiz(@RequestParam int subjectId){
        return questionService.getAllQuestions(subjectId);
    }

}
