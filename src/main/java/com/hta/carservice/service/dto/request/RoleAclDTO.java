package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Role;
import java.util.Objects;
import javax.persistence.*;

public class RoleAclDTO {

    private Long id;

    private Role role;

    private String aclId;

    private String description;

    public RoleAclDTO(Long id, Role role, String aclId, String description) {
        this.id = id;
        this.role = role;
        this.aclId = aclId;
        this.description = description;
    }

    public RoleAclDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
        if (!(o instanceof RoleAclDTO)) return false;
        RoleAclDTO that = (RoleAclDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getRole(), that.getRole()) &&
            Objects.equals(getAclId(), that.getAclId()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getRole(), getAclId(), getDescription());
    }

    @Override
    public String toString() {
        return "RoleAclDTO{" + "id=" + id + ", role=" + role + ", aclId='" + aclId + '\'' + ", description='" + description + '\'' + '}';
    }
}
