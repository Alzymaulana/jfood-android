package com.example.jfood_android;

public class Seller {

    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    public Seller(int id, String name, String email, String phoneNumber, Location location){
        this.id = id;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public String getPhoneNumber(){
        return phoneNumber;
    }

    public Location getLocation(){
        return location;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Override
    public String toString()
    {
        return "= Seller ===============================" +
                "\nId     : " + id +
                "\nName      : " + name +
                "\nEmail          : " + email +
                "\nPhone   : " + phoneNumber +
                "\nLocation      : " + location +
                "\n==========================================";
    }
}