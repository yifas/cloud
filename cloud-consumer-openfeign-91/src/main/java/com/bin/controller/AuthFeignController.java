package com.bin.controller;

import com.bin.entity.User;
import com.bin.service.UserFeignService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
/*
    通过openfeign 调用
 */
@RestController
@RequestMapping("/feign")
public class AuthFeignController {

    @Resource
    private UserFeignService userFeignService;

    @GetMapping("/getAuth/{id}")
    private User getAuth(@PathVariable Integer id){
        return userFeignService.getUser(id);
    }

    @GetMapping(value = "/lb")
    public String lb() {
        return userFeignService.lb();
    }
}
