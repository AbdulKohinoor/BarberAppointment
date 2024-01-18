package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.models.FeedBack;
import com.cg.repo.FeeedBackRepo;

@Service
public class FeedBackService {


	@Autowired
	FeeedBackRepo repo;



	public FeedBack addfeedback(FeedBack fedback) {

		return repo.save(fedback);

	}

	public List<FeedBack>  getAllfeedBack(){
		List<FeedBack> li=repo.findAll();

		return li;
	}


}

