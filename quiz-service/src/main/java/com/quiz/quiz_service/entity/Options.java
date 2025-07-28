package com.quiz.quiz_service.entity;

import com.quiz.quiz_service.compositeKey.OptionsId;
import com.quiz.quiz_service.convertor.StringListConverter;
import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EmbeddedId;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Options {

    @EmbeddedId
    private OptionsId id;

    @Convert(converter = StringListConverter.class)
    @Column(name = "options_list")
    private List<String> optionsList;
    private String correctOption;
}
