package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.UserComplaints;
@Repository
public interface Usercomplaintsrepo extends JpaRepository<UserComplaints, Integer>  {

}
