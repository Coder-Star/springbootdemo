package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MainController {

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
        Map map = new HashMap();
        map.put("name","张三");
        map.put("age","19");
        return map;
    }

    @GetMapping("getString")
    @ResponseBody
    public String getString(){
        return "这是一串字符串";
    }

}
