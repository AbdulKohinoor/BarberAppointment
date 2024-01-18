package com.cg.service;

import java.util.List;

import com.cg.models.Admin;
import com.cg.models.BarberServiceList;


public interface AdminServiceIf {

    public Admin fetchAdminByEmailId(String email);
    public BarberServiceList addBarberService(BarberServiceList barberServiceList);
    public BarberServiceList updateService(Integer serviceId, BarberServiceList barberServiceList);
    public  String deleteService(int serviceId);
    public List<BarberServiceList> getallServices();
    public Admin fetchUserByemailIdAndPassword(Admin admin);


}