package com.sc.study.springscloud.configuration;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
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
    @Bean
    public IRule myRule(){
        // 修改为随机算法
//        return new RandomRule();
        //重试策略
//        return new RetryRule();
        return new RoundRobinRule();
    }
}
