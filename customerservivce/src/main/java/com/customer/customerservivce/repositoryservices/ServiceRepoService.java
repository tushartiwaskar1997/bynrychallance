package com.customer.customerservivce.repositoryservices;

import java.util.List;

import com.customer.customerservivce.models.ServiceTypesEntity;

public interface ServiceRepoService {
    

    void InsertNewService(String Servicename);

    List<ServiceTypesEntity> GetListofSrevices();

    ServiceTypesEntity  GetServiceBYId(int id);
    




}
