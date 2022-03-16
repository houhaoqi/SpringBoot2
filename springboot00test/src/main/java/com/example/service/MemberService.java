package com.example.service;

import com.example.entity.YmlEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.rmi.runtime.Log;

/**
 * @author haoqi
 * @Date 2022/3/15 - 14:28
 */
@RestController
@EnableAutoConfiguration
@Slf4j
public class MemberService {

    //读取propertie文件配置
    @Value("${test.name}")
    private String name;
    @Value("${test.age}")
    private String age;
    //通过YmlEntity类中@ConfigurationProperties(prefix = "test")注解读取配置文件内容
    @Autowired
    private YmlEntity ymlEntity;
    @RequestMapping("/ymlEntity")
    public String ymlEntity(){
        return ymlEntity.toString();
    }

    @RequestMapping("/member")
    public String member(){
        return "member页面";
    }

    @GetMapping("/properties")
    public String properties(){
        return name+" -- "+age;
    }


    //日志打印
    @RequestMapping("/getLog")
    public String getLog(String name,int age){
//        log.info("name:{},age:{}",name,age);
//        try {
//        }catch (Exception e){
//            log.error("");
//        }
        return name;
    }



}
