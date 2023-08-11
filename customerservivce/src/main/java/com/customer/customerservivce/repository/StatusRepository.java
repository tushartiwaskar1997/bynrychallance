package com.customer.customerservivce.repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.customer.customerservivce.models.StatusEntity;

import jakarta.transaction.Transactional;

@EnableJpaRepositories
public interface StatusRepository extends JpaRepository<StatusEntity,String> {
   
    @Query(value = "Select *from status where =?1",nativeQuery = true)
    StatusEntity GetStatusasperCustomerid(int customerid);

    @Query(value="select * from status ",nativeQuery =true)
    List<StatusEntity> GetAlltheListofStatus();


    @Transactional
    @Query(value="Update status set 	service_status=?2 , comp_date=?3 ,comp_time=?4 where  statusid =?1  ",nativeQuery=true) 
    void UpdatethestatusofService(int statusid,String Statustype , LocalDate Completiondate, LocalTime Completiontime);


    @Query(value = "Select *from status where customerid =?1 and req_date=?2 ",nativeQuery = true)
    StatusEntity GetStatisDetailsAsPerCustIDAndDateofEntry(int customerid ,LocalDate  date);   


}
