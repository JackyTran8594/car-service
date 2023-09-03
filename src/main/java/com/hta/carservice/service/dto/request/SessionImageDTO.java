package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Device;
import com.hta.carservice.domain.Session;
import java.sql.Blob;
import java.util.Objects;
import javax.persistence.*;

public class SessionImageDTO extends BaseDTO {

    private Long id;

    private Integer imageId;

    private Long sessionId;

    private Long deviceId;

    private Blob image;

    private Integer timestamp;

    public SessionImageDTO(Long id, Integer imageId, Long sessionId, Long deviceId, Blob image, Integer timestamp) {
        this.id = id;
        this.imageId = imageId;
        this.sessionId = sessionId;
        this.deviceId = deviceId;
        this.image = image;
        this.timestamp = timestamp;
    }

    public SessionImageDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getImageId() {
        return imageId;
    }

    public void setImageId(Integer imageId) {
        this.imageId = imageId;
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

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
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
        if (!(o instanceof SessionImageDTO)) return false;
        if (!super.equals(o)) return false;
        SessionImageDTO that = (SessionImageDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getImageId(), that.getImageId()) &&
            Objects.equals(getSessionId(), that.getSessionId()) &&
            Objects.equals(getDeviceId(), that.getDeviceId()) &&
            Objects.equals(getImage(), that.getImage()) &&
            Objects.equals(getTimestamp(), that.getTimestamp())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getImageId(), getSessionId(), getDeviceId(), getImage(), getTimestamp());
    }

    @Override
    public String toString() {
        return (
            "SessionImageDTO{" +
            "id=" +
            id +
            ", imageId=" +
            imageId +
            ", sessionId=" +
            sessionId +
            ", deviceId=" +
            deviceId +
            ", image=" +
            image +
            ", timestamp=" +
            timestamp +
            '}'
        );
    }
}
