package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "faults")
public class Faults extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fault_id")
    private Long faultId;

    @Column(name = "full_name", columnDefinition = "nvarchar(128)")
    private String fullName;

    @Column(name = "short_name", columnDefinition = "nvarchar(64)")
    private String shortName;

    @Column(name = "subtraction")
    private Short subtraction;

    @Column(name = "test_id")
    private Short testId;

    public Faults() {}

    public Faults(Long faultId, String fullName, String shortName, Short subtraction, Short testId) {
        this.faultId = faultId;
        this.fullName = fullName;
        this.shortName = shortName;
        this.subtraction = subtraction;
        this.testId = testId;
    }

    public Long getFaultId() {
        return faultId;
    }

    public void setFaultId(Long faultId) {
        this.faultId = faultId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Short getSubtraction() {
        return subtraction;
    }

    public void setSubtraction(Short subtraction) {
        this.subtraction = subtraction;
    }

    public Short getTestId() {
        return testId;
    }

    public void setTestId(Short testId) {
        this.testId = testId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Faults)) return false;
        Faults faults = (Faults) o;
        return (
            Objects.equals(getFaultId(), faults.getFaultId()) &&
            Objects.equals(getFullName(), faults.getFullName()) &&
            Objects.equals(getShortName(), faults.getShortName()) &&
            Objects.equals(getSubtraction(), faults.getSubtraction()) &&
            Objects.equals(getTestId(), faults.getTestId())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getFaultId(), getFullName(), getShortName(), getSubtraction(), getTestId());
    }

    @Override
    public String toString() {
        return (
            "Faults{" +
            "faultId=" +
            faultId +
            ", fullName='" +
            fullName +
            '\'' +
            ", shortName='" +
            shortName +
            '\'' +
            ", subtraction=" +
            subtraction +
            ", testId=" +
            testId +
            '}'
        );
    }

    @Override
    public Long getId() {
        return faultId;
    }
}
