package com.bharat.jpa.example.relationship.transaction;

import com.bharat.jpa.example.relationship.Repository.UserRepo;
import com.bharat.jpa.example.relationship.as.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by BharatBh on 5/22/2017.
 */

@Service
public class TransactionExample {

    @Autowired
    private UserRepo userRepo;

    @Transactional
    public void shouldRollback(){
        User user = new User();
        user.setName("fef");
        userRepo.save(user);
        throw new RuntimeException("lsdkafj");
    }
}
