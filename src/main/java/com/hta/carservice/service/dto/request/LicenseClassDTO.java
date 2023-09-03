package com.hta.carservice.service.dto.request;

import java.util.Objects;
import javax.persistence.*;

public class LicenseClassDTO extends BaseDTO {

    private Long id;
    private String licenseCode;
    private String description;

    public LicenseClassDTO(Long id, String licenseCode, String description) {
        this.id = id;
        this.licenseCode = licenseCode;
        this.description = description;
    }

    public LicenseClassDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
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
        if (!(o instanceof LicenseClassDTO)) return false;
        if (!super.equals(o)) return false;
        LicenseClassDTO that = (LicenseClassDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getLicenseCode(), that.getLicenseCode()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getLicenseCode(), getDescription());
    }

    @Override
    public String toString() {
        return "LicenseClassDTO{" + "id=" + id + ", licenseCode='" + licenseCode + '\'' + ", description='" + description + '\'' + '}';
    }
}
