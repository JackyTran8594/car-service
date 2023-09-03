package com.hta.carservice.service.dto.request;

import java.time.Instant;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class FaultsDTO extends BaseDTO {

    private Long faultId;

    private String fullName;

    private String shortName;

    private Short subtraction;

    private Short testId;

    public FaultsDTO(Long faultId, String fullName, String shortName, Short subtraction, Short testId) {
        this.faultId = faultId;
        this.fullName = fullName;
        this.shortName = shortName;
        this.subtraction = subtraction;
        this.testId = testId;
    }

    public FaultsDTO() {}

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
        if (!(o instanceof FaultsDTO)) return false;
        if (!super.equals(o)) return false;
        FaultsDTO faultsDTO = (FaultsDTO) o;
        return (
            Objects.equals(getFaultId(), faultsDTO.getFaultId()) &&
            Objects.equals(getFullName(), faultsDTO.getFullName()) &&
            Objects.equals(getShortName(), faultsDTO.getShortName()) &&
            Objects.equals(getSubtraction(), faultsDTO.getSubtraction()) &&
            Objects.equals(getTestId(), faultsDTO.getTestId())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getFaultId(), getFullName(), getShortName(), getSubtraction(), getTestId());
    }

    @Override
    public String toString() {
        return (
            "FaultsDTO{" +
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
}
