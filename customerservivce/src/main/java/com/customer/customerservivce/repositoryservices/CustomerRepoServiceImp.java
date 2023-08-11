package com.customer.customerservivce.repositoryservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.customer.customerservivce.models.CustomerEntity;
import com.customer.customerservivce.repository.CustomerRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
@Repository
public class CustomerRepoServiceImp implements CustomerRepoService {

    @Autowired
    CustomerRepository customerRepository;

    @PersistenceContext
    private EntityManager customerEntityManager;  
    
    @Override
    public void InsertNewCustomer(String name, String Addresss) {

     
        


       customerEntityManager.createNativeQuery("INSERT INTO `customer`(  `name`, `Address`)VALUES(?,?)")
       .setParameter(1, name)
       .setParameter(2,Addresss).executeUpdate();
    }

    @Override
    public List<CustomerEntity> GetListofALLCustomers() {
       
       return   customerRepository.getALlCustomer();
    }

    @Override
    public CustomerEntity GetCustomerbyID(int customerid) {
    
        return customerRepository.getCustomerbyId(customerid);
    }
    
}
