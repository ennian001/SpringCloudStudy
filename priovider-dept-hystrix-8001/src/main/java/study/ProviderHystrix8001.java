package study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = "study.dao")
@EnableCircuitBreaker//对hystrixR熔断机制的支持
public class ProviderHystrix8001 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderHystrix8001.class,args);
    }
}
