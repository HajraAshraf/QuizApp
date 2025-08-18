package com.quiz.quiz_service.service;

import com.quiz.quiz_service.compositeKey.OptionsId;
import com.quiz.quiz_service.form.OptionForm;
import com.quiz.quiz_service.form.QuestionForm;
import com.quiz.quiz_service.form.SubjectForm;
import com.quiz.quiz_service.response.APIResponse;

public interface QuestionService
{
    APIResponse addQuestion(QuestionForm questionForm);
    APIResponse addSubject(SubjectForm subjectForm);
    APIResponse addOptions(OptionForm optionForm);
    APIResponse getAllQuestions(int subjectId);
    APIResponse getAllSubjects();
    APIResponse getAllOptions(int subjectId, int optionId);
    APIResponse deleteSubject(int subjectId);
    APIResponse deleteQuestion(int questionId);
    APIResponse deleteOptions(OptionsId id);
   // APIResponse getAllQuestions(int subjectId);

}
