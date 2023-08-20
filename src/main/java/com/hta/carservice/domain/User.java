package com.hta.carservice.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hta.carservice.config.Constants;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.BatchSize;

/**
 * A user.
 */
@Entity
@Table(name = "user_entity")
public class User extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_entity_seq")
    @SequenceGenerator(name = "user_entity_seq")
    private Long id;

    @Id
    @Column(name = "user_id", length = 32)
    private String userId;

    //    @Column(name = "role_id", length = 32)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "role_id")
    private Role role;

    @Column(name = "password", length = 32)
    private String password;

    @Column(name = "temp_password", length = 32)
    private String tempPassword;

    @Column(name = "is_active")
    private Short isActive;

    @Column(name = "display_name", columnDefinition = "nvarchar(40)")
    private String displayName;

    @Column(name = "description", columnDefinition = "nvarchar(512)")
    private String description;

    @OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<UserAcl> userAcls = new HashSet<>();

    public User() {}

    public User(Long id, String userId, String password, String tempPassword, Short isActive, String displayName, String description) {
        this.id = id;
        this.userId = userId;
        this.password = password;
        this.tempPassword = tempPassword;
        this.isActive = isActive;
        this.displayName = displayName;
        this.description = description;
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
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return (
            Objects.equals(getId(), user.getId()) &&
            Objects.equals(getUserId(), user.getUserId()) &&
            Objects.equals(getPassword(), user.getPassword()) &&
            Objects.equals(getTempPassword(), user.getTempPassword()) &&
            Objects.equals(getIsActive(), user.getIsActive()) &&
            Objects.equals(getDisplayName(), user.getDisplayName()) &&
            Objects.equals(getDescription(), user.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getId(),
            getUserId(),
            role.getRoleId(),
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
            "User{" +
            "id=" +
            id +
            ", userId='" +
            userId +
            '\'' +
            ", roleId='" +
            role.getRoleId() +
            '\'' +
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

    @Override
    public Long getId() {
        return id;
    }
}
