package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "reference")
@IdClass(Reference.class)
public class Reference extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Id
    @Column(name = "license_class", length = 32)
    private String licenseClass;

    @Column(name = "minimum")
    private Short minimum;

    @Column(name = "maximum")
    private Short maximum;

    @Column(name = "description", columnDefinition = "nvarchar(64)")
    private String description;

    public Reference() {}

    public Reference(String licenseClass, Short minimum, Short maximum, String description) {
        this.licenseClass = licenseClass;
        this.minimum = minimum;
        this.maximum = maximum;
        this.description = description;
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
        if (!(o instanceof Reference)) return false;
        Reference reference = (Reference) o;
        return (
            Objects.equals(getLicenseClass(), reference.getLicenseClass()) &&
            Objects.equals(getMinimum(), reference.getMinimum()) &&
            Objects.equals(getMaximum(), reference.getMaximum()) &&
            Objects.equals(getDescription(), reference.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLicenseClass(), getMinimum(), getMaximum(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "Reference{" +
            "subjectId=" +
            subject.getSubjectId() +
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

    @Override
    public Long getId() {
        return subject.getSubjectId();
    }
}
