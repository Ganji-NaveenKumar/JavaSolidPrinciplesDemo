package com.naveen.libary_managment.service;

import com.naveen.libary_managment.entity.Book;
import com.naveen.libary_managment.exception.BookNotFoundException;
import com.naveen.libary_managment.repository.BookRepository;
import com.naveen.libary_managment.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int bookId) {
        Book book=bookRepository.findById(bookId).orElseThrow(()->new BookNotFoundException(Constants.BOOK_NOT_FOUND));
        return book;
    }

    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void deleteBook(int bookId) {
        Book book=bookRepository.findById(bookId).orElseThrow(()->new BookNotFoundException(Constants.BOOK_NOT_FOUND));
        bookRepository.delete(book);
    }

    @Override
    public Book updateBook(int bookId, Book book) {
        Book oldBook=bookRepository.findById(bookId).orElseThrow(()->new BookNotFoundException(Constants.BOOK_NOT_FOUND));
        if(book.getName()!=null){
            oldBook.setName(book.getName());
        }
        bookRepository.save(oldBook);
        return oldBook;
    }
}
