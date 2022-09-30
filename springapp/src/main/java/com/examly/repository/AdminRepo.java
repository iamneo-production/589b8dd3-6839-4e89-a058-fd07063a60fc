package com.examly.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.model.AdminModel;
import com.examly.UserModel;

@Repository
public interface AdminRepo extends JpaRepository<AdminModel,String>{

}
