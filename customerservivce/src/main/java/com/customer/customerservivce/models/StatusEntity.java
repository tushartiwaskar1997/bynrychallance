package com.customer.customerservivce.models;

import java.time.LocalDate;
import java.time.LocalTime;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="status")
@Data
public class StatusEntity {
    
    @Id
    private int  statusid;

    private int customerid;

    private int serviceid;

    private String  serviceStatus;

    private LocalDate reqDate;

    private LocalTime reqTime;

    private LocalDate compDate;

    private LocalTime  compTime;

}
