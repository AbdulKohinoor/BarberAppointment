package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.Barber;


@Repository
public interface BarberRepo extends JpaRepository<Barber,Integer>{

}
