package com.chinagram.chinagram_backend.service;

import com.chinagram.chinagram_backend.model.User;
import com.chinagram.chinagram_backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService{

    @Autowired
    UserRepository userRepository;

    public List<User> findAllUsers(){
        return userRepository.findAll();
    }
}