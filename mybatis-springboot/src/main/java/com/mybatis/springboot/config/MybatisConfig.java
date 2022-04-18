package com.mybatis.springboot.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = {"com.mybatis.springboot.mapper"})
public class MybatisConfig {
}
