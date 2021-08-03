package com.bin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.bin.dao")
public class Provider9002 {

    public static void main(String[] args) {
        SpringApplication.run(Provider9002.class,args);
    }
}
