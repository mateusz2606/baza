package org.example;

import jakarta.persistence.Embeddable;

@Embeddable
public class Adress {
    String street;
    City city;
    public Adress(){}
    public Adress(String street,City city){
        this.city=city;
        this.street=street;
    }

}
