package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author haoqi
 * @Date 2022/3/15 - 15:53
 */
@Controller
public class FreemarkerIndexController {
    @RequestMapping("/freemarkerIndex")
    public String freemarkerIndex(Map<String,String> result, HttpServletRequest request){
        //转发到页面展示数据
        result.put("name","haoqi");
        return "freemarkerIndex";
    }

}
