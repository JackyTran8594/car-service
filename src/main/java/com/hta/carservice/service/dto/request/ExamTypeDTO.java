package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Exam;
import java.time.Instant;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

public class ExamTypeDTO extends BaseDTO {

    private Long id;

    private Short examType;

    private String description;

    public ExamTypeDTO(Long id, Short examType, String description) {
        this.id = id;
        this.examType = examType;
        this.description = description;
    }

    public ExamTypeDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getExamType() {
        return examType;
    }

    public void setExamType(Short examType) {
        this.examType = examType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamTypeDTO)) return false;
        if (!super.equals(o)) return false;
        ExamTypeDTO that = (ExamTypeDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getExamType(), that.getExamType()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getExamType(), getDescription());
    }

    @Override
    public String toString() {
        return "ExamTypeDTO{" + "id=" + id + ", examType=" + examType + ", description='" + description + '\'' + '}';
    }
}
