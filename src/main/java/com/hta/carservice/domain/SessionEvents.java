package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "session_events")
public class SessionEvents extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_events_seq")
    @SequenceGenerator(name = "session_events_seq")
    private Long id;

    @Id
    @Column(name = "event_id")
    private Long eventId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id")
    private Session session;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(name = "event_type")
    private Short eventType;

    @Column(name = "timestamp")
    private Integer timestamp;

    public SessionEvents() {}

    public SessionEvents(Long eventId, Short eventType, Integer timestamp) {
        this.eventId = eventId;
        this.eventType = eventType;
        this.timestamp = timestamp;
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
        if (!(o instanceof SessionEvents)) return false;
        SessionEvents that = (SessionEvents) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getEventId(), that.getEventId()) &&
            Objects.equals(getEventType(), that.getEventType()) &&
            Objects.equals(getTimestamp(), that.getTimestamp())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getEventId(), session.getSessionId(), device.getDeviceId(), getEventType(), getTimestamp());
    }

    @Override
    public String toString() {
        return (
            "SessionEvents{" +
            "id=" +
            id +
            ", eventId=" +
            eventId +
            ", sessionId='" +
            session.getSessionId() +
            '\'' +
            ", deviceId='" +
            device.getDeviceId() +
            '\'' +
            ", eventType=" +
            eventType +
            ", timestamp=" +
            timestamp +
            '}'
        );
    }

    @Override
    public Long getId() {
        return id;
    }
}
