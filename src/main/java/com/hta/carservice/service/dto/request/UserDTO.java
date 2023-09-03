package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.Role;
import com.hta.carservice.domain.User;
import com.hta.carservice.domain.UserAcl;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

/**
 * A DTO representing a user, with only the public attributes.
 */
public class UserDTO extends BaseDTO implements Serializable {

    private Long id;

    private String userId;

    private Long roleId;

    private String password;
    private String tempPassword;

    private Short isActive;

    private String displayName;
    private String description;

    public UserDTO(
        Long id,
        String userId,
        Long roleId,
        String password,
        String tempPassword,
        Short isActive,
        String displayName,
        String description
    ) {
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
        this.password = password;
        this.tempPassword = tempPassword;
        this.isActive = isActive;
        this.displayName = displayName;
        this.description = description;
    }

    public UserDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTempPassword() {
        return tempPassword;
    }

    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword;
    }

    public Short getIsActive() {
        return isActive;
    }

    public void setIsActive(Short isActive) {
        this.isActive = isActive;
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
        if (!(o instanceof UserDTO)) return false;
        if (!super.equals(o)) return false;
        UserDTO userDTO = (UserDTO) o;
        return (
            Objects.equals(getId(), userDTO.getId()) &&
            Objects.equals(getUserId(), userDTO.getUserId()) &&
            Objects.equals(getRoleId(), userDTO.getRoleId()) &&
            Objects.equals(getPassword(), userDTO.getPassword()) &&
            Objects.equals(getTempPassword(), userDTO.getTempPassword()) &&
            Objects.equals(getIsActive(), userDTO.getIsActive()) &&
            Objects.equals(getDisplayName(), userDTO.getDisplayName()) &&
            Objects.equals(getDescription(), userDTO.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            getId(),
            getUserId(),
            getRoleId(),
            getPassword(),
            getTempPassword(),
            getIsActive(),
            getDisplayName(),
            getDescription()
        );
    }

    @Override
    public String toString() {
        return (
            "UserDTO{" +
            "id=" +
            id +
            ", userId='" +
            userId +
            '\'' +
            ", roleId=" +
            roleId +
            ", password='" +
            password +
            '\'' +
            ", tempPassword='" +
            tempPassword +
            '\'' +
            ", isActive=" +
            isActive +
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
