package com.vti.rw41.entity;

import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ExamQuestionId implements Serializable {
    @Column(name = "ExamID", nullable = false)
    private Integer examID;

    @Column(name = "QuestionID", nullable = false)
    private Integer questionID;

    public Integer getExamID() {
        return examID;
    }

    public void setExamID(Integer examID) {
        this.examID = examID;
    }

    public Integer getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Integer questionID) {
        this.questionID = questionID;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ExamQuestionId entity = (ExamQuestionId) o;
        return Objects.equals(this.questionID, entity.questionID) &&
                Objects.equals(this.examID, entity.examID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(questionID, examID);
    }

}