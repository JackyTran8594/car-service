package com.hta.carservice.service.dto.request;

import java.time.Instant;
import java.util.Objects;

public class BaseDTO {

    private String createdBy;
    private Instant createdDate;
    private String lastModifiedBy;
    private Instant lastModifiedDate;

    public BaseDTO(String createdBy, Instant createdDate, String lastModifiedBy, Instant lastModifiedDate) {
        this.createdBy = createdBy;
        this.createdDate = createdDate;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedDate = lastModifiedDate;
    }

    public BaseDTO() {}

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Instant getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Instant createdDate) {
        this.createdDate = createdDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public Instant getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Instant lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseDTO)) return false;
        BaseDTO baseDTO = (BaseDTO) o;
        return (
            Objects.equals(getCreatedBy(), baseDTO.getCreatedBy()) &&
            Objects.equals(getCreatedDate(), baseDTO.getCreatedDate()) &&
            Objects.equals(getLastModifiedBy(), baseDTO.getLastModifiedBy()) &&
            Objects.equals(getLastModifiedDate(), baseDTO.getLastModifiedDate())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCreatedBy(), getCreatedDate(), getLastModifiedBy(), getLastModifiedDate());
    }

    @Override
    public String toString() {
        return (
            "BaseDTO{" +
            "createdBy='" +
            createdBy +
            '\'' +
            ", createdDate=" +
            createdDate +
            ", lastModifiedBy='" +
            lastModifiedBy +
            '\'' +
            ", lastModifiedDate=" +
            lastModifiedDate +
            '}'
        );
    }
}
