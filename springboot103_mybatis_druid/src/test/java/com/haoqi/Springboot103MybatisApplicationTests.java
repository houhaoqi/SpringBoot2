package com.haoqi;

import com.haoqi.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot103MybatisApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void contextLoads() {
        //需要打开BookDao 中 mybatis注释
        System.out.println(bookDao.getById(1));
        //mybatis plus
//        System.out.println(bookDao.selectById(1));
    }

}
