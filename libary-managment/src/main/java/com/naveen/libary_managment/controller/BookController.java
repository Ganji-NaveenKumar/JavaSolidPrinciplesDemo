package com.naveen.libary_managment.controller;


import com.naveen.libary_managment.entity.Book;
import com.naveen.libary_managment.service.BookService;
import com.naveen.libary_managment.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.BOOKS)
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping(Constants.EMPTY)
    public List<Book> findAll(){
        return bookService.findAll();
    }

    @GetMapping(Constants.BOOK_ID)
    public Book findBYId(@PathVariable("bookId") int bookId){
        return bookService.findById(bookId);
    }

    @PostMapping(Constants.EMPTY)
    public String saveBook(@RequestBody Book book){
        bookService.saveBook(book);
        return Constants.BOOK_SAVED;
    }

    @DeleteMapping(Constants.BOOK_ID)
    public String deleteBook(@PathVariable int bookId){
        bookService.deleteBook(bookId);
        return Constants.BOOK_DELETED;
    }

    @PatchMapping(Constants.BOOK_ID)
    public Book updateBook(@PathVariable int bookId,@RequestBody Book book){
        return bookService.updateBook(bookId,book);
    }
}
