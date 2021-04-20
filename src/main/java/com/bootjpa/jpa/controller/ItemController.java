package com.bootjpa.jpa.controller;

import com.bootjpa.jpa.dao.ItemRepo;
import com.bootjpa.jpa.models.Items;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    ItemRepo repo;

    @PostMapping("/item")
    public void addItem(Items item){
        repo.save(item);
    }

    
    
    @GetMapping("/item/{id}")
    public void getItem(@RequestParam int id){

    }
}
