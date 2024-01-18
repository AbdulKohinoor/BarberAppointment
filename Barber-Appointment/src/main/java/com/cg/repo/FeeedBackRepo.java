package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.FeedBack;
@Repository
public interface FeeedBackRepo  extends JpaRepository<FeedBack, Integer>{

}
