package com.example.springbootdemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author coder-star
 * @date 2020/5/26
 * @Description MainController子类
 */
@RestController
@RequestMapping("sub")
public class SubMainController extends MainController {

    @RequestMapping(value = "/getSubMap",method = RequestMethod.GET)
    public Map getSubMap(){
        Map<String,String> map = new HashMap<>(16);
        map.put("Controller名称","SubMainController");
        return map;
    }
}
