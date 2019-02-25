package com.example.demo.package001.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.package001.config.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableConfigurationProperties({ConfigBean.class})
public class JavaBeanController {

    @Autowired
    ConfigBean configBean;
    @RequestMapping("test-config")
    public String configBean(){
        return JSON.toJSONString(configBean);
    }
}