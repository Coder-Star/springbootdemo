package com.example.springbootdemo.test;


import com.example.springbootdemo.SpringbootdemoApplication;
import com.example.springbootdemo.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringbootdemoApplication.class)
public class UserTest {
    @Resource(name = "userServiceImpl")
    private IUserService iUserService;

    @Test
    public void test() {
        System.out.println(1);
        System.out.println(iUserService.getUser());
    }
}
