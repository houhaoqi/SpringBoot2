package com.haoqi.AOP.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoqi
 * @Date 2022/3/3 - 20:37
 */
@RestController
@RequestMapping("/aop")
public class AopController {
    @GetMapping("/get")
    public String getTest() {
        System.out.println("get 请求：");
        return "get 请求： return";
    }
}
