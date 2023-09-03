package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Device;
import com.hta.carservice.domain.Session;
import java.util.Objects;
import javax.persistence.*;

public class SessionEventDTO extends BaseDTO {

    private Long id;

    private Long eventId;

    private Long sessionId;

    private Long deviceId;

    private Short eventType;

    private Integer timestamp;

    public SessionEventDTO(Long id, Long eventId, Long sessionId, Long deviceId, Short eventType, Integer timestamp) {
        this.id = id;
        this.eventId = eventId;
        this.sessionId = sessionId;
        this.deviceId = deviceId;
        this.eventType = eventType;
        this.timestamp = timestamp;
    }

    public SessionEventDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEventId() {
        return eventId;
    }

    public void setEventId(Long eventId) {
        this.eventId = eventId;
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

    public Short getEventType() {
        return eventType;
    }

    public void setEventType(Short eventType) {
        this.eventType = eventType;
    }

    public Integer getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SessionEventDTO)) return false;
        if (!super.equals(o)) return false;
        SessionEventDTO that = (SessionEventDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getEventId(), that.getEventId()) &&
            Objects.equals(getSessionId(), that.getSessionId()) &&
            Objects.equals(getDeviceId(), that.getDeviceId()) &&
            Objects.equals(getEventType(), that.getEventType()) &&
            Objects.equals(getTimestamp(), that.getTimestamp())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getEventId(), getSessionId(), getDeviceId(), getEventType(), getTimestamp());
    }

    @Override
    public String toString() {
        return (
            "SessionEventDTO{" +
            "id=" +
            id +
            ", eventId=" +
            eventId +
            ", sessionId=" +
            sessionId +
            ", deviceId=" +
            deviceId +
            ", eventType=" +
            eventType +
            ", timestamp=" +
            timestamp +
            '}'
        );
    }
}
