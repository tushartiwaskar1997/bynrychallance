package com.customer.customerservivce.dto;

public class Services {
    
    private String Servicename;
    private int ServiceID;

    public Services(){}

    public Services(String servicename, int serviceID) {
        Servicename = servicename;
        ServiceID = serviceID;
    }
 
    public String getServicename() {
        return Servicename;
    }

    public void setServicename(String servicename) {
        Servicename = servicename;
    }

    public int getServiceID() {
        return ServiceID;
    }

    public void setServiceID(int serviceID) {
        ServiceID = serviceID;
    };

    


}
