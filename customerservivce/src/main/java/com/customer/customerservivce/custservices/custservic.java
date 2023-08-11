package com.customer.customerservivce.custservices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.customer.customerservivce.dto.serviceStatus;
import com.customer.customerservivce.models.CustomerEntity;
import com.customer.customerservivce.models.ServiceTypesEntity;
import com.customer.customerservivce.models.StatusEntity;

public interface custservic {

    List<ServiceTypesEntity> GetTheListofALLServices();

    int GettheServiceidfromname(String  name);

    List<CustomerEntity> Getthecustomerlist();

    void addnewService(String name);

    void addnewcustomer(String name , String Address);

    int getcustomerid(String name);

    void addnewservicerequest(int customerid,int serviceid,String status, LocalDate requesDate,LocalTime requestTime );

    void updatethestatusofservicerequest(int customerid ,LocalDate requestdate,String statusneedtochange);

    StatusEntity GettheDetailsofServiceRequested(int customerid ,LocalDate requestdate);
}
