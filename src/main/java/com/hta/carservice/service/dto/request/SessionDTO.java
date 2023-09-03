package com.hta.carservice.service.dto.request;

import java.util.Objects;
import javax.persistence.*;

public class SessionDTO extends BaseDTO {

    private Long id;

    private String sessionId;

    private Long examineeId;

    private String deviceId;

    private Integer sessionType;

    private Integer timeLogin;

    private Integer timeLogout;

    private Integer times;

    private Integer duration;

    private Integer mark;

    public SessionDTO(
        Long id,
        String sessionId,
        Long examineeId,
        String deviceId,
        Integer sessionType,
        Integer timeLogin,
        Integer timeLogout,
        Integer times,
        Integer duration,
        Integer mark
    ) {
        this.id = id;
        this.sessionId = sessionId;
        this.examineeId = examineeId;
        this.deviceId = deviceId;
        this.sessionType = sessionType;
        this.timeLogin = timeLogin;
        this.timeLogout = timeLogout;
        this.times = times;
        this.duration = duration;
        this.mark = mark;
    }

    public SessionDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public Long getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(Long examineeId) {
        this.examineeId = examineeId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSessionType() {
        return sessionType;
    }

    public void setSessionType(Integer sessionType) {
        this.sessionType = sessionType;
    }

    public Integer getTimeLogin() {
        return timeLogin;
    }

    public void setTimeLogin(Integer timeLogin) {
        this.timeLogin = timeLogin;
    }

    public Integer getTimeLogout() {
        return timeLogout;
    }

    public void setTimeLogout(Integer timeLogout) {
        this.timeLogout = timeLogout;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SessionDTO)) return false;
        if (!super.equals(o)) return false;
        SessionDTO that = (SessionDTO) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(sessionId, that.sessionId) &&
            Objects.equals(examineeId, that.examineeId) &&
            Objects.equals(deviceId, that.deviceId) &&
            Objects.equals(sessionType, that.sessionType) &&
            Objects.equals(timeLogin, that.timeLogin) &&
            Objects.equals(timeLogout, that.timeLogout) &&
            Objects.equals(times, that.times) &&
            Objects.equals(duration, that.duration) &&
            Objects.equals(mark, that.mark)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            id,
            sessionId,
            examineeId,
            deviceId,
            sessionType,
            timeLogin,
            timeLogout,
            times,
            duration,
            mark
        );
    }

    @Override
    public String toString() {
        return (
            "SessionDTO{" +
            "id=" +
            id +
            ", sessionId='" +
            sessionId +
            '\'' +
            ", examineeId=" +
            examineeId +
            ", deviceId='" +
            deviceId +
            '\'' +
            ", sessionType=" +
            sessionType +
            ", timeLogin=" +
            timeLogin +
            ", timeLogout=" +
            timeLogout +
            ", times=" +
            times +
            ", duration=" +
            duration +
            ", mark=" +
            mark +
            '}'
        );
    }
}
