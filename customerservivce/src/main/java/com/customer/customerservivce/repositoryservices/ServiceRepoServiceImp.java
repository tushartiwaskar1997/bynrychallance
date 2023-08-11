package com.customer.customerservivce.repositoryservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customer.customerservivce.models.ServiceTypesEntity;
import com.customer.customerservivce.repository.ServiceRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class ServiceRepoServiceImp  implements  ServiceRepoService{
    @PersistenceContext
    private EntityManager  sManager;

    @Autowired
    ServiceRepository serviceRepository ; 

    @Override
    public void InsertNewService(String Servicename) {
        
        sManager.createNativeQuery("INSERT INTO `servicetyp`(  `name``)VALUES(?,?)")
        .setParameter(1, Servicename).executeUpdate();

    }

    @Override
    public List<ServiceTypesEntity> GetListofSrevices() {
        return  serviceRepository.getALLServices();
    }

    @Override
    public ServiceTypesEntity GetServiceBYId(int id) {
     
        return serviceRepository.getServiceAsperid(id);
    }
    
}
