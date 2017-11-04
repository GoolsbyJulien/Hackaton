package com.example.rockm.hackaton;

/**
 * Created by rockm on 11/4/2017.
 */

public class Job {
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private String name;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public void setDescription(String description){

        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    private String description;
    private String money;
    private String location;
    private String email,phone;
    public Job(String name, String money,String location,String email,String phone, String description) {

        this.name = name;
        this.email = email;
        this.location  = location;
        this.money = money;
        this.phone = phone;

    }
    public String getName() {

        return name;
    }
}
