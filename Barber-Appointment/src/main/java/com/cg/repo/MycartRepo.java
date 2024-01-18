package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.MyCart;
@Repository
public interface MycartRepo  extends JpaRepository<MyCart, Integer>{


}
