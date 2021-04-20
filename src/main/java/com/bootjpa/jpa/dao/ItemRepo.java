package com.bootjpa.jpa.dao;
import com.bootjpa.jpa.models.Items;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ItemRepo extends JpaRepository<Items, Integer>{
    
}
