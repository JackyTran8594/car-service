package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "national")
public class National extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "national_seq")
    @SequenceGenerator(name = "national_seq")
    private Long id;

    @Id
    @Column(name = "national_code", length = 8)
    private String nationalCode;

    @Column(name = "description", columnDefinition = "nvarchar(64)")
    private String description;

    @OneToMany(mappedBy = "national", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<Examinee> examinees = new HashSet<>();

    public National() {}

    public National(String nationalCode, String description) {
        this.nationalCode = nationalCode;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
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
        if (!(o instanceof National)) return false;
        National national = (National) o;
        return (
            Objects.equals(getId(), national.getId()) &&
            Objects.equals(getNationalCode(), national.getNationalCode()) &&
            Objects.equals(getDescription(), national.getDescription())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getNationalCode(), getDescription());
    }

    @Override
    public String toString() {
        return "National{" + "id=" + id + ", nationalCode='" + nationalCode + '\'' + ", description='" + description + '\'' + '}';
    }

    @Override
    public Long getId() {
        return id;
    }
}
