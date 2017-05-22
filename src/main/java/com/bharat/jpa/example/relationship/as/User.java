package com.bharat.jpa.example.relationship.as;

import com.bharat.jpa.example.relationship.as.EmbeddableAddress;
import com.bharat.jpa.example.relationship.as.EntityAddress;

import javax.persistence.*;
import java.util.Map;

/**
 * Created by BharatBh on 4/24/2017.
 */
@Entity
@Table(name="user")
public class User {
    public final static String Billing_AD = "BillingAddress";
    public final static String Shipping_AD = "ShippingAddress";

    private String name;

    @Id
    @GeneratedValue
    private int userId;

   /* @ElementCollection
    private Map<String,EmbeddableAddress> addressMap;*/

    @OneToMany
    private  Map<String,EntityAddress> addresses;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public Map<String, EntityAddress> getAddresses() {
        return addresses;
    }

    public void setAddresses(Map<String, EntityAddress> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", userId=" + userId +
//                ", addresses=" + addresses +
                '}';
    }
}
