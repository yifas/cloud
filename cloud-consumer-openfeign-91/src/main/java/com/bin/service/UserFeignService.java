package com.bin.service;

import com.bin.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-provider-9001") //必须指定服务的名字
public interface UserFeignService {
    /*
        直接分支生产者的Controller层
    */

    /**
     * 通过ID获取用户
     * @param id
     * @return
     */
    @GetMapping("/getUser/{id}")
    public User getUser(@PathVariable(value = "id") Integer id);


    @GetMapping(value = "/lb")
    String lb();
}
