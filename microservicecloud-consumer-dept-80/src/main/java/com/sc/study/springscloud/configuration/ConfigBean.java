package com.sc.study.springscloud.configuration;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //ribbon提供负载均衡
    public RestTemplate grestTemplate(){
        return new RestTemplate();
    }
}
