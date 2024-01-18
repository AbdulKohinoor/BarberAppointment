package com.cg.service;

import com.cg.models.Cart;
import com.cg.models.Userr;

public interface UserrServiceIf {
    public Userr SaveUserDetails(Userr user);
    public Userr fetchUserByemailIdAndPassword(Userr user);
    public Userr fetchById(int id);

    public Cart addOrder(int ServiceId , String  useremail);

}
