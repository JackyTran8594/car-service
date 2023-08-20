package com.hta.carservice.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "session_images")
public class SessionImages extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "session_tracks_seq")
    @SequenceGenerator(name = "session_tracks_seq")
    private Long id;

    @Id
    @Column(name = "image_id")
    private Integer imageId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "session_id")
    private Session session;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "device_id")
    private Device device;

    @Column(name = "image")
    @Lob
    private Blob image;

    @Column(name = "timestamp")
    private Integer timestamp;

    public SessionImages() {}

    public SessionImages(Long id, Integer imageId, String sessionId, String deviceId, Blob image, Integer timestamp) {
        this.id = id;
        this.imageId = imageId;
        this.image = image;
        this.timestamp = timestamp;
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
        if (!(o instanceof SessionImages)) return false;
        SessionImages that = (SessionImages) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getImageId(), that.getImageId()) &&
            Objects.equals(getImage(), that.getImage()) &&
            Objects.equals(getTimestamp(), that.getTimestamp())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getImageId(), session.getSessionId(), device.getDeviceId(), getImage(), getTimestamp());
    }

    @Override
    public String toString() {
        return (
            "SessionImages{" +
            "id=" +
            id +
            ", imageId=" +
            imageId +
            ", sessionId='" +
            session.getSessionId() +
            '\'' +
            ", deviceId='" +
            device.getDeviceId() +
            '\'' +
            ", image=" +
            image +
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
