package com.hta.carservice.service.dto.request;

import java.util.Objects;
import javax.persistence.*;

public class NationalDTO extends BaseDTO {

    private Long id;

    private String nationalCode;

    private String description;

    public NationalDTO(Long id, String nationalCode, String description) {
        this.id = id;
        this.nationalCode = nationalCode;
        this.description = description;
    }

    public NationalDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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
        if (!(o instanceof NationalDTO)) return false;
        if (!super.equals(o)) return false;
        NationalDTO that = (NationalDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getNationalCode(), that.getNationalCode()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getNationalCode(), getDescription());
    }

    @Override
    public String toString() {
        return "NationalDTO{" + "id=" + id + ", nationalCode='" + nationalCode + '\'' + ", description='" + description + '\'' + '}';
    }
}
