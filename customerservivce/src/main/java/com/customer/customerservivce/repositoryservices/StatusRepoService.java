package com.customer.customerservivce.repositoryservices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import com.customer.customerservivce.models.StatusEntity;

public interface StatusRepoService {
    

    
    void InsertNewStatusRecord(int customerid,int serviceid, String statustype , LocalDate ReqDate,LocalTime ReqTime);

    List<StatusEntity> GetStatusList();

    StatusEntity  GetStatusfromCustomerid(int CustomerID);

    void Updatethestatus(int statusid,String Statustype , LocalDate Completiondate, LocalTime Completiontime );



    

}
