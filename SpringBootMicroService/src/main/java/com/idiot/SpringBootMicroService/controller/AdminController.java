package com.idiot.SpringBootMicroService.controller;

import com.idiot.SpringBootMicroService.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @RequestMapping("/home")
    public String test() {
        return "Helo World";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Kushal");
        user.setEmail("kushal.kb0606@gmail.com");
        return user;
    }

}
