package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Examinee;
import com.hta.carservice.domain.Subject;
import java.time.Instant;
import java.util.Objects;
import javax.persistence.*;

public class ExamineeResultDTO extends BaseDTO {

    private Long id;
    private Long examineeId;
    private Long subjectId;
    private Short result;

    public ExamineeResultDTO(Long id, Long examineeId, Long subjectId, Short result) {
        this.id = id;
        this.examineeId = examineeId;
        this.subjectId = subjectId;
        this.result = result;
    }

    public ExamineeResultDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(Long examineeId) {
        this.examineeId = examineeId;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Short getResult() {
        return result;
    }

    public void setResult(Short result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamineeResultDTO)) return false;
        if (!super.equals(o)) return false;
        ExamineeResultDTO that = (ExamineeResultDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getExamineeId(), that.getExamineeId()) &&
            Objects.equals(getSubjectId(), that.getSubjectId()) &&
            Objects.equals(getResult(), that.getResult())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getExamineeId(), getSubjectId(), getResult());
    }

    @Override
    public String toString() {
        return "ExamineeResultDTO{" + "id=" + id + ", examineeId=" + examineeId + ", subjectId=" + subjectId + ", result=" + result + '}';
    }
}
