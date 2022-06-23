package com.yangsen.dao;

import com.yangsen.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//为Books表定义一些操作
public interface BooksMapper {
    //增
    int addBook(Books books);

    //删除
    int deleteBookById(@Param("bookId") int id);

    //更新
    int updateBook(Books books);

    //查询
    Books queryBookById(@Param("bookId") int id);

    //列表
    List<Books> queryAllBook();
}
