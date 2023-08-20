package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "examinee_result")
@IdClass(ExamineeResult.class)
public class ExamineeResult extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "examinee_result_seq")
    @SequenceGenerator(name = "examinee_result_seq")
    private Long id;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "examinee_id", nullable = false)
    private Examinee examinee;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_id", nullable = false)
    private Subject subject;

    @Column(name = "result")
    private Short result;

    public ExamineeResult() {}

    public ExamineeResult(Short result) {
        this.result = result;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getResult() {
        return result;
    }

    public void setResult(Short result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ExamineeResult)) return false;
        ExamineeResult that = (ExamineeResult) o;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getResult(), that.getResult());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getResult());
    }

    @Override
    public String toString() {
        return (
            "ExamineeResult{" +
            "id=" +
            id +
            ", examineeId=" +
            examinee.getExamineeId() +
            ", subjectId=" +
            subject.getSubjectId() +
            ", result=" +
            result +
            '}'
        );
    }

    @Override
    public Long getId() {
        return id;
    }
}
