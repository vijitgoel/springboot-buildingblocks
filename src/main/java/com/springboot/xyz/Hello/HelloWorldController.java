package com.springboot.xyz.Hello;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/helloWorld1")
    public String helloWorld () {
        return "Hello World";
    }

    @RequestMapping(method = RequestMethod.GET,path = "/helloWorldBean")
    public UserDetails helloWorldBean() {
        return new UserDetails("Vijit","Goel","Test.Test@gmail.com");
    }
}
