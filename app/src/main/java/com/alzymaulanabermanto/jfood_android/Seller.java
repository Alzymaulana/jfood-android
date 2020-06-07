package com.alzymaulanabermanto.jfood_android;

public class Seller {
    /* variabel yang digunakan*/
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;


    public Seller(int id, String name, String email, String phoneNumber,
                  Location location)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;

        /** @param id digunakan sebagai id dari seller
         * @param name merupakan nama dari penjual
         * @param email adalah email dari penjual
         * @param phoneNumber adalah nomor hp penjual
         * @param location merupakan objek dari class Location
         */

    }

    public int getId()
    {
        return this.id;
    }

    public String getName()
    {
        return this.name;
    }

    public String getEmail()
    {
        return this.email;
    }

    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    public Location getLocation()
    {
        return this.location;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setEmail (String email)
    {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public void setLocation(Location location)
    {
        this.location = location;
    }

    public void printData()
    {
        System.out.println (name);
    }

    public String toString()
    {
        return id+""+name+""+phoneNumber+""+location;
    }
}