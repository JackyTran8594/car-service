package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Device;
import com.hta.carservice.domain.Session;
import java.util.Objects;
import javax.persistence.*;

public class SessionTrackDTO extends BaseDTO {

    private Long id;

    private Long trackId;
    private Long sessionId;
    private Long deviceId;
    private Double longitude;
    private Double latitude;

    public SessionTrackDTO(Long id, Long trackId, Long sessionId, Long deviceId, Double longitude, Double latitude) {
        this.id = id;
        this.trackId = trackId;
        this.sessionId = sessionId;
        this.deviceId = deviceId;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public SessionTrackDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrackId() {
        return trackId;
    }

    public void setTrackId(Long trackId) {
        this.trackId = trackId;
    }

    public Long getSessionId() {
        return sessionId;
    }

    public void setSessionId(Long sessionId) {
        this.sessionId = sessionId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SessionTrackDTO)) return false;
        if (!super.equals(o)) return false;
        SessionTrackDTO that = (SessionTrackDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getTrackId(), that.getTrackId()) &&
            Objects.equals(getSessionId(), that.getSessionId()) &&
            Objects.equals(getDeviceId(), that.getDeviceId()) &&
            Objects.equals(getLongitude(), that.getLongitude()) &&
            Objects.equals(getLatitude(), that.getLatitude())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getTrackId(), getSessionId(), getDeviceId(), getLongitude(), getLatitude());
    }

    @Override
    public String toString() {
        return (
            "SessionTrackDTO{" +
            "id=" +
            id +
            ", trackId=" +
            trackId +
            ", sessionId=" +
            sessionId +
            ", deviceId=" +
            deviceId +
            ", longitude=" +
            longitude +
            ", latitude=" +
            latitude +
            '}'
        );
    }
}
