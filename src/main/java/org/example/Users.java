package org.example;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Users {
    @Id
    @GeneratedValue(generator = "ID_GENERATOR")
    @GenericGenerator(name="ID_GENERATOR", strategy = "increment")
    @Column(name = "ID")
    int id;

    @Column(name = "NAME")
    String name;

    @Column(name="LASTNAME")
    String lastName;



    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
