package com.quiz.quiz_service.convertor;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Converter
public class StringListConverter implements AttributeConverter<List<String>, String> {

    private static final String SPLIT_CHAR = ";;";

    @Override
    public String convertToDatabaseColumn(List<String> list) {
        return list != null ? String.join(SPLIT_CHAR, list) : "";
    }

    @Override
    public List<String> convertToEntityAttribute(String joined) {
        return joined != null && !joined.isEmpty()
                ? Arrays.stream(joined.split(SPLIT_CHAR)).collect(Collectors.toList())
                : List.of();
    }
}
