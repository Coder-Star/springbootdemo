package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.IUserService;
import org.springframework.stereotype.Service;

@Service(value = "userServiceImpl")
public class UserServiceImpl implements IUserService {

    @Override
    public User getUser() {
        User user = new User();
        user.setName("李三");
        user.setSex("男");
        return  user;
    }
}
