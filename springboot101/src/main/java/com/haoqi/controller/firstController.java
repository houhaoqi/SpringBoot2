package com.haoqi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoqi
 * @Date 2022/3/1 - 11:35
 */

@Component
@RestController
@RequestMapping("/first")
public class firstController {

    // 访问yml文件下的数据
    @Value("${country}")
    private String country1;
    // 多级数据访问
    @Value("${user.name}")
    private String name1;
    // 数据引用
    @Value("${tempDir}")
    private String tempDir1;

    // 使用自动装配加载所有yml中的数据
    @Autowired
    private Environment environment;

    @GetMapping
    public String getById() {

        String text = "The first springBoot101 Application";
        System.out.println(text);
        System.out.println("The country =====> " + country1);
        System.out.println("The user.name =====> " + name1);
        System.out.println("The tempDir =====> " + tempDir1);
        System.out.println("=-=========================-=");
        System.out.println(environment.getProperty("country"));
        System.out.println(environment.getProperty("user.name"));
        System.out.println(environment.getProperty("user.age"));
        System.out.println(environment.getProperty("tempDir"));
        return text;
    }

}
