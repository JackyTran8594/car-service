package com.hta.carservice.service.criteria;

import java.util.Objects;

public class SearchCriteria {

    private String key;
    private String operation;
    private Object value;
    private Object dataType;

    public SearchCriteria(String key, String operation, Object value, Object dataType) {
        this.key = key;
        this.operation = operation;
        this.value = value;
        this.dataType = dataType;
    }

    public SearchCriteria(String key, String operation, Object value) {
        this.key = key;
        this.operation = operation;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Object getDataType() {
        return dataType;
    }

    public void setDataType(Object dataType) {
        this.dataType = dataType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SearchCriteria)) return false;
        SearchCriteria that = (SearchCriteria) o;
        return (
            Objects.equals(getKey(), that.getKey()) &&
            Objects.equals(getOperation(), that.getOperation()) &&
            Objects.equals(getValue(), that.getValue()) &&
            Objects.equals(getDataType(), that.getDataType())
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(getKey(), getOperation(), getValue(), getDataType());
    }

    @Override
    public String toString() {
        return (
            "SearchCriteria{" +
            "key='" +
            key +
            '\'' +
            ", operation='" +
            operation +
            '\'' +
            ", value=" +
            value +
            ", dataType=" +
            dataType +
            '}'
        );
    }
}
