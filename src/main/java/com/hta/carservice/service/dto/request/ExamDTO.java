package com.hta.carservice.service.dto.request;

import com.hta.carservice.domain.ExamType;
import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;
import javax.persistence.*;

public class ExamDTO extends BaseDTO {

    private Long examId;
    private String examCode;
    private ExamType examType;
    private String centerCode;
    private Integer examDate;
    private String releaseNumber;
    private Integer releaseDate;
    private Short examineeNumber;

    public ExamDTO(
        Long examId,
        String examCode,
        ExamType examType,
        String centerCode,
        Integer examDate,
        String releaseNumber,
        Integer releaseDate,
        Short examineeNumber
    ) {
        this.examId = examId;
        this.examCode = examCode;
        this.examType = examType;
        this.centerCode = centerCode;
        this.examDate = examDate;
        this.releaseNumber = releaseNumber;
        this.releaseDate = releaseDate;
        this.examineeNumber = examineeNumber;
    }

    public ExamDTO() {}

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
        if (!(o instanceof ExamDTO)) return false;
        if (!super.equals(o)) return false;
        ExamDTO examDTO = (ExamDTO) o;
        return (
            Objects.equals(getExamId(), examDTO.getExamId()) &&
            Objects.equals(getExamCode(), examDTO.getExamCode()) &&
            Objects.equals(getExamType(), examDTO.getExamType()) &&
            Objects.equals(getCenterCode(), examDTO.getCenterCode()) &&
            Objects.equals(getExamDate(), examDTO.getExamDate()) &&
            Objects.equals(getReleaseNumber(), examDTO.getReleaseNumber()) &&
            Objects.equals(getReleaseDate(), examDTO.getReleaseDate()) &&
            Objects.equals(getExamineeNumber(), examDTO.getExamineeNumber())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            super.hashCode(),
            getExamId(),
            getExamCode(),
            getExamType(),
            getCenterCode(),
            getExamDate(),
            getReleaseNumber(),
            getReleaseDate(),
            getExamineeNumber()
        );
    }

    @Override
    public String toString() {
        return (
            "ExamDTO{" +
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
}
