package com.hta.carservice.service.dto;

import com.hta.carservice.config.Constants;
import com.hta.carservice.domain.Authority;
import com.hta.carservice.domain.User;
import com.hta.carservice.service.dto.request.BaseDTO;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import javax.validation.constraints.*;

/**
 * A DTO representing a user, with his authorities.
 */
public class AdminUserDTO extends BaseDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id;

    @NotBlank
    @Pattern(regexp = Constants.LOGIN_REGEX)
    @Size(min = 1, max = 50)
    private String login;

    @Size(max = 50)
    private String firstName;

    @Size(max = 50)
    private String lastName;

    @Email
    @Size(min = 5, max = 254)
    private String email;

    @Size(max = 256)
    private String imageUrl;

    private boolean activated = false;

    @Size(min = 2, max = 10)
    private String langKey;

    private Set<String> authorities;

    public AdminUserDTO() {
        // Empty constructor needed for Jackson.
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public boolean isActivated() {
        return activated;
    }

    public String getLangKey() {
        return langKey;
    }

    public Set<String> getAuthorities() {
        return authorities;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    public void setLangKey(String langKey) {
        this.langKey = langKey;
    }

    public void setAuthorities(Set<String> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdminUserDTO)) return false;
        if (!super.equals(o)) return false;
        AdminUserDTO that = (AdminUserDTO) o;
        return (
            isActivated() == that.isActivated() &&
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getLogin(), that.getLogin()) &&
            Objects.equals(getFirstName(), that.getFirstName()) &&
            Objects.equals(getLastName(), that.getLastName()) &&
            Objects.equals(getEmail(), that.getEmail()) &&
            Objects.equals(getImageUrl(), that.getImageUrl()) &&
            Objects.equals(getLangKey(), that.getLangKey()) &&
            Objects.equals(getAuthorities(), that.getAuthorities())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            getId(),
            getLogin(),
            getFirstName(),
            getLastName(),
            getEmail(),
            getImageUrl(),
            isActivated(),
            getLangKey(),
            getAuthorities()
        );
    }

    @Override
    public String toString() {
        return (
            "AdminUserDTO{" +
            "id=" +
            id +
            ", login='" +
            login +
            '\'' +
            ", firstName='" +
            firstName +
            '\'' +
            ", lastName='" +
            lastName +
            '\'' +
            ", email='" +
            email +
            '\'' +
            ", imageUrl='" +
            imageUrl +
            '\'' +
            ", activated=" +
            activated +
            ", langKey='" +
            langKey +
            '\'' +
            ", authorities=" +
            authorities +
            '}'
        );
    }
}
