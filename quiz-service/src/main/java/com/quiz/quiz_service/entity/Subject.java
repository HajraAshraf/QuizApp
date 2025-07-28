package com.quiz.quiz_service.entity;
import jakarta.persistence.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Subject
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="subject_id", nullable=false)
    private int subjectId;

    @Column(name="subject_name", nullable=false)
    private String subjectName;
}
