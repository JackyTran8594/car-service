package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Subject;
import java.util.Objects;
import javax.persistence.*;

public class ReferenceDTO extends BaseDTO {

    private Long subjectId;

    private String licenseClass;

    private Short minimum;

    private Short maximum;

    private String description;

    public ReferenceDTO(Long subjectId, String licenseClass, Short minimum, Short maximum, String description) {
        this.subjectId = subjectId;
        this.licenseClass = licenseClass;
        this.minimum = minimum;
        this.maximum = maximum;
        this.description = description;
    }

    public ReferenceDTO() {}

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(String licenseClass) {
        this.licenseClass = licenseClass;
    }

    public Short getMinimum() {
        return minimum;
    }

    public void setMinimum(Short minimum) {
        this.minimum = minimum;
    }

    public Short getMaximum() {
        return maximum;
    }

    public void setMaximum(Short maximum) {
        this.maximum = maximum;
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
        if (!(o instanceof ReferenceDTO)) return false;
        if (!super.equals(o)) return false;
        ReferenceDTO that = (ReferenceDTO) o;
        return (
            Objects.equals(getSubjectId(), that.getSubjectId()) &&
            Objects.equals(getLicenseClass(), that.getLicenseClass()) &&
            Objects.equals(getMinimum(), that.getMinimum()) &&
            Objects.equals(getMaximum(), that.getMaximum()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSubjectId(), getLicenseClass(), getMinimum(), getMaximum(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "ReferenceDTO{" +
            "subjectId=" +
            subjectId +
            ", licenseClass='" +
            licenseClass +
            '\'' +
            ", minimum=" +
            minimum +
            ", maximum=" +
            maximum +
            ", description='" +
            description +
            '\'' +
            '}'
        );
    }
}
