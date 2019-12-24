package com.yintai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.yintai.item.mapper")
public class YintaiItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(YintaiItemApplication.class, args);
    }
}
