package com.idiot.SpringBootMicroService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @RequestMapping("/home")
    public String testReturn(){
        System.out.println("Hi");
        return "Hello World";
    }

}
