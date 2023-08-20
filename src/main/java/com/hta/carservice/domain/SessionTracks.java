package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "session_tracks")
public class SessionTracks extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_tracks_seq")
    @SequenceGenerator(name = "session_tracks_seq")
    private Long id;

    @Id
    @Column(name = "track_id")
    private Long trackId;

    //    @Column(name = "session_id", length = 40)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id")
    private Session session;

    //    @Column(name = "device_id", length = 48)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(name = "longitude")
    private Double longitude;

    @Column(name = "latitude")
    private Double latitude;

    public SessionTracks() {}

    public SessionTracks(Long trackId, Double longitude, Double latitude) {
        this.trackId = trackId;
        this.longitude = longitude;
        this.latitude = latitude;
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
        if (!(o instanceof SessionTracks)) return false;
        SessionTracks that = (SessionTracks) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getTrackId(), that.getTrackId()) &&
            Objects.equals(getLongitude(), that.getLongitude()) &&
            Objects.equals(getLatitude(), that.getLatitude())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTrackId(), session.getSessionId(), device.getDeviceId(), getLongitude(), getLatitude());
    }

    @Override
    public String toString() {
        return (
            "SessionTracks{" +
            "id=" +
            id +
            ", trackId=" +
            trackId +
            ", sessionId='" +
            session.getSessionId() +
            '\'' +
            ", deviceId='" +
            device.getDeviceId() +
            '\'' +
            ", longitude=" +
            longitude +
            ", latitude=" +
            latitude +
            '}'
        );
    }

    @Override
    public Long getId() {
        return id;
    }
}
