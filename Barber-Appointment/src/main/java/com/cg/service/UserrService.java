package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.models.Cart;
import com.cg.models.Userr;
import com.cg.repo.CartRepo;
import com.cg.repo.UseerRepo;
import com.cj.exception.DuplicateEntryException;
import com.cj.exception.ResourceNotFoundException;

@Service
public class UserrService implements UserrServiceIf {

	@Autowired
	private UseerRepo userrepo;

	@Autowired
	private CartRepo cartRepo;







	// save the user details form the form if not duplicated
	@Override
	public Userr SaveUserDetails(Userr user) throws DuplicateEntryException
	{

		String tempEmailId = user.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)){
			Userr userobj = userrepo.findByEmailId(tempEmailId);

			if(userobj != null) {
				throw new DuplicateEntryException("User","EmailId", userobj);
				}
		}

		Userr userObj = null;
		userObj = userrepo.save(user);
		return userObj;
	}


	//get the user detail from the database for authentication
	@Override
	public Userr fetchUserByemailIdAndPassword(Userr user) throws ResourceNotFoundException {

		String tempEmailId = user.getEmailId();
		String temppass = user.getPassword();
		Userr userObj = null;
			if((tempEmailId) != null && temppass != null){

					userObj = userrepo.findByEmailIdAndPassword(tempEmailId, temppass);

				}

			if(userObj == null) {
				throw new  ResourceNotFoundException("User", "email", userObj);
		}

		return userObj;
	}


	//show user by id
	@Override
	public Userr fetchById(int id) throws ResourceNotFoundException  {
		Userr user = userrepo.findById(id).get();
		if (user == null)
		{
			throw new  ResourceNotFoundException("User", "Id", user);
		}
		else
			return user;

	}



@Override
public  Cart addOrder(int serviceId , String useremail) {
		Userr user = userrepo.findByEmailId(useremail);
		Cart cart = new Cart(0 , user.getUserrId(), serviceId);
		return cartRepo.save(cart);
	}
//





}
