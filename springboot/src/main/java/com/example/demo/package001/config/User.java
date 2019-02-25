package com.example.demo.package001.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Configuration
@PropertySource(value = "classpath:test-test.properties")
@ConfigurationProperties(prefix = "com.test.user")
public class User {

    private String name;
    private Integer age;
}