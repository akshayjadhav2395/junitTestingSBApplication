package com.example.demo.repo;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepoTest {

    @Autowired
    private UserRepo userRepo;

    @Test
    void isUserExistByUid() {

        User user=new User(1234,"akshay", "pune");
        userRepo.save(user);

        boolean actualRes=userRepo.isUserExistByUid(1234);
        assertThat(actualRes).isTrue();
    }

    @AfterEach
    void tearDown() {
        System.out.println("tearing down...");
        userRepo.deleteAll();
    }

    @BeforeEach
    void setUp() {
        System.out.println("tearing up...");
    }
}