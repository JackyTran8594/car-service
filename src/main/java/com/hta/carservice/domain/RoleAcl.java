package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

/**
 * A user.
 */
@Entity
@Table(name = "role_acl")
@IdClass(RoleAcl.class)
public class RoleAcl extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_acl_seq")
    @SequenceGenerator(name = "role_acl_seq")
    private Long id;

    @Id
    //    @Column(name = "role_id", length = 32)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @Id
    @Column(name = "acl_id", length = 64)
    private String aclId;

    @Column(name = "description", columnDefinition = "nvarchar(512)")
    private String description;

    public RoleAcl() {}

    public RoleAcl(String aclId, String description) {
        this.aclId = aclId;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RoleAcl)) return false;
        RoleAcl roleAcl = (RoleAcl) o;
        return (
            Objects.equals(getId(), roleAcl.getId()) &&
            Objects.equals(getAclId(), roleAcl.getAclId()) &&
            Objects.equals(getDescription(), roleAcl.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), role.getRoleId(), getAclId(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "RoleAcl{" +
            "id=" +
            id +
            ", roleId='" +
            role.getRoleId() +
            '\'' +
            ", aclId='" +
            aclId +
            '\'' +
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
