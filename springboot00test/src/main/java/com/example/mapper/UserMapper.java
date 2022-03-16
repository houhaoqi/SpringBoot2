package com.example.mapper;

import com.example.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author haoqi
 * @Date 2022/3/15 - 22:48
 */


public interface UserMapper {

    @Insert("INSERT into userdb values(null,#{name},#{age});")
    int insertUser(@Param("name") String name,@Param("age") Integer age);

    @Select("SELECT id as id, name as name, age as age from userdb ;")
    UserEntity selectUserById();

}
