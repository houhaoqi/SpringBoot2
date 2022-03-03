package com.haoqi.service;

import com.haoqi.dao.bookDao;
import org.springframework.stereotype.Repository;

/**
 * @author haoqi
 * @Date 2022/3/2 - 17:29
 */
@Repository
public class bookDaoImpl implements bookDao {

    @Override
    public void save() {
        System.out.println("bookDao is running");
    }
}
