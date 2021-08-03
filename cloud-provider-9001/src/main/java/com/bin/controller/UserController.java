package com.bin.controller;

import com.bin.entity.User;
import com.bin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);
    }
}
