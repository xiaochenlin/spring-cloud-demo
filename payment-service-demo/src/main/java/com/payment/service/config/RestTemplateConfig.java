package com.payment.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    @LoadBalanced   // 此注解是负载均衡  不开启 多个微服务调用他不知道调用哪个 默认是轮询
    public RestTemplate restTemplate(){

        return new RestTemplate();
    }
}
