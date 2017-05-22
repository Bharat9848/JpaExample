package com.bharat.jpa.example.relationship;

import com.bharat.jpa.example.relationship.Repository.UserRepo;
import com.bharat.jpa.example.relationship.transaction.TransactionExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by BharatBh on 5/22/2017.
 */
@SpringBootApplication
@PropertySource({"classpath:application.properties"})
public class Application {

    public static void main(String[] args){
        ApplicationContext context = SpringApplication.run(Application.class, args);
        TransactionExample transactionExample =  context.getBean(TransactionExample.class);
        shouldRollback(context, transactionExample);
    }

    private static void shouldRollback(ApplicationContext context, TransactionExample transactionExample) {
        try {
            transactionExample.shouldRollback();
        }catch (Exception ex){}

        final UserRepo userRepo = context.getBean(UserRepo.class);
        Runnable task = new Runnable(){

            @Override
            public void run() {
                System.out.println(userRepo.findAll());
            }
        };
        new Thread(task).start();
    }
}
