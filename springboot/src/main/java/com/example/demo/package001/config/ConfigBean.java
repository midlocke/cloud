package com.example.demo.package001.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "my")
@Component
@Data
public class ConfigBean {

    private String name;
    private String age;
    private int number;
    private String uuid;
    private int max;
    private String value;
    private String greeting;
}