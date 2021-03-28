package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author litianxing
 * @date  2020-04-20
 * @description
*/
@Controller
public class MainController {

    @RequestMapping("/")
    public String getIndexPage(){
        return "index";
    }

    @RequestMapping("main")
    public String getMainPage(){
        return "main";
    }

    @RequestMapping(value = "/main/getMap",method = RequestMethod.GET)
    @ResponseBody
    public Map getMap(){
        Map<String,String> map = new HashMap<>(16);
        map.put("Controller名称","MainController");
        return map;
    }

    @GetMapping("main/getString")
    @ResponseBody
    public String getString(){
        return "这是一串字符串";
    }

}
