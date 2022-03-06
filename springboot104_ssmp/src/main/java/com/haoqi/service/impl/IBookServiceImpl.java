package com.haoqi.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.haoqi.dao.BookDao;
import com.haoqi.domain.Book;
import com.haoqi.service.IBookService;
import org.springframework.stereotype.Service;

/**
 * @author haoqi
 * @Date 2022/3/6 - 21:29
 */
@Service
public class IBookServiceImpl extends ServiceImpl<BookDao, Book> implements IBookService {


}
