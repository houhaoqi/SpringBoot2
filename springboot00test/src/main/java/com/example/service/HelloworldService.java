package com.example.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoqi
 * @Date 2022/3/15 - 14:09
 */

@Controller
@EnableAutoConfiguration
@ComponentScan //扫描同级别包下所有类，并注入
public class HelloworldService {

    //@RestController == @Controller + @ResponseBody：
    //  类上添加@RestController springMvcUrl接口映射都返回json格式
    //  方法上添加@RestController 返回对应json字符页面
    //  Rest风格通过http协议传输json数据格式
    //
    //  @Controller  springMvcUrl接口映射，默认返回页面跳转，
    //需要搭配@ResponseBody注解返回json格式数据

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello haoqi!这是json字符串，传输到页面中去！";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloworldService.class,args);
    }
}
