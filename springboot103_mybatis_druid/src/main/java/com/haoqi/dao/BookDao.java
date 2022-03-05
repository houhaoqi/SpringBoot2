package com.haoqi.dao;

import com.haoqi.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author haoqi
 * @Date 2022/3/4 - 22:38
 */

//--------mybatis---------
@Mapper
@Repository
public interface BookDao {
    @Select("select * from testdb where id = #{id}")
    public Book getById(Integer id);
}


//--------mybatis plus---------
//@Mapper
//@Repository
//public interface BookDao extends BaseMapper<Book> {  //BaseMapper包含了所需的方法
//}