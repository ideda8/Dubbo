package com.da.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.da.dubbo.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/test")
    public String hello(){
        System.out.println("dubbo-consumer: HelloController.hello()");

        return helloService.sayHello("DaDa!");
    }

    @RequestMapping("/aa")
    public String aa(){
        System.out.println("dubbo-consumer: HelloController.aa()");

        return "haha";
    }
}
