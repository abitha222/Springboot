


package com.example.demo.service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
     
    public User postDetails( User user )
    {
        return userRepository.save(user);
    }

    public User getDetails( int id )
    {
        return userRepository.findById(id).orElse(null);
    }
}