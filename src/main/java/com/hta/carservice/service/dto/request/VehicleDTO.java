package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Device;
import java.util.Objects;
import javax.persistence.*;

public class VehicleDTO extends BaseDTO {

    private Long id;

    private String vehicleId;

    private String vehiclePlate;

    private Integer vehicleNo;

    private Long deviceId;

    private String licenseClass;

    private String description;
    private Short status;

    public VehicleDTO(
        Long id,
        String vehicleId,
        String vehiclePlate,
        Integer vehicleNo,
        Long deviceId,
        String licenseClass,
        String description,
        Short status
    ) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.vehiclePlate = vehiclePlate;
        this.vehicleNo = vehicleNo;
        this.deviceId = deviceId;
        this.licenseClass = licenseClass;
        this.description = description;
        this.status = status;
    }

    public VehicleDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehiclePlate() {
        return vehiclePlate;
    }

    public void setVehiclePlate(String vehiclePlate) {
        this.vehiclePlate = vehiclePlate;
    }

    public Integer getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(Integer vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getLicenseClass() {
        return licenseClass;
    }

    public void setLicenseClass(String licenseClass) {
        this.licenseClass = licenseClass;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VehicleDTO)) return false;
        if (!super.equals(o)) return false;
        VehicleDTO that = (VehicleDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getVehicleId(), that.getVehicleId()) &&
            Objects.equals(getVehiclePlate(), that.getVehiclePlate()) &&
            Objects.equals(getVehicleNo(), that.getVehicleNo()) &&
            Objects.equals(getDeviceId(), that.getDeviceId()) &&
            Objects.equals(getLicenseClass(), that.getLicenseClass()) &&
            Objects.equals(getDescription(), that.getDescription()) &&
            Objects.equals(getStatus(), that.getStatus())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            getId(),
            getVehicleId(),
            getVehiclePlate(),
            getVehicleNo(),
            getDeviceId(),
            getLicenseClass(),
            getDescription(),
            getStatus()
        );
    }

    @Override
    public String toString() {
        return (
            "VehicleDTO{" +
            "id=" +
            id +
            ", vehicleId='" +
            vehicleId +
            '\'' +
            ", vehiclePlate='" +
            vehiclePlate +
            '\'' +
            ", vehicleNo=" +
            vehicleNo +
            ", deviceId=" +
            deviceId +
            ", licenseClass='" +
            licenseClass +
            '\'' +
            ", description='" +
            description +
            '\'' +
            ", status=" +
            status +
            '}'
        );
    }
}
