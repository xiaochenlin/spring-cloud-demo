package com.sentinel.service.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 通过 Sentinel 控制台定义流控规则
 *
 *
 * 在以下代码中，我们通过 @SentinelResource 注解的 blockHandler 属性指定了一个 blockHandler 函数，进行限流之后的后续处理。
 *
 *  使用 @SentinelResource 注解的 blockHandler 属性时，需要注意以下事项：
 *
 * blockHandler 函数访问范围需要是 public；
 * 返回类型需要与原方法相匹配；
 * 参数类型需要和原方法相匹配并且最后加一个额外的参数，类型为 BlockException；
 * blockHandler 函数默认需要和原方法在同一个类中，若希望使用其他类的函数，则可以指定 blockHandler 为对应的类的 Class 对象，注意对应的函数必需为 static 函数，否则无法解析。
 * 请务必添加 blockHandler 属性来指定自定义的限流处理方法，若不指定，则会跳转到错误页（用户体验不好）。
 */
@RestController
public class SentinelFlowLimitController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping("/testC")
    @SentinelResource(value = "testCbyAnnotation")
    public String testC() {
        return "服务访问成功------testC：" + serverPort;
    }


    /**
     * 通过 Sentinel 控制台定义流控规则
     *
     */
    @GetMapping("/testD")
    @SentinelResource(value = "testD-resource",blockHandler = "testDResourceFallBack") //通过注解定义资源
    public String testD() {
        return "------testD：" + serverPort;
    }
    /**
     * 限流之后的逻辑
     * @param exception
     * @return
     */
    public String testDResourceFallBack(BlockException exception){
        return "提醒您，TestD服务访问失败! 您已被限流，请稍后重试";
    }
}
