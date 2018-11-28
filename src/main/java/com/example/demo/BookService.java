package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService{
    @Autowired BookDao bookDao;
    public List<Book> findAll(){
        List<Book> book = bookDao.findAll();
        return book;
    }
    public int add(){
        return bookDao.add();
    }
}
