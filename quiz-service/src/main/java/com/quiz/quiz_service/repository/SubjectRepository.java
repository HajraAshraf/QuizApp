package com.quiz.quiz_service.repository;

import com.quiz.quiz_service.entity.Subject;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepository extends JpaRepository<Subject, Integer>
{

}
