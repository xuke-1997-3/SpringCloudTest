package com.buba.springclould.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class orderMain {
    public static void main(String[] args) {
        SpringApplication.run(orderMain.class, args);
    }
}
