package com.yintai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YintaiRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(YintaiRegistryApplication.class, args);
    }
}
