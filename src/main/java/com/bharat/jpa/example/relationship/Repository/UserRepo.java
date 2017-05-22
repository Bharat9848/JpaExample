package com.bharat.jpa.example.relationship.Repository;

import com.bharat.jpa.example.relationship.as.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by BharatBh on 5/22/2017.
 */
@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}
