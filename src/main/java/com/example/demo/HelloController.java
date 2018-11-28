package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class HelloController {
    @Autowired BookService bookService;
    @RequestMapping("/hello")
    public List<Book> hello(){
        return bookService.findAll();
    }
    @RequestMapping("/add")
    public  List<Book> add(){
        bookService.add();
        return bookService.findAll();
    }
}
