package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "vehicle_seq")
    @SequenceGenerator(name = "vehicle_seq")
    private Long id;

    @Id
    @Column(name = "vehicle_id", length = 12)
    private String vehicleId;

    @Column(name = "vehicle_plate", length = 12)
    private String vehiclePlate;

    @Column(name = "vehicle_no")
    private Integer vehicleNo;

    //    @Column(name = "device_id", length = 48)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(name = "license_class", length = 8)
    private String licenseClass;

    @Column(name = "description", columnDefinition = "nvarchar(128)")
    private String description;

    @Column(name = "status")
    private Short status;

    public Vehicle() {}

    public Vehicle(
        Long id,
        String vehicleId,
        String vehiclePlate,
        Integer vehicleNo,
        String licenseClass,
        String description,
        Short status
    ) {
        this.id = id;
        this.vehicleId = vehicleId;
        this.vehiclePlate = vehiclePlate;
        this.vehicleNo = vehicleNo;
        this.licenseClass = licenseClass;
        this.description = description;
        this.status = status;
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
        if (!(o instanceof Vehicle)) return false;
        Vehicle vehicle = (Vehicle) o;
        return (
            Objects.equals(getId(), vehicle.getId()) &&
            Objects.equals(getVehicleId(), vehicle.getVehicleId()) &&
            Objects.equals(getVehiclePlate(), vehicle.getVehiclePlate()) &&
            Objects.equals(getVehicleNo(), vehicle.getVehicleNo()) &&
            Objects.equals(getLicenseClass(), vehicle.getLicenseClass()) &&
            Objects.equals(getDescription(), vehicle.getDescription()) &&
            Objects.equals(getStatus(), vehicle.getStatus())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getId(),
            getVehicleId(),
            getVehiclePlate(),
            getVehicleNo(),
            device.getDeviceId(),
            getLicenseClass(),
            getDescription(),
            getStatus()
        );
    }

    @Override
    public String toString() {
        return (
            "Vehicle{" +
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
            ", deviceId='" +
            device.getDeviceId() +
            '\'' +
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

    @Override
    public Long getId() {
        return id;
    }
}
