package com.web.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.web.mapper.DubboUserMapper;
import com.web.po.DubboUser;
import com.web.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

//    @Autowired
    @Reference
    private DubboUserMapper userMapper; //就是扫描不到

    public void regist(DubboUser user) {
        user.setCreatetime(new Date());
        userMapper.insert(user);
    }
}
