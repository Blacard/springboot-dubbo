package com.example.provider.service.impl;

import com.example.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author SunAo
 * @Date 2019/8/23
 **/

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String s) {
        s = "你好，"+s;
        System.out.println(s);
        return s;
    }
}
