package com.example.springbootdemo;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example"})
public class SpringbootdemoApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootdemoApplication.class);
        /// 关闭控制台输出的banner
//        application.setBannerMode(Banner.Mode.OFF);
        ApplicationContext applicationContext = application.run(args);
    }

}
