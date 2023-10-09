package com.springboot.xyz.services;

import com.springboot.xyz.entities.UserDetails;
import com.springboot.xyz.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<UserDetails> getALLUsers() {
        return userRepository.findAll();
    }

    public UserDetails createUser(@RequestBody UserDetails userDetails) {
        return userRepository.save(userDetails);
    }

    public UserDetails updateUser(UserDetails userDetails, Long Id) {
        userDetails.setId(Id);
        return userRepository.save(userDetails);
    }

    public String deleteUser(Long Id) {
        if (userRepository.findById(Id).isPresent()) {
            userRepository.deleteById(Id);
            return "User successfully deleted.";
        }
        else
            return "User Not found.";
    }
}