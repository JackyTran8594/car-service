package com.hta.carservice.domain;

import java.io.Serializable;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "examinee")
public class Examinee extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examinee_seq")
    @SequenceGenerator(name = "examinee_seq")
    private Long id;

    @Id
    @Column(name = "examinee_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examineeId;

    @Column(name = "examinee_code")
    private Short examineeCode;

    @Column(name = "center_code", length = 8)
    private String centerCode;

    @Column(name = "unit_code", length = 8)
    private String unitCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "national_code", nullable = true)
    private National national;

    @Column(name = "address_code", length = 12)
    private String addressCode;

    @Column(name = "gender")
    private Short gender;

    @Column(name = "birth_date")
    private Integer birthDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "license_code", nullable = true)
    private LicenseClass licenseClass;

    @Column(name = "first_name", length = 64)
    private String firstName;

    @Column(name = "last_name", length = 128)
    private String lastName;

    @Column(name = "full_name", length = 256)
    private String fullName;

    @Column(name = "exam_content")
    private Short examContent;

    @Column(name = "image")
    @Lob
    private Blob image;

    @OneToMany(mappedBy = "examinee", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<ExamineeResult> examineeResults = new HashSet<>();

    public Examinee(
        Long examineeId,
        Short examineeCode,
        String centerCode,
        String unitCode,
        String addressCode,
        Short gender,
        Integer birthDate,
        String firstName,
        String lastName,
        String fullName,
        Short examContent,
        Blob image
    ) {
        this.examineeId = examineeId;
        this.examineeCode = examineeCode;
        this.centerCode = centerCode;
        this.unitCode = unitCode;
        this.addressCode = addressCode;
        this.gender = gender;
        this.birthDate = birthDate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.examContent = examContent;
        this.image = image;
    }

    public Examinee() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getExamineeId() {
        return examineeId;
    }

    public void setExamineeId(Long examineeId) {
        this.examineeId = examineeId;
    }

    public Short getExamineeCode() {
        return examineeCode;
    }

    public void setExamineeCode(Short examineeCode) {
        this.examineeCode = examineeCode;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public String getUnitCode() {
        return unitCode;
    }

    public void setUnitCode(String unitCode) {
        this.unitCode = unitCode;
    }

    public String getAddressCode() {
        return addressCode;
    }

    public void setAddressCode(String addressCode) {
        this.addressCode = addressCode;
    }

    public Short getGender() {
        return gender;
    }

    public void setGender(Short gender) {
        this.gender = gender;
    }

    public Integer getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Integer birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Short getExamContent() {
        return examContent;
    }

    public void setExamContent(Short examContent) {
        this.examContent = examContent;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Examinee)) return false;
        Examinee examinee = (Examinee) o;
        return (
            Objects.equals(getId(), examinee.getId()) &&
            Objects.equals(getExamineeId(), examinee.getExamineeId()) &&
            Objects.equals(getExamineeCode(), examinee.getExamineeCode()) &&
            Objects.equals(getCenterCode(), examinee.getCenterCode()) &&
            Objects.equals(getUnitCode(), examinee.getUnitCode()) &&
            Objects.equals(getAddressCode(), examinee.getAddressCode()) &&
            Objects.equals(getGender(), examinee.getGender()) &&
            Objects.equals(getBirthDate(), examinee.getBirthDate()) &&
            Objects.equals(getFirstName(), examinee.getFirstName()) &&
            Objects.equals(getLastName(), examinee.getLastName()) &&
            Objects.equals(getFullName(), examinee.getFullName()) &&
            Objects.equals(getExamContent(), examinee.getExamContent()) &&
            Objects.equals(getImage(), examinee.getImage())
        );
    }

    @Override
    public String toString() {
        return (
            "Examinee{" +
            "id=" +
            id +
            ", examineeId=" +
            examineeId +
            ", examineeCode=" +
            examineeCode +
            ", centerCode='" +
            centerCode +
            '\'' +
            ", unitCode='" +
            unitCode +
            '\'' +
            ", nationalCode='" +
            national.getNationalCode() +
            '\'' +
            ", addressCode='" +
            addressCode +
            '\'' +
            ", gender=" +
            gender +
            ", birthDate=" +
            birthDate +
            ", licenseCode='" +
            licenseClass.getLicenseCode() +
            '\'' +
            ", firstName='" +
            firstName +
            '\'' +
            ", lastName='" +
            lastName +
            '\'' +
            ", fullName='" +
            fullName +
            '\'' +
            ", examContent=" +
            examContent +
            ", image=" +
            image +
            '}'
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getId(),
            getExamineeId(),
            getExamineeCode(),
            getCenterCode(),
            getUnitCode(),
            national.getNationalCode(),
            getAddressCode(),
            getGender(),
            getBirthDate(),
            licenseClass.getLicenseCode(),
            getFirstName(),
            getLastName(),
            getFullName(),
            getExamContent(),
            getImage()
        );
    }

    @Override
    public Long getId() {
        return null;
    }
}
