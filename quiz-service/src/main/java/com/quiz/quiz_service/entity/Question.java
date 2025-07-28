package com.quiz.quiz_service.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "question_id", nullable = false)
    private int questionId;

    @Column(name = "question_desc")
    private String questionDesc;

    @Column(name = "subject_id", nullable = false)
    private int subjectId;
}
