package com.example.springdatajpa.model;

import java.util.Date;
import java.util.List;

public class BaseResponse {
    private String status;
    private List<String> error;
    private String timeStamp;
    private Object responseData;

    public BaseResponse() {
        this.timeStamp = new Date().toString();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResponseData() {
        return responseData;
    }

    public void setResponseData(Object responseData) {
        this.responseData = responseData;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public List<String> getError() {
        return error;
    }

    public void setError(List<String> error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "BaseResponse [status=" + status + ", error=" + error + ", timeStamp=" + timeStamp + ", responseData="
                + responseData + "]";
    }
}
