package com.yangsen.service;

import com.yangsen.pojo.Books;

import java.util.List;

public interface BooksService {
    //增
    int addBook(Books books);

    //删除
    int deleteBookById(int id);

    //更新
    int updateBook(Books books);

    //查询
    Books queryBookById(int id);

    //列表
    List<Books> queryAllBook();
}
