package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * A user.
 */
@Entity
@Table(name = "role")
public class Role extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "role_seq")
    @SequenceGenerator(name = "role_seq")
    private Long id;

    @Id
    @Column(name = "role_id", length = 32)
    private String roleId;

    @Column(name = "display_name", columnDefinition = "nvarchar(256)")
    private String displayName;

    @Column(name = "description", columnDefinition = "nvarchar(512)")
    private String description;

    @OneToMany(mappedBy = "role", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();

    @OneToMany(mappedBy = "role", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<RoleAcl> roleAcls = new HashSet<>();

    public Role() {}

    public Role(String roleId, String displayName, String description) {
        this.roleId = roleId;
        this.displayName = displayName;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
        if (!(o instanceof Role)) return false;
        Role role = (Role) o;
        return (
            Objects.equals(getId(), role.getId()) &&
            Objects.equals(getRoleId(), role.getRoleId()) &&
            Objects.equals(getDisplayName(), role.getDisplayName()) &&
            Objects.equals(getDescription(), role.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRoleId(), getDisplayName(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "Role{" +
            "id=" +
            id +
            ", roleId='" +
            roleId +
            '\'' +
            ", displayName='" +
            displayName +
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
