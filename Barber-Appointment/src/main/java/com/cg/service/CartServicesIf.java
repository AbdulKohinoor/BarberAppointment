package com.cg.service;

import java.util.List;

import com.cg.models.BarberServiceList;

public interface CartServicesIf{


    public List<BarberServiceList> fetchCartDetails(String email);

    public String deleteItemFromCart(int cartId , String useremail);
}