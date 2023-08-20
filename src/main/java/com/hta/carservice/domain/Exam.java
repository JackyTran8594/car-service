package com.hta.carservice.domain;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Entity
@Table(name = "exam")
public class Exam extends AbstractAuditingEntity<Long> implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "exam_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long examId;

    @Column(name = "exam_code", length = 16)
    private String examCode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "exam_type", nullable = false)
    private ExamType examType;

    @Column(name = "center_code", length = 8)
    private String centerCode;

    @Column(name = "exam_date")
    private Integer examDate;

    @Column(name = "release_number", length = 40)
    private String releaseNumber;

    @Column(name = "release_date")
    private Integer releaseDate;

    @Column(name = "examinee_number")
    private Short examineeNumber;

    public Long getExamId() {
        return examId;
    }

    public void setExamId(Long examId) {
        this.examId = examId;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    public ExamType getExamType() {
        return examType;
    }

    public void setExamType(ExamType examType) {
        this.examType = examType;
    }

    public String getCenterCode() {
        return centerCode;
    }

    public void setCenterCode(String centerCode) {
        this.centerCode = centerCode;
    }

    public Integer getExamDate() {
        return examDate;
    }

    public void setExamDate(Integer examDate) {
        this.examDate = examDate;
    }

    public String getReleaseNumber() {
        return releaseNumber;
    }

    public void setReleaseNumber(String releaseNumber) {
        this.releaseNumber = releaseNumber;
    }

    public Integer getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Integer releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Short getExamineeNumber() {
        return examineeNumber;
    }

    public void setExamineeNumber(Short examineeNumber) {
        this.examineeNumber = examineeNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Exam)) return false;
        Exam exam = (Exam) o;
        return (
            Objects.equals(getExamId(), exam.getExamId()) &&
            Objects.equals(examCode, exam.examCode) &&
            Objects.equals(examType, exam.examType) &&
            Objects.equals(centerCode, exam.centerCode) &&
            Objects.equals(examDate, exam.examDate) &&
            Objects.equals(releaseNumber, exam.releaseNumber) &&
            Objects.equals(releaseDate, exam.releaseDate) &&
            Objects.equals(examineeNumber, exam.examineeNumber)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExamId(), examCode, examType, centerCode, examDate, releaseNumber, releaseDate, examineeNumber);
    }

    public Exam(
        Long examId,
        String examCode,
        String centerCode,
        Integer examDate,
        String releaseNumber,
        Integer releaseDate,
        Short examineeNumber
    ) {
        this.examId = examId;
        this.examCode = examCode;
        this.centerCode = centerCode;
        this.examDate = examDate;
        this.releaseNumber = releaseNumber;
        this.releaseDate = releaseDate;
        this.examineeNumber = examineeNumber;
    }

    public Exam() {}

    @Override
    public String toString() {
        return (
            "Exam{" +
            "examId=" +
            examId +
            ", examCode='" +
            examCode +
            '\'' +
            ", examType=" +
            examType +
            ", centerCode='" +
            centerCode +
            '\'' +
            ", examDate=" +
            examDate +
            ", releaseNumber='" +
            releaseNumber +
            '\'' +
            ", releaseDate=" +
            releaseDate +
            ", examineeNumber=" +
            examineeNumber +
            '}'
        );
    }

    @Override
    public Long getId() {
        return examId;
    }
}
