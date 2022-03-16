package com.example.controller;

import com.example.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * @author haoqi
 * @Date 2022/3/15 - 16:26
 */
@Controller
//@ResponseBody
public class ThymeleafController {
    @RequestMapping("/myThymeleaf")
    public String thymeleaf(HttpServletRequest result,Map<String,Object> request){
        request.put("users",new UserEntity("haoqi",21));
        return "myThymeleaf";
    }

}
