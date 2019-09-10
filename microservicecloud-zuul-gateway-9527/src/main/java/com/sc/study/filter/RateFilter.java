package com.sc.study.filter;

import com.google.common.util.concurrent.RateLimiter;
import com.netflix.zuul.ZuulFilter;
import com.sc.study.exception.RateLimitException;
import org.springframework.stereotype.Component;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

/**
 * 令牌桶限流算法，实现与应用
 */
@Component
public class RateFilter extends ZuulFilter {
    //没秒钟存放100个令牌
    private static final RateLimiter RATE_LIMITER = RateLimiter.create(1);
    //限流应该在所有过滤器里面都是最高的
    @Override
    public String filterType() {
        return PRE_TYPE;
    }
    @Override
    public int filterOrder() {
        return -100;
    }
    @Override
    public boolean shouldFilter() {
        return true;
    }
    @Override
    public Object run() {
        //如果没有拿到令牌
        if (!RATE_LIMITER.tryAcquire()){
            System.out.println("无令牌，抛出请求");
            throw new RateLimitException();
        }
        return null;
    }
}
