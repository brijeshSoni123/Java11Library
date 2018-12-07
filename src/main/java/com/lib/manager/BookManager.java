package com.lib.manager;

import com.lib.domain.BookEntity;
import com.lib.repository.BookRepository;
import com.lib.valueobject.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManager {
    @Autowired
    BookRepository bookRepository;

    public Iterable<BookEntity> getAllBooks(){
        System.out.print("Inside the manager   "+ bookRepository);
        Iterable<BookEntity> list=bookRepository.findAll();
        System.out.print("Inside the manager   END.."+ list.toString());
        return list;
    }

}
