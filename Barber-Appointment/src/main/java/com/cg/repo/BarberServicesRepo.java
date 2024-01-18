package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.BarberServiceList;

@Repository
public interface BarberServicesRepo extends JpaRepository<BarberServiceList, Integer> {

}

