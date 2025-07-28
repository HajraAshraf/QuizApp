package com.quiz.quiz_service.repository;

import com.quiz.quiz_service.compositeKey.OptionsId;
import com.quiz.quiz_service.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OptionRepository extends JpaRepository<Options, OptionsId>
{

}
