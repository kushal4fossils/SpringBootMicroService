package com.idiot.springboot.controller;

import com.idiot.springboot.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    @RequestMapping("/home")
    public String test() {
        return "Hello World";
    }

    @GetMapping(value = "/user")
    public User user() {
        User user = new User();
        user.setId("1");
        user.setName("Kushal");
        user.setEmail("kushal.kb0606@gmail.com");
        return user;
    }
    @GetMapping("{id}")
    public String pathVariable(@PathVariable String id){
        return "path variable is: "+id;
    }

    @GetMapping("{id}/{id2}")
    public String pathVariables(@PathVariable String id,@PathVariable String id2){
        return "path variable is:"+id+":"+id2;
    }
    @GetMapping("requestParam")
    public String requestParam(@RequestParam String name){
        return "Your name is : " +name;
    }
    @GetMapping("/requestParams")
    public String requestParams(@RequestParam String name,@RequestParam(name = "email",required = false,defaultValue = "") String emailId){
        return "Your name is : "+name +" and email id is: "+emailId;
    }


}
