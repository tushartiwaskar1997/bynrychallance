package com.customer.customerservivce.repositoryservices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.customer.customerservivce.models.StatusEntity;
import com.customer.customerservivce.repository.StatusRepository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class StatusRepoServiceImp implements StatusRepoService {

    @Autowired
    StatusRepository statusRepository;

    @PersistenceContext
    private EntityManager statusEntityManager;

    @Override
    public void InsertNewStatusRecord(int customerid, int serviceid, String statustype, LocalDate ReqDate,
            LocalTime ReqTime) {

        LocalDate creationdate =  LocalDate.now();
        LocalTime creationTime  =  LocalTime.now();

      
        

        statusEntityManager.createNativeQuery("INSERT INTO `status`(  `customerid`, `serviceid`,'statustype','ReqDate','ReqTime')VALUES(?,?,?,?)")
        .setParameter(1, customerid)
        .setParameter(2, serviceid)
        .setParameter(3, "pending")
        .setParameter(4, creationdate)
        .setParameter(5, creationTime).executeUpdate();


       
    }

    @Override
    public List<StatusEntity> GetStatusList() {
     
        return statusRepository.GetAlltheListofStatus();
    }

    @Override
    public StatusEntity GetStatusfromCustomerid(int CustomerID) {
      return statusRepository.GetStatusasperCustomerid(CustomerID);
    }

    @Override
    public void Updatethestatus(int statusid, String Statustype, LocalDate Completiondate, LocalTime Completiontime) {
       statusRepository.UpdatethestatusofService(statusid, Statustype, Completiondate, Completiontime);
    }
    





}
