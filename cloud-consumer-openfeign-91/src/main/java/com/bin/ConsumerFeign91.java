package com.bin;

import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class ConsumerFeign91 {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerFeign91.class,args);
    }

    /*
        可以在nacos后台配置权重
     */
   /* @Bean
    @Scope(value = "prototype")
    public IRule loadBalanceRule()
    {
        return new NacosRule();
    }*/
}
