package com.customer.customerservivce.repositoryservices;

import java.util.List;

import com.customer.customerservivce.dto.Customer;
import com.customer.customerservivce.models.CustomerEntity;

public interface CustomerRepoService {
    
    void InsertNewCustomer(String name ,String  Addresss );


    List<CustomerEntity> GetListofALLCustomers();

    CustomerEntity GetCustomerbyID(int customerid);
    


}
