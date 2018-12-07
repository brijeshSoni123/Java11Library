package com.lib.controller;


import com.lib.domain.BookEntity;
import com.lib.manager.BookManager;
import com.lib.valueobject.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {

@Autowired
    BookManager bookManager;

    @GetMapping(value="/books")
    public Iterable<BookEntity> getBooks(){
        System.out.print("Inside the controller "+bookManager);
        System.out.print("Inside the controller "+bookManager.getAllBooks());
        return bookManager.getAllBooks();
    }



}
