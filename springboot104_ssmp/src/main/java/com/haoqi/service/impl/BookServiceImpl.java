package com.haoqi.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.haoqi.dao.BookDao;
import com.haoqi.domain.Book;
import com.haoqi.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author haoqi
 * @Date 2022/3/6 - 16:11
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean save(Book book) {
        return false;
    }

    @Override
    public boolean update(Book book) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public Book getById(Integer id) {
        return null;
    }

    @Override
    public List<Book> getAll() {
        return null;
    }

    @Override
    public IPage<Book> getByPage(int currentPage, int size) {
        return null;
    }
}
