package com.haoqi.AOP.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.haoqi.AOP.annotation.PermissionAnnotation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoqi
 * @Date 2022/3/3 - 21:42
 */
@RestController
@RequestMapping(value = "/permission")
public class PermissionsController {
    @RequestMapping(value = "/check", method = RequestMethod.POST)
    @PermissionAnnotation() //添加自定义注解
    public JSONObject getGroupList(@RequestBody JSONObject request) {
        return JSON.parseObject("{\"message\":\"SUCCESS\",\"code\":200}");
    }

    @RequestMapping(value = "check", method = RequestMethod.GET)
    public String getTest() {
        System.out.println("get 请求：浏览器可以访问");
        return "return: get 请求：浏览器可以访问";
    }
}
