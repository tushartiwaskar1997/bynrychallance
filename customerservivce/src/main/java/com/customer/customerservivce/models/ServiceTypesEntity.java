package com.customer.customerservivce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="servicetyp")
@Data
public class ServiceTypesEntity {
    
    @Id
    private int serviceid;

    private String servicename;



}
