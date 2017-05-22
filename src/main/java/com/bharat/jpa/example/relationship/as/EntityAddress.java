package com.bharat.jpa.example.relationship.as;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by BharatBh on 4/24/2017.
 */
@Entity
public class EntityAddress {

    @Id
    @GeneratedValue
    private int id ;

    @Column(name = "address")
    private String addressLine;

    private String city;

    private  String state;

    private int pincode;

    public EntityAddress() {
    }

    public EntityAddress(String addressLine, String city, String state, int pincode) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
}
