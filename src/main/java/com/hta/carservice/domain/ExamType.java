package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.persistence.*;

@Entity
@Table(name = "exam_type")
public class ExamType extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "exam_type_seq")
    @SequenceGenerator(name = "exam_type_seq")
    private Long id;

    @Id
    @Column(name = "exam_type")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short examType;

    @Column(name = "description", columnDefinition = "nvarchar(128)")
    private String description;

    @OneToMany(mappedBy = "examType", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
    private Set<Exam> exam = new HashSet<>();

    public ExamType() {}

    public ExamType(Short examType, String description) {
        this.examType = examType;
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getExamType() {
        return examType;
    }

    public void setExamType(Short examType) {
        this.examType = examType;
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
        if (!(o instanceof ExamType)) return false;
        ExamType examType1 = (ExamType) o;
        return (
            Objects.equals(getId(), examType1.getId()) &&
            Objects.equals(getExamType(), examType1.getExamType()) &&
            Objects.equals(getDescription(), examType1.getDescription())
        );
    }

    @Override
    public String toString() {
        return "ExamType{" + "id=" + id + ", examType=" + examType + ", description='" + description + '\'' + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getExamType(), getDescription());
    }

    @Override
    public Long getId() {
        return id;
    }
}
