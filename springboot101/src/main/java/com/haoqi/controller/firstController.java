package com.haoqi.controller;

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
    @GetMapping
    public String getById(){

        String text = "The first springBoot101 Application";
        System.out.println(text);

        return text;
    }

}
