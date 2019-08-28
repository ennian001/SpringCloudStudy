package com.sc.study;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@EnableEurekaClient
public class Provider8001 {
    public static void main(String[] args) {
        SpringApplication.run(Provider8001.class,args);
    }
}
