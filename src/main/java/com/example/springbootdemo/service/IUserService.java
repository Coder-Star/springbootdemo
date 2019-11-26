package com.example.springbootdemo.service;

import com.example.springbootdemo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface IUserService {
    User getUser();

}
