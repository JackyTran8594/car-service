package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.User;
import java.util.Objects;
import javax.persistence.*;

public class UserAclDTO extends BaseDTO {

    private Long id;

    private Long userId;

    private String aclId;

    private Short accessLevel;

    private String description;

    public UserAclDTO(Long id, Long userId, String aclId, Short accessLevel, String description) {
        this.id = id;
        this.userId = userId;
        this.aclId = aclId;
        this.accessLevel = accessLevel;
        this.description = description;
    }

    public UserAclDTO() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
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
        if (!(o instanceof UserAclDTO)) return false;
        if (!super.equals(o)) return false;
        UserAclDTO that = (UserAclDTO) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getUserId(), that.getUserId()) &&
            Objects.equals(getAclId(), that.getAclId()) &&
            Objects.equals(getAccessLevel(), that.getAccessLevel()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getId(), getUserId(), getAclId(), getAccessLevel(), getDescription());
    }

    @Override
    public String toString() {
        return (
            "UserAclDTO{" +
            "id=" +
            id +
            ", userId=" +
            userId +
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
}
