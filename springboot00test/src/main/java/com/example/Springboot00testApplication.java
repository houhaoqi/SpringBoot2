package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mapper")
public class Springboot00testApplication {

    /*
     * @SpringBootApplication == @EnableAutoConfiguration + @ComponentScan
     * //扫描同级别包或者子包下所有类，并注入
     * @param args
     */

    public static void main(String[] args) {
        SpringApplication.run(Springboot00testApplication.class, args);
    }

}
