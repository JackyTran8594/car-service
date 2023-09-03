package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.RoleAcl;
import com.hta.carservice.domain.User;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

public class RoleDTO extends BaseDTO {

    private Long id;

    private String roleId;

    private String displayName;

    private String description;

    public RoleDTO(Long id, String roleId, String displayName, String description) {
        this.id = id;
        this.roleId = roleId;
        this.displayName = displayName;
        this.description = description;
    }

    public RoleDTO() {}

    public Long getId() {
        return id;
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
        if (!(o instanceof RoleDTO)) return false;
        if (!super.equals(o)) return false;
        RoleDTO roleDTO = (RoleDTO) o;
        return (
            Objects.equals(getId(), roleDTO.getId()) &&
            Objects.equals(getRoleId(), roleDTO.getRoleId()) &&
            Objects.equals(getDisplayName(), roleDTO.getDisplayName()) &&
            Objects.equals(getDescription(), roleDTO.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getRoleId(), getDisplayName(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "RoleDTO{" +
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
}
