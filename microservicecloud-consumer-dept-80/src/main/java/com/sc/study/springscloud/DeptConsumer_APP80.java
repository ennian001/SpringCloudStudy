package com.sc.study.springscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootApplication
@EnableEurekaClient
public class DeptConsumer_APP80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer_APP80.class,args);
    }
}
