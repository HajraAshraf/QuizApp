package com.quiz.quiz_service.form;


import com.quiz.quiz_service.entity.Subject;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class SubjectForm
{
    private int subjectId;
    private String subjectName;
    public Subject toSubject(){
        Subject s=new Subject();
        s.setSubjectId(this.subjectId);
        s.setSubjectName(this.subjectName);
        return s;
    }
}
