package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.Cart;
@Repository
public interface CartRepo  extends JpaRepository<Cart, Integer> {

}
