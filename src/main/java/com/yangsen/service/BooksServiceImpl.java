package com.yangsen.service;

import com.yangsen.dao.BooksMapper;
import com.yangsen.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService{
    //组合dao,
    private BooksMapper booksMapper;

    //set方法供IOC使用
    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return booksMapper.deleteBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBook() {
        return booksMapper.queryAllBook();
    }
}
