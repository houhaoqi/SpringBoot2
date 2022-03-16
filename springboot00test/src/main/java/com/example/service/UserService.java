package com.example.service;

import com.example.entity.UserEntity;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haoqi
 * @Date 2022/3/15 - 22:13
 */
@RestController
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insertUser")
    public String insertUser(String name,Integer age){
        int update = jdbcTemplate.update("insert into userdb values(null,?,?)",name,age);
        return update > 0 ? "success" : "false";
    }

    //mybatis
    @RequestMapping("/mybatisFind")
    public UserEntity mybatisFindById(){
//        System.out.println("mybatisFind");
        return userMapper.selectUserById();
    }

    @RequestMapping("/mybatisInsert")
    public String mybatisInsert(String name,Integer age){
        int update = userMapper.insertUser(name,age);
        return update > 0 ? "success" : "false";
    }

    @RequestMapping("/testDevtools")
    public String testDevtools(){
        return "devTools is successfully!";
    }


}
