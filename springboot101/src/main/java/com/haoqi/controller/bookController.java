package com.haoqi.controller;

import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;

/**
 * @author haoqi
 * @Date 2022/3/1 - 13:29
 */

@RestController
@RequestMapping("/books")
public class bookController {

//    @RequestMapping(method = RequestMethod.POST)
    @PostMapping
    @ResponseBody //将Java对象转换为json格式数据
    public String postTest(Book book){
        String str = "{'module':'book save'}";
        System.out.println("POST请求："+str+book);

        return "Post 请求";
    }


    @GetMapping
    @ResponseBody
    public String getTest(Book book){
        String str = "{'module':'book save'}";
        System.out.println("GET请求："+str+book);

        return "Get 请求";
    }

}
