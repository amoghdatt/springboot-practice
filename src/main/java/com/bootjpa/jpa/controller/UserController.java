package com.bootjpa.jpa.controller;


import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import com.bootjpa.jpa.dao.UserRepo;
import com.bootjpa.jpa.models.UserModel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired    
    UserRepo repo;


    @PostMapping("/login")
    public UserModel login(@RequestBody HashMap<String, String> request){

        String email  = request.get("email");
        String password = request.get("password");
    
        List<UserModel> user = repo.findByEmail(email);
        if(!user.get(0).getPassword().equals(password)) {
            return  new UserModel();
        }
        
        return user.get(0);
    }

    @PostMapping("/user")
    public UserModel addUser(@RequestBody UserModel user){
        repo.save(user);
        return user;
    }
    
    @GetMapping("/user")
    public List<UserModel> getAllUsers(){
        return repo.findAll();
    }

    @GetMapping("/user/{uid}")
    public Optional<UserModel> getUser(@PathVariable("uid") int uid){
        return repo.findById(uid);
    }
}
