package com.quiz.quiz_service.repository;

import com.quiz.quiz_service.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionRepository extends JpaRepository<Question, Integer>
{
    List<Question> findAllBySubjectId(int subjectId);
}
