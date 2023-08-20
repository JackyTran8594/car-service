package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "session")
public class Session extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_seq")
    @SequenceGenerator(name = "session_seq")
    private Long id;

    @Id
    @Column(name = "session_id", length = 40)
    private String sessionId;

    @Column(name = "examinee_id")
    private Long examineeId;

    @Column(name = "device_id", length = 48)
    private String deviceId;

    @Column(name = "session_type")
    private Integer sessionType;

    @Column(name = "time_login")
    private Integer timeLogin;

    @Column(name = "time_logout")
    private Integer timeLogout;

    @Column(name = "times")
    private Integer times;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "mark")
    private Integer mark;

    @OneToMany(mappedBy = "session", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<SessionEvents> sessionEvents = new HashSet<>();

    public Session() {}

    public Session(
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
        if (!(o instanceof Session)) return false;
        Session session = (Session) o;
        return (
            Objects.equals(getId(), session.getId()) &&
            Objects.equals(getSessionId(), session.getSessionId()) &&
            Objects.equals(getExamineeId(), session.getExamineeId()) &&
            Objects.equals(getDeviceId(), session.getDeviceId()) &&
            Objects.equals(getSessionType(), session.getSessionType()) &&
            Objects.equals(getTimeLogin(), session.getTimeLogin()) &&
            Objects.equals(getTimeLogout(), session.getTimeLogout()) &&
            Objects.equals(getTimes(), session.getTimes()) &&
            Objects.equals(getDuration(), session.getDuration()) &&
            Objects.equals(getMark(), session.getMark())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getId(),
            getSessionId(),
            getExamineeId(),
            getDeviceId(),
            getSessionType(),
            getTimeLogin(),
            getTimeLogout(),
            getTimes(),
            getDuration(),
            getMark()
        );
    }

    @Override
    public String toString() {
        return (
            "Session{" +
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

    @Override
    public Long getId() {
        return id;
    }
}
