package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class City {
    int zipcode;
    String country;
    String city;
    public City(){}
    public City(int zipcode,String country,String city){
        this.city=city;
        this.zipcode=zipcode;
        this.country=country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }
}
