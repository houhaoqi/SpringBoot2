package com.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.logging.Logger;

/**
 * @author haoqi
 * @Date 2022/3/15 - 16:28
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class UserEntity {
//    private static Logger logger = Logger.getLogger(UserEntity.class);
//
//    private Integer id;
    private String name;
    private Integer age;

//    public UserEntity(String name, Integer age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public UserEntity(Integer id,String name, Integer age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
//
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public void setAge(Integer age) {
//        this.age = age;
//    }
//
//
//    @Override
//    public String toString() {
//        return "UserEntity{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }

    public static void main(String[] args) {
        UserEntity userEntity = new UserEntity();
        userEntity.setAge(1);
        int userAge = userEntity.getAge();
        System.out.println(userAge);

        log.info("userAge: "+ userAge);
    }

}
