package com.customer.customerservivce.dto;

public class Customer {
    
    private String customerid;
    private String name;
    private String Address;

    public Customer(){}

    public Customer(String customerid, String name, String address) {
        super();
        this.customerid = customerid;
        this.name = name;
        Address = address;
    }

    public String getCustomerid() {
        return customerid;
    }

    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    };
    
    
}
