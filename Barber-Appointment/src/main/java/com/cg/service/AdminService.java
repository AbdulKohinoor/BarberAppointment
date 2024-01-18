package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.models.Admin;
import com.cg.models.BarberServiceList;
import com.cg.repo.Adminrepo;
import com.cg.repo.BarberServicesRepo;
import com.cj.exception.ResourceNotFoundException;

@Service
public class AdminService implements AdminServiceIf{


	@Autowired
	private Adminrepo adminrepo;
	@Autowired
	private BarberServicesRepo barberServiceRepo;


	//find by admin details

	 @Override
	public Admin fetchAdminByEmailId(String email) {

		return adminrepo.findByAdminEmail(email).orElseThrow(() -> new ResourceNotFoundException("Admin", "Name", email));

	}



	// add barbers serves and price

	@Override
	public  BarberServiceList addBarberService(BarberServiceList barberServiceList) {
		BarberServiceList bs = barberServiceRepo.save( barberServiceList);
		return bs;
	}

	// update barber exerting services and prices

	@Override
	public BarberServiceList updateService(Integer serviceId, BarberServiceList barberServiceList) {
		 BarberServiceList bsl = barberServiceRepo.findById(serviceId).get();
		 bsl.setServiceId(barberServiceList.getServiceId());
		bsl.setServiceName(barberServiceList.getServiceName());
		bsl.setServicePrice(barberServiceList.getServicePrice());


		return  barberServiceRepo.saveAndFlush (bsl);
	}


	//remove barber services

	@Override
	public  String deleteService(int serviceId) {
		barberServiceRepo.deleteById(serviceId);
		return "Deleted";
	}

	// see all barbers services

	@Override
	public List<BarberServiceList> getallServices(){
		return barberServiceRepo.findAll();
	}



	@Override
	public Admin fetchUserByemailIdAndPassword(Admin admin) {
		String tempEmailId = admin.getAdminEmail();
		String temppass = admin.getAdminPassword();
		Admin adminObj = null;
			if((tempEmailId) != null && temppass != null){
					adminObj = adminrepo.findByAdminEmailAndAdminPassword(tempEmailId, temppass);
				}

			if(adminObj == null) {
				throw new  ResourceNotFoundException("Admin", "email", adminObj);
		}

		return adminObj;
	}



}

