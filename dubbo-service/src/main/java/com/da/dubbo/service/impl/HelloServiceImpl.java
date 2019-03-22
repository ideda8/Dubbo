package com.da.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.da.dubbo.service.HelloService;

@Service
public class HelloServiceImpl implements HelloService {

    public String sayHello(String name) {
        return "Hello" + name;
    }
}
