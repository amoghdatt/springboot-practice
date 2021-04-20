package com.bootjpa.jpa.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModel {

    @Id
    private int uid;
    private String firstName;
    private String LastName;
    private String email;
    private String password;


    public int getUid() {
        return uid;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setUid(int uid) {
        this.uid = uid;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return LastName;
    }
    public void setLastName(String lastName) {
        LastName = lastName;
    }
    
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }



}
