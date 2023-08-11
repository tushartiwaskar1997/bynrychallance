package com.customer.customerservivce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.customer.customerservivce.models.ServiceTypesEntity;

@EnableJpaRepositories
public interface ServiceRepository extends JpaRepository<ServiceTypesEntity,String> {
    
    @Query(value = "Select * from servicetyp ",nativeQuery = true)
    List<ServiceTypesEntity> getALLServices();

    @Query(value="select * from servicetyp where serviceid =?1",nativeQuery = true)
    ServiceTypesEntity getServiceAsperid(int serviceid);

    @Query(value="Select * from servicetyp where name LIKE  '%?1%'")
    ServiceTypesEntity findserviceaspername(String name);
}
