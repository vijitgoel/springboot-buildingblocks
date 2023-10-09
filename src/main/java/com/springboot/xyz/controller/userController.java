package com.springboot.xyz.controller;

import com.springboot.xyz.entities.UserDetails;
import com.springboot.xyz.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class userController {
    @Autowired  
    private UserService userService ;

    @RequestMapping(method = RequestMethod.GET, path = "/getAllUsers")
    public List<UserDetails> getAllUsers(){
        return userService.getALLUsers();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/newUser")
    public UserDetails createUser(@RequestBody UserDetails userDetails){
        return userService.createUser(userDetails);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/userUpdate/{Id}")
    public UserDetails updateUser(@RequestBody UserDetails userDetails, @PathVariable Long Id)    {
        return userService.updateUser(userDetails,Id);    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/userDelete/{Id}")
    public String deleteUser(@PathVariable Long Id)    {
        return userService.deleteUser(Id);    }
}
