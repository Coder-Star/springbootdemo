package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.util.RedisUtil;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@SuppressWarnings({"ALL", "AlibabaClassMustHaveAuthor"})
@RestController
@RequestMapping("/redis")
public class RedisController {

    @Resource(name = "redisUtil")
    private RedisUtil redisUtil;

    @RequestMapping("getRedisUser")
    @Cacheable("user")
    public User getUser() {
        User user = new User();
        user.setName("Redis缓存用户");
        user.setAge(18);
        System.out.println("当在控制台看到这句话是表示本次请求没有使用缓存，如果看不到了表示本次请求使用了缓存");
        return user;
    }

    @RequestMapping("getRedisInfo")
    public String getRedisInfo() {
        //使用:隔开，可以使用 业务名:表名:主键:标识值 这种格式 ，使用:隔开可以使用rdm分层显示
        String key = "OA:User:Id:124";
        String info = redisUtil.get(key);
        if (info == null) {
            redisUtil.set(key,"这是从Redis中取出的信息");
        } else {
            return info;
        }
        System.out.println(info);
        return info;
    }


}
