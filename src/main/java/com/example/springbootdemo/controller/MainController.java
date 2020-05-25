package com.example.springbootdemo.controller;

import com.example.springbootdemo.entity.User;
import com.example.springbootdemo.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author litianxing
 * @date  2020-04-20
 * @description
*/
@Controller
public class MainController {
    @Resource(name = "userServiceFriendlyImpl")
    private IUserService userService;

    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("/main")
    public String getMainPage(){
        return "main";
    }

    @RequestMapping(value = "getMap",method = RequestMethod.GET)
    @ResponseBody
    public Map getMap(){
        Map<String,String> map = new HashMap<>(16);
        map.put("name","张三");
        map.put("age","19");
        map.put("age1","191");
        return map;
    }

    @RequestMapping(value = "getUser",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(){
        return userService.getUser();
    }

    @GetMapping("getString")
    @ResponseBody
    public String getString(){
        return "这是一串字符串";
    }

}
