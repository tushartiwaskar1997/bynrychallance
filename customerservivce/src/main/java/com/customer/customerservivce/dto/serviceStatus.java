package com.customer.customerservivce.dto;

import java.time.LocalTime;
import java.util.Date;

public class serviceStatus {
    
    private static enum StatusType {
        Completed,
        Pending
    }

    private String statusid;
    private String customerid;
    private String serviceid;
    private StatusType statusType;
    private Date reqdate;
    private LocalTime reqTime;
    private Date  compdate;
    private LocalTime compTime;

    public serviceStatus(){}

    public serviceStatus(String statusid, String customerid, String serviceid, StatusType statusType, Date reqdate,
            LocalTime reqTime, Date compdate, LocalTime compTime) {
                super();
        this.statusid = statusid;
        this.customerid = customerid;
        this.serviceid = serviceid;
        this.statusType = statusType;
        this.reqdate = reqdate;
        this.reqTime = reqTime;
        this.compdate = compdate;
        this.compTime = compTime;
    }

    public String getStatusid() {
        return statusid;
    }

    public void setStatusid(String statusid) {
        this.statusid = statusid;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public StatusType getStatusType() {
        return statusType;
    }

    public void setStatusType(StatusType statusType) {
        this.statusType = statusType;
    }

    public Date getReqdate() {
        return reqdate;
    }

    public void setReqdate(Date reqdate) {
        this.reqdate = reqdate;
    }

    public LocalTime getReqTime() {
        return reqTime;
    }

    public void setReqTime(LocalTime reqTime) {
        this.reqTime = reqTime;
    }

    public Date getCompdate() {
        return compdate;
    }

    public void setCompdate(Date compdate) {
        this.compdate = compdate;
    }

    public LocalTime getCompTime() {
        return compTime;
    }

    public void setCompTime(LocalTime compTime) {
        this.compTime = compTime;
    };
    
    
}
