package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 * A user.
 */
@Entity
@Table(name = "user_acl")
@IdClass(UserAcl.class)
public class UserAcl extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_acl_seq")
    @SequenceGenerator(name = "user_acl_seq")
    private Long id;

    @Id
    //    @Column(name = "user_id", length = 32)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Id
    @Column(name = "acl_id", length = 64)
    private String aclId;

    @Column(name = "access_level")
    private Short accessLevel;

    @Column(name = "description", columnDefinition = "nvarchar(512)")
    private String description;

    public UserAcl() {}

    public UserAcl(String aclId, Short accessLevel, String description) {
        this.aclId = aclId;
        this.accessLevel = accessLevel;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAclId() {
        return aclId;
    }

    public void setAclId(String aclId) {
        this.aclId = aclId;
    }

    public Short getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(Short accessLevel) {
        this.accessLevel = accessLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAcl)) return false;
        UserAcl userAcl = (UserAcl) o;
        return (
            Objects.equals(getId(), userAcl.getId()) &&
            Objects.equals(getAclId(), userAcl.getAclId()) &&
            Objects.equals(getAccessLevel(), userAcl.getAccessLevel()) &&
            Objects.equals(getDescription(), userAcl.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), user.getUserId(), getAclId(), getAccessLevel(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "UserAcl{" +
            "id=" +
            id +
            ", userId='" +
            user.getUserId() +
            '\'' +
            ", aclId='" +
            aclId +
            '\'' +
            ", accessLevel=" +
            accessLevel +
            ", description='" +
            description +
            '\'' +
            '}'
        );
    }

    @Override
    public Long getId() {
        return id;
    }
}
