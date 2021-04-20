package com.bootjpa.jpa.dao;

import java.util.List;

import com.bootjpa.jpa.models.UserModel;

import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepo extends JpaRepository<UserModel, Integer>{
    

    List<UserModel> findByEmail(String email);

}
