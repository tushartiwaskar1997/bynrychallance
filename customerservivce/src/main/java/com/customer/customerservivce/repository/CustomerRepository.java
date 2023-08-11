package com.customer.customerservivce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.customer.customerservivce.models.CustomerEntity;


@EnableJpaRepositories
public interface CustomerRepository extends JpaRepository<CustomerEntity,String> {
    
    @Query(value="Select * from customer  where id=?1",nativeQuery = true)
    CustomerEntity  getCustomerbyId(int customerid);

    @Query(value = "Select * from customer ",nativeQuery = true)
    List<CustomerEntity> getALlCustomer();  


}
