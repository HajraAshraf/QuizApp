package com.quiz.quiz_service.form;


import com.quiz.quiz_service.entity.Question;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm
{
    private int subjectId;
    private int questionId;
    private String questionDesc;


    public Question toQuestion(){
        Question q=new Question();

        q.setSubjectId(this.subjectId);
        q.setQuestionDesc(this.questionDesc);
        return q;
    }
}
