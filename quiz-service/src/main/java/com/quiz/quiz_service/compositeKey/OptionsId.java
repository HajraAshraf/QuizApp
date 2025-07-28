package com.quiz.quiz_service.compositeKey;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class OptionsId implements Serializable {
    private int subjectId;
    private int questionId;

    public OptionsId() {}

    public OptionsId(int subjectId, int questionId) {
        this.subjectId = subjectId;
        this.questionId = questionId;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptionsId optionsId = (OptionsId) o;
        return subjectId == optionsId.subjectId && questionId == optionsId.questionId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(subjectId, questionId);
    }
}


