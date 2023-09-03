package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.ExamineeResult;
import com.hta.carservice.domain.Reference;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

public class SubjectDTO extends BaseDTO {

    private Long subjectId;
    private String description;

    public SubjectDTO(Long subjectId, String description) {
        this.subjectId = subjectId;
        this.description = description;
    }

    public SubjectDTO() {}

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
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
        if (!(o instanceof SubjectDTO)) return false;
        if (!super.equals(o)) return false;
        SubjectDTO that = (SubjectDTO) o;
        return Objects.equals(getSubjectId(), that.getSubjectId()) && Objects.equals(getDescription(), that.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSubjectId(), getDescription());
    }

    @Override
    public String toString() {
        return "SubjectDTO{" + "subjectId=" + subjectId + ", description='" + description + '\'' + '}';
    }
}
