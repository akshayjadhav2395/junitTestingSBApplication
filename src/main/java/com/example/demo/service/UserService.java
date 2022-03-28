package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepo userRepo;

    public UserService(UserRepo userRepo) {
    	System.out.println("creating user...");
        this.userRepo = userRepo;
    }

    public List<User> getAllUser()
    {
        return userRepo.findAll();
    }
}
