package com.hta.carservice.service.dto.response;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;

public class ResponseDataObject<T> {

    public String error;
    public String message;
    public Integer status;
    public LocalDateTime timestamp;
    public List<T> listData;
    public T data;
    public Page<T> pagingData;

    public ResponseDataObject() {
        this.timestamp = LocalDateTime.now();
    }

    public void success() {
        this.message = "Successful";
        this.status = HttpStatus.OK.value();
    }

    public void initData(T data) {
        this.data = data;
        this.success();
    }

    public void initListData(List<T> listData) {
        this.listData = listData;
        this.success();
    }

    public ResponseDataObject(
        String error,
        String message,
        Integer status,
        LocalDateTime timestamp,
        List<T> listData,
        T data,
        Page<T> pagingData
    ) {
        this.error = error;
        this.message = message;
        this.status = status;
        this.timestamp = timestamp;
        this.listData = listData;
        this.data = data;
        this.pagingData = pagingData;
    }

    public String getError() {
        return error;
    }

    public String getMessage() {
        return message;
    }

    public Integer getStatus() {
        return status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public List<T> getListData() {
        return listData;
    }

    public T getData() {
        return data;
    }

    public Page<T> getPagingData() {
        return pagingData;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public void setListData(List<T> listData) {
        this.listData = listData;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setPagingData(Page<T> pagingData) {
        this.pagingData = pagingData;
    }
}
