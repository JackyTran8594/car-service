package com.hta.carservice.service.dto.request;

import java.util.Objects;
import javax.persistence.*;

public class TransportationUnitDTO extends BaseDTO {

    private Long id;

    private String transportationId;

    private String parentCode;

    private String serviceId;

    private String parentName;

    private String fullName;

    private String contactPhone;

    private String address;

    private Integer trainingFlow;

    private String license;
    private Integer licenseExpire;

    public TransportationUnitDTO(
        Long id,
        String transportationId,
        String parentCode,
        String serviceId,
        String parentName,
        String fullName,
        String contactPhone,
        String address,
        Integer trainingFlow,
        String license,
        Integer licenseExpire
    ) {
        this.id = id;
        this.transportationId = transportationId;
        this.parentCode = parentCode;
        this.serviceId = serviceId;
        this.parentName = parentName;
        this.fullName = fullName;
        this.contactPhone = contactPhone;
        this.address = address;
        this.trainingFlow = trainingFlow;
        this.license = license;
        this.licenseExpire = licenseExpire;
    }

    public TransportationUnitDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransportationId() {
        return transportationId;
    }

    public void setTransportationId(String transportationId) {
        this.transportationId = transportationId;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getTrainingFlow() {
        return trainingFlow;
    }

    public void setTrainingFlow(Integer trainingFlow) {
        this.trainingFlow = trainingFlow;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public Integer getLicenseExpire() {
        return licenseExpire;
    }

    public void setLicenseExpire(Integer licenseExpire) {
        this.licenseExpire = licenseExpire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TransportationUnitDTO)) return false;
        if (!super.equals(o)) return false;
        TransportationUnitDTO that = (TransportationUnitDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getTransportationId(), that.getTransportationId()) &&
            Objects.equals(getParentCode(), that.getParentCode()) &&
            Objects.equals(getServiceId(), that.getServiceId()) &&
            Objects.equals(getParentName(), that.getParentName()) &&
            Objects.equals(getFullName(), that.getFullName()) &&
            Objects.equals(getContactPhone(), that.getContactPhone()) &&
            Objects.equals(getAddress(), that.getAddress()) &&
            Objects.equals(getTrainingFlow(), that.getTrainingFlow()) &&
            Objects.equals(getLicense(), that.getLicense()) &&
            Objects.equals(getLicenseExpire(), that.getLicenseExpire())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            getId(),
            getTransportationId(),
            getParentCode(),
            getServiceId(),
            getParentName(),
            getFullName(),
            getContactPhone(),
            getAddress(),
            getTrainingFlow(),
            getLicense(),
            getLicenseExpire()
        );
    }

    @Override
    public String toString() {
        return (
            "TransportationUnitDTO{" +
            "id=" +
            id +
            ", transportationId='" +
            transportationId +
            '\'' +
            ", parentCode='" +
            parentCode +
            '\'' +
            ", serviceId='" +
            serviceId +
            '\'' +
            ", parentName='" +
            parentName +
            '\'' +
            ", fullName='" +
            fullName +
            '\'' +
            ", contactPhone='" +
            contactPhone +
            '\'' +
            ", address='" +
            address +
            '\'' +
            ", trainingFlow=" +
            trainingFlow +
            ", license='" +
            license +
            '\'' +
            ", licenseExpire=" +
            licenseExpire +
            '}'
        );
    }
}
