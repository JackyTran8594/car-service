package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "administrative_unit")
@IdClass(AdministrativeUnit.class)
public class AdministrativeUnit extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "administrative_unit_seq")
    @SequenceGenerator(name = "administrative_unit_seq")
    private Long id;

    @Id
    @Column(name = "administrative_id", length = 16)
    private String administrativeId;

    @Id
    @Column(name = "parent_code", length = 16)
    private String parentCode;

    @Column(name = "full_code", length = 16)
    private String fullCode;

    @Column(name = "official_name", columnDefinition = "nvarchar(128)")
    private String officialName;

    @Column(name = "short_name", length = 64)
    private String shortName;

    @Column(name = "classify_id", length = 8)
    private String classifyId;

    public AdministrativeUnit() {}

    public AdministrativeUnit(
        String administrativeId,
        String parentCode,
        String fullCode,
        String officialName,
        String shortName,
        String classifyId
    ) {
        this.administrativeId = administrativeId;
        this.parentCode = parentCode;
        this.fullCode = fullCode;
        this.officialName = officialName;
        this.shortName = shortName;
        this.classifyId = classifyId;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdministrativeId() {
        return administrativeId;
    }

    public void setAdministrativeId(String administrativeId) {
        this.administrativeId = administrativeId;
    }

    public String getParentCode() {
        return parentCode;
    }

    public void setParentCode(String parentCode) {
        this.parentCode = parentCode;
    }

    public String getFullCode() {
        return fullCode;
    }

    public void setFullCode(String fullCode) {
        this.fullCode = fullCode;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getClassifyId() {
        return classifyId;
    }

    public void setClassifyId(String classifyId) {
        this.classifyId = classifyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AdministrativeUnit)) return false;
        AdministrativeUnit that = (AdministrativeUnit) o;
        return (
            Objects.equals(getId(), that.getId()) &&
            Objects.equals(getAdministrativeId(), that.getAdministrativeId()) &&
            Objects.equals(getParentCode(), that.getParentCode()) &&
            Objects.equals(getFullCode(), that.getFullCode()) &&
            Objects.equals(getOfficialName(), that.getOfficialName()) &&
            Objects.equals(getShortName(), that.getShortName()) &&
            Objects.equals(getClassifyId(), that.getClassifyId())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            getId(),
            getAdministrativeId(),
            getParentCode(),
            getFullCode(),
            getOfficialName(),
            getShortName(),
            getClassifyId()
        );
    }

    @Override
    public String toString() {
        return (
            "AdministrativeUnit{" +
            "id=" +
            id +
            ", administrativeId='" +
            administrativeId +
            '\'' +
            ", parentCode='" +
            parentCode +
            '\'' +
            ", fullCode='" +
            fullCode +
            '\'' +
            ", officialName='" +
            officialName +
            '\'' +
            ", shortName='" +
            shortName +
            '\'' +
            ", classifyId='" +
            classifyId +
            '\'' +
            '}'
        );
    }

    @Override
    public Long getId() {
        return null;
    }
}
