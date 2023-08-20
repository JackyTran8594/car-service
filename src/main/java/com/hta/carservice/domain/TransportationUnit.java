package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "transportation_unit")
@IdClass(TransportationUnit.class)
public class TransportationUnit extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transportation_unit_seq")
    @SequenceGenerator(name = "transportation_unit_seq")
    private Long id;

    @Id
    @Column(name = "transportation_id", length = 8)
    private String transportationId;

    @Column(name = "parent_code", length = 8)
    private String parentCode;

    @Column(name = "service_id", length = 8)
    private String serviceId;

    @Column(name = "parent_name", columnDefinition = "nvarchar(128)")
    private String parentName;

    @Column(name = "full_name", columnDefinition = "nvarchar(128)")
    private String fullName;

    @Column(name = "contact_phone", length = 20)
    private String contactPhone;

    @Column(name = "address", columnDefinition = "nvarchar(128)")
    private String address;

    @Column(name = "training_flow")
    private Integer trainingFlow;

    @Column(name = "license", length = 24)
    private String license;

    @Column(name = "license_expire")
    private Integer licenseExpire;

    public TransportationUnit() {}

    public TransportationUnit(
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
        if (!(o instanceof TransportationUnit)) return false;
        TransportationUnit that = (TransportationUnit) o;
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
            "TransportationUnit{" +
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

    @Override
    public Long getId() {
        return null;
    }
}
