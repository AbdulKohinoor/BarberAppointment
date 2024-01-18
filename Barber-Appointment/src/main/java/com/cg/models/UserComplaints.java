package com.cg.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "User_Complaints")
//@Table(name = "User_Complaints")
//@Builder
public class UserComplaints {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Complaint_Id")
	private int ComplaintId;
	@Column(name = "Complaints")
	private String Complaints;
	public int getComplaintId() {
		return ComplaintId;
	}
	public void setComplaintId(int complaintId) {
		ComplaintId = complaintId;
	}
	public String getComplaints() {
		return Complaints;
	}
	public void setComplaints(String complaints) {
		Complaints = complaints;
	}
	public UserComplaints() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserComplaints(int complaintId, String complaints) {
		super();
		ComplaintId = complaintId;
		Complaints = complaints;
	}



}