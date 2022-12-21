package org.example;

import jakarta.persistence.*;
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

    @Embedded
    Adress adress;

    @Embedded
    @AttributeOverrides({
            @AttributeOverride(name="street",column=@Column(name="BILLING_STREET")),
              @AttributeOverride(name="city.city",column = @Column(name="BILLING_CITY")),
              @AttributeOverride(name="city.zipcode",column = @Column(name="BILLING_ZIPCODE")),
              @AttributeOverride(name="city.country",column = @Column(name="BILLING_COUNTRY")),
    })
    Adress billingAdress;





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

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setBillingAdress(Adress billingAdress) {
        this.billingAdress = billingAdress;
    }

    public Adress getBillingAdress() {
        return billingAdress;
    }
}
