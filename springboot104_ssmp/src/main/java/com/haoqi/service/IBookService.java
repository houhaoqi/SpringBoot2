package com.haoqi.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoqi.domain.Book;

/**
 * @author haoqi
 * @Date 2022/3/6 - 21:20
 */
public interface IBookService extends IService<Book> {
    //自定义方法功能追加
//    boolean saveBook(Book book);
//    boolean removeById(Book book);
}
