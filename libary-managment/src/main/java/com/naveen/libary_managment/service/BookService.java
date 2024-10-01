package com.naveen.libary_managment.service;

import com.naveen.libary_managment.entity.Book;

import java.util.List;

public interface BookService {


    public List<Book> findAll();

    public Book findById(int bookId);

    public void saveBook(Book book);

    public void deleteBook(int bookId);

   public Book updateBook(int bookId, Book book);
}
