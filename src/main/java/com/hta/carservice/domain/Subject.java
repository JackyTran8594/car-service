package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "subject")
public class Subject extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "subject_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    @Column(name = "description", columnDefinition = "nvarchar(64)")
    private String description;

    @OneToMany(mappedBy = "subject", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<ExamineeResult> examineeResults = new HashSet<>();

    @OneToMany(mappedBy = "subject", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<Reference> references = new HashSet<>();

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Subject() {}

    public Subject(Long subjectId, String description) {
        this.subjectId = subjectId;
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Subject)) return false;
        Subject subject = (Subject) o;
        return Objects.equals(getSubjectId(), subject.getSubjectId()) && Objects.equals(getDescription(), subject.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSubjectId(), getDescription());
    }

    @Override
    public String toString() {
        return "Subject{" + "subjectId=" + subjectId + ", description='" + description + '\'' + '}';
    }

    @Override
    public Long getId() {
        return subjectId;
    }
}
