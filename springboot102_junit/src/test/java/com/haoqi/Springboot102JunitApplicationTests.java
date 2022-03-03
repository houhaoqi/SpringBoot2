package com.haoqi;

import com.haoqi.dao.bookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = Springboot102JunitApplication.class)
class Springboot102JunitApplicationTests {

    //注入测试对象
    @Autowired
    private bookDao book;

    @Test
    void contextLoads() {
        System.out.println("spring boot Junit is running !");
        book.save();
    }

}
