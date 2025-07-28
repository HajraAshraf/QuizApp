package com.quiz.quiz_service.form;

import com.quiz.quiz_service.convertor.StringListConverter;
import com.quiz.quiz_service.entity.Options;
import com.quiz.quiz_service.compositeKey.OptionsId;
import jakarta.persistence.Convert;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OptionForm {
    private int subjectId;
    private int questionId;

    @Convert(converter = StringListConverter.class)
    private List<String> optionsList;
    private String correctOption;
    public Options toOptions() {
        Options options = new Options();
        OptionsId optionsId = new OptionsId(subjectId, questionId);
        options.setId(optionsId);
        options.setOptionsList(optionsList);
        options.setCorrectOption(correctOption);

        return options;
    }
}
