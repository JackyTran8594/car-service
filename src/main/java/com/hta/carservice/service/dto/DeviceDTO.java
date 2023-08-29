package com.hta.carservice.service.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

public class DeviceDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;
    private String deviceId;
    private String serialNumber;
    private String imeiNumber;

    private String displayName;

    private String simId;

    private String vehicleId;

    private Short status;

    public DeviceDTO() {}

    public DeviceDTO(
        String deviceId,
        String serialNumber,
        String imeiNumber,
        String displayName,
        String simId,
        String vehicleId,
        Short status
    ) {
        this.deviceId = deviceId;
        this.serialNumber = serialNumber;
        this.imeiNumber = imeiNumber;
        this.displayName = displayName;
        this.simId = simId;
        this.vehicleId = vehicleId;
        this.status = status;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getImeiNumber() {
        return imeiNumber;
    }

    public void setImeiNumber(String imeiNumber) {
        this.imeiNumber = imeiNumber;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getSimId() {
        return simId;
    }

    public void setSimId(String simId) {
        this.simId = simId;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
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
        if (!(o instanceof DeviceDTO)) return false;
        DeviceDTO device = (DeviceDTO) o;
        return (
            Objects.equals(getDeviceId(), device.getDeviceId()) &&
            Objects.equals(getSerialNumber(), device.getSerialNumber()) &&
            Objects.equals(getImeiNumber(), device.getImeiNumber()) &&
            Objects.equals(getDisplayName(), device.getDisplayName()) &&
            Objects.equals(getSimId(), device.getSimId()) &&
            Objects.equals(getVehicleId(), device.getVehicleId()) &&
            Objects.equals(getStatus(), device.getStatus())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDeviceId(), getSerialNumber(), getImeiNumber(), getDisplayName(), getSimId(), getVehicleId(), getStatus());
    }

    @Override
    public String toString() {
        return (
            "Device{" +
            "id=" +
            id +
            ", deviceId='" +
            deviceId +
            '\'' +
            ", serialNumber='" +
            serialNumber +
            '\'' +
            ", imeiNumber='" +
            imeiNumber +
            '\'' +
            ", displayName='" +
            displayName +
            '\'' +
            ", simId='" +
            simId +
            '\'' +
            ", vehicleId='" +
            vehicleId +
            '\'' +
            ", status=" +
            status +
            '}'
        );
    }
}
