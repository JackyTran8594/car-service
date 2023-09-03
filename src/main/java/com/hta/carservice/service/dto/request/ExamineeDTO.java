package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.LicenseClass;
import com.hta.carservice.domain.National;
import java.sql.Blob;
import java.time.Instant;
import java.util.Objects;
import javax.persistence.*;

public class ExamineeDTO extends BaseDTO {

    private Long id;

    private Long examineeId;

    private Short examineeCode;

    private String centerCode;

    private String unitCode;

    private National national;

    private String addressCode;
    private Short gender;

    private Integer birthDate;
    private LicenseClass licenseClass;
    private String firstName;
    private String lastName;
    private String fullName;
    private Short examContent;
    private Blob image;

    public ExamineeDTO(
        Long id,
        Long examineeId,
        Short examineeCode,
        String centerCode,
        String unitCode,
        National national,
        String addressCode,
        Short gender,
        Integer birthDate,
        LicenseClass licenseClass,
        String firstName,
        String lastName,
        String fullName,
        Short examContent,
        Blob image
    ) {
        this.id = id;
        this.examineeId = examineeId;
        this.examineeCode = examineeCode;
        this.centerCode = centerCode;
        this.unitCode = unitCode;
        this.national = national;
        this.addressCode = addressCode;
        this.gender = gender;
        this.birthDate = birthDate;
        this.licenseClass = licenseClass;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.examContent = examContent;
        this.image = image;
    }

    public ExamineeDTO() {}

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

    public Short getExamineeCode() {
        return examineeCode;
    }

    public void setExamineeCode(Short examineeCode) {
        this.examineeCode = examineeCode;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public National getNational() {
        return national;
    }

    public void setNational(National national) {
        this.national = national;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public LicenseClass getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(LicenseClass licenseClass) {
        this.licenseClass = licenseClass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Short getExamContent() {
        return examContent;
    }

    public void setExamContent(Short examContent) {
        this.examContent = examContent;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamineeDTO)) return false;
        if (!super.equals(o)) return false;
        ExamineeDTO that = (ExamineeDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getExamineeId(), that.getExamineeId()) &&
            Objects.equals(getExamineeCode(), that.getExamineeCode()) &&
            Objects.equals(getCenterCode(), that.getCenterCode()) &&
            Objects.equals(getUnitCode(), that.getUnitCode()) &&
            Objects.equals(getNational(), that.getNational()) &&
            Objects.equals(getAddressCode(), that.getAddressCode()) &&
            Objects.equals(getGender(), that.getGender()) &&
            Objects.equals(getBirthDate(), that.getBirthDate()) &&
            Objects.equals(getLicenseClass(), that.getLicenseClass()) &&
            Objects.equals(getFirstName(), that.getFirstName()) &&
            Objects.equals(getLastName(), that.getLastName()) &&
            Objects.equals(getFullName(), that.getFullName()) &&
            Objects.equals(getExamContent(), that.getExamContent()) &&
            Objects.equals(getImage(), that.getImage())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            getId(),
            getExamineeId(),
            getExamineeCode(),
            getCenterCode(),
            getUnitCode(),
            getNational(),
            getAddressCode(),
            getGender(),
            getBirthDate(),
            getLicenseClass(),
            getFirstName(),
            getLastName(),
            getFullName(),
            getExamContent(),
            getImage()
        );
    }

    @Override
    public String toString() {
        return (
            "ExamineeDTO{" +
            "id=" +
            id +
            ", examineeId=" +
            examineeId +
            ", examineeCode=" +
            examineeCode +
            ", centerCode='" +
            centerCode +
            '\'' +
            ", unitCode='" +
            unitCode +
            '\'' +
            ", national=" +
            national +
            ", addressCode='" +
            addressCode +
            '\'' +
            ", gender=" +
            gender +
            ", birthDate=" +
            birthDate +
            ", licenseClass=" +
            licenseClass +
            ", firstName='" +
            firstName +
            '\'' +
            ", lastName='" +
            lastName +
            '\'' +
            ", fullName='" +
            fullName +
            '\'' +
            ", examContent=" +
            examContent +
            ", image=" +
            image +
            '}'
        );
    }
}
