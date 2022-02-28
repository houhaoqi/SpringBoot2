package com.haoqi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Springboot01Application {
    @RequestMapping("/")
    String home(){
        System.out.println("hello haoqi");
        return "hello haoqi";
    }


    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
