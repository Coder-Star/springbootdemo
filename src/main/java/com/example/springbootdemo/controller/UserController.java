package com.example.springbootdemo.controller;

import com.example.springbootdemo.config.BaseResult;
import com.example.springbootdemo.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "用户管理", description = "用户管理API", position = 100, protocols = "http")
@RestController
@RequestMapping(value = "/user")
public class UserController {
    @ApiOperation(value = "创建用户", notes = "创建用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "用户名", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "sex", value = "性别", required = true, dataType = "String", paramType = "query"),
    })
    @RequestMapping(value = "", method = RequestMethod.GET)
    public BaseResult<User> postUser() {
        User user = new User();
        user.setName("Redis");
        user.setSex("男");
        return BaseResult.successWithData(user);
    }
}
