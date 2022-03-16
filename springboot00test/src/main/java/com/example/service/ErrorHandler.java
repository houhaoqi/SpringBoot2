package com.example.service;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author haoqi
 * @Date 2022/3/16 - 14:28
 */

@ControllerAdvice
public class ErrorHandler {
    //捕获全局异常
    @ExceptionHandler(RuntimeException.class)
    @ResponseBody
    public Map<Object,Object> exceptionHandler(){
        HashMap<Object,Object> result = new HashMap<>();
        result.put("code: ",500);
        result.put("msg: ","系统错误");
        return result;
    }
}
