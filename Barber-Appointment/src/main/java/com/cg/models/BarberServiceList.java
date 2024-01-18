package com.cg.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "Service")
//@Builder
//@ComponentScan
public class BarberServiceList {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Service_Id")
	private int serviceId;
	@Column(name = "Service_Name")
	private String serviceName;
	@Column(name = "Service_Price")
	private int servicePrice;
	public int getServiceId() {
		return serviceId;
	}
	public void setServiceId(int serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getServicePrice() {
		return servicePrice;
	}
	public void setServicePrice(int servicePrice) {
		this.servicePrice = servicePrice;
	}
	public BarberServiceList(int serviceId, String serviceName, int servicePrice) {
		super();
		this.serviceId = serviceId;
		this.serviceName = serviceName;
		this.servicePrice = servicePrice;
	}
	public BarberServiceList() {
		super();
		// TODO Auto-generated constructor stub
	}





}
