package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "license_class")
public class LicenseClass extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "license_class_seq")
    @SequenceGenerator(name = "license_class_seq")
    private Long id;

    @Id
    @Column(name = "license_code", length = 8)
    private String licenseCode;

    @Column(name = "description", columnDefinition = "nvarchar(64)")
    private String description;

    @OneToMany(mappedBy = "licenseClass", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<Examinee> examinees = new HashSet<>();

    public LicenseClass() {}

    public LicenseClass(String licenseCode, String description) {
        this.licenseCode = licenseCode;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLicenseCode() {
        return licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
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
        if (!(o instanceof LicenseClass)) return false;
        LicenseClass that = (LicenseClass) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getLicenseCode(), that.getLicenseCode()) &&
            Objects.equals(getDescription(), that.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getLicenseCode(), getDescription());
    }

    @Override
    public String toString() {
        return "LicenseClass{" + "id=" + id + ", licenseCode='" + licenseCode + '\'' + ", description='" + description + '\'' + '}';
    }

    @Override
    public Long getId() {
        return id;
    }
}
