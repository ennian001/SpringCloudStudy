package com.sc.study.springscloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import third.packageclass.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.sc.study.springscloud"})
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumerFeign_APP80 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeign_APP80.class,args);
    }
}
