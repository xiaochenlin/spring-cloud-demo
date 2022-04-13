package com.sentinel.service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlowLimitController {

    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/testA")
    public String testA() {
        return "服务访问成功------testA";
    }
    @GetMapping("/testB")
    public String testB() {
        return "，服务访问成功------testB";
    }
}
