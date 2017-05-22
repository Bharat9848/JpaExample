package com.bharat.jpa.example.relationship.as;

import com.bharat.jpa.example.relationship.Repository.UserRepo;
import com.bharat.jpa.example.relationship.transaction.TransactionExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by BharatBh on 4/24/2017.
 */

@Embeddable
public class EmbeddableAddress {

    @Column(name = "address")
    private String addressLine;

    private String city;

    private  String state;

    private int pincode;

    public EmbeddableAddress() {
    }

    public EmbeddableAddress(String addressLine, String city, String state, int pincode) {
        this.addressLine = addressLine;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    /**
     * Created by BharatBh on 5/22/2017.
     */

    @SpringBootApplication
    @PropertySource({"classpath:application.properties"})
    public static class Application {


        public static void main(String[] args) {
            System.out.println("------ Start com.bharat.jpa.example.relationship.as.EmbeddableAddress.Application ------");
            ApplicationContext ctx = SpringApplication.run(Application.class, args);
            TransactionExample transactionExample = ctx.getBean(TransactionExample.class);
            transactionExample.shouldRollback();
            UserRepo userRepo = ctx.getBean(UserRepo.class);
            System.out.println(userRepo.findAll());
        }

    }
}
