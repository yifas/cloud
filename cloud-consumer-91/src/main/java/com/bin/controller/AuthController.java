package com.bin.controller;

import com.bin.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController("/auth")
public class AuthController {

    public static final String USER_URL="http://localhost:9001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/getAuth/{id}")
    private User getAuth(@PathVariable Integer id){
        return restTemplate.getForObject(USER_URL+"/getUser/"+id,User.class);
    }
}
