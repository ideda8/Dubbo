package com.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.web.domain.Result;
import com.web.po.DubboUser;
import com.web.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("/regist")
    public Result regist(DubboUser user){
        try {
            userService.regist(user);
            return new Result(true, "注册成功");
        }catch (Exception e){
            e.printStackTrace();
            return new Result(false, "注册失败");
        }

    }

}
