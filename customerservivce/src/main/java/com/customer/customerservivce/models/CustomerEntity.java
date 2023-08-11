package com.customer.customerservivce.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="customer")
@Data
public class CustomerEntity {
    
    @Id
    private int customerid;

    private String name;

    private String  Address;


}
