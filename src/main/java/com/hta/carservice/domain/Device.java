package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "device")
public class Device extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "device_seq")
    @SequenceGenerator(name = "device_seq")
    private Long id;

    @Id
    @Column(name = "device_id", length = 48)
    private String deviceId;

    @Column(name = "serial_number", length = 24)
    private String serialNumber;

    @Column(name = "imei_number", length = 16)
    private String imeiNumber;

    @Column(name = "display_name", length = 64)
    private String displayName;

    @Column(name = "sim_id", length = 24)
    private String simId;

    @Column(name = "vehicle_id", length = 12)
    private String vehicleId;

    @Column(name = "status")
    private Short status;

    @OneToMany(mappedBy = "device", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<SessionEvents> sessionEvents = new HashSet<>();

    @OneToMany(mappedBy = "device", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<Vehicle> vehicles = new HashSet<>();

    public Device() {}

    public Device(
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
        if (!(o instanceof Device)) return false;
        Device device = (Device) o;
        return (
            Objects.equals(getId(), device.getId()) &&
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
        return Objects.hash(
            getId(),
            getDeviceId(),
            getSerialNumber(),
            getImeiNumber(),
            getDisplayName(),
            getSimId(),
            getVehicleId(),
            getStatus()
        );
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

    @Override
    public Long getId() {
        return id;
    }
}
