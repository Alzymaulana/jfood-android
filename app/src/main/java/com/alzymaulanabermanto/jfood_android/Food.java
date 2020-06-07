package com.alzymaulanabermanto.jfood_android;

public class Food {
    private int id;
    private String name;
    private Seller seller;
    private int price;
    private String category;

    /**
     * constructor dari class Food digunakan untuk membuat objek food
     */

    public Food(int id, String name, Seller seller, int price,
                String category)
    {
        this.id = id;
        this.name = name;
        this.seller = seller;
        this.price = price;
        this.category = category;

        /** @param id digunakan sebagai id dari makanan
         * @param name merupakan nama makanan
         * @param seller adalah objek dari class Seller
         * @param price adalah harga dari makanan
         * @param category adalah category dari makanan
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

    public Seller getSeller()
    {
        return this.seller;
    }


    public int getPrice()
    {
        return this.price;
    }

    public String getCategory()
    {
        return this.category;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public void setSeller(Seller seller)
    {
        this.seller = seller;
    }

    public void setPrice (int price)
    {
        this.price = price;
    }

    public void setCategory(String Category)
    {
        this.category = category;
    }

    public String toString()
    {
        return id+""+name+""+seller.getName()+""+seller.getLocation().getCity()+""+price+""+category;
    }

}