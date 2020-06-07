package com.alzymaulanabermanto.jfood_android;

public class Location {
    private String province;
    private String description;
    private String city;

    /**
     * Constructor location digunakan untuk membuat objek dari class Location
     */

    public Location(String city, String province, String description)
    {
        this.city = city;
        this.province = province;
        this.description = description;

        /**
         * @param city merupakan nama kota
         * @param province adalah nama provinsi
         * @param description adalah deskripsi dari lokasi
         */
    }

    public String getProvince()
    {
        return province;
    }

    public String getCity()
    {
        return city;
    }

    public String getDescription()
    {
        return description;

    }


    public void setProvince(String province)
    {
        this.province = province;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public void setDescription (String description)
    {
        this.description = description;
    }

    public String toString()
    {
        return city+""+province+""+description;
    }
}
