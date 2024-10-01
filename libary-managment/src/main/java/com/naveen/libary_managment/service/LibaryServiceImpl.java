package com.naveen.libary_managment.service;

import com.naveen.libary_managment.entity.Book;
import com.naveen.libary_managment.entity.Libary;
import com.naveen.libary_managment.exception.BookNotFoundException;
import com.naveen.libary_managment.exception.LibaryNotFoundException;
import com.naveen.libary_managment.repository.BookRepository;
import com.naveen.libary_managment.repository.LibaryRepository;
import com.naveen.libary_managment.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LibaryServiceImpl implements LibaryService{

    @Autowired
    private LibaryRepository libaryRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Libary> findAll() {
        return libaryRepository.findAll();
    }

    @Override
    public Libary findById(int libaryId) {
        Libary libary=libaryRepository.findById(libaryId).orElseThrow(()->new LibaryNotFoundException(Constants.LIBARY_NOT_FOUND));
        return libary;
    }

    @Override
    public void saveLibary(Libary libary) {
        libaryRepository.save(libary);
    }

    @Override
    public void deleteLibary(int libaryId) {
        Libary libary=libaryRepository.findById(libaryId).orElseThrow(()->new LibaryNotFoundException(Constants.LIBARY_NOT_FOUND));
        libaryRepository.delete(libary);
    }

    @Override
    public Libary saveBookForLibary(int bookId, int libaryId) {
        Book book=bookRepository.findById(bookId).orElseThrow(()->new BookNotFoundException(Constants.BOOK_NOT_FOUND));
        Libary libary=libaryRepository.findById(libaryId).orElseThrow(()->new LibaryNotFoundException(Constants.LIBARY_NOT_FOUND));

        book.setLibary(libary);

        bookRepository.save(book);
        return libary;
    }

    @Override
    public Libary deleteBookForLibary(int bookId, int libaryId) {
        Book book=bookRepository.findById(bookId).orElseThrow(()->new BookNotFoundException(Constants.BOOK_NOT_FOUND));
        bookRepository.delete(book);
        Libary libary=libaryRepository.findById(libaryId).orElseThrow(()->new LibaryNotFoundException(Constants.LIBARY_NOT_FOUND));
        return libary;
    }

    @Override
    public Libary updateLibary(int libaryId, Libary libary) {
        Libary oldLibary=libaryRepository.findById(libaryId).orElseThrow(()->new LibaryNotFoundException(Constants.LIBARY_NOT_FOUND));

        if(libary.getName()!=null){
            oldLibary.setName(libary.getName());
        }
        if(libary.getLocation()!=null){
            oldLibary.setLocation(libary.getLocation());
        }
        libaryRepository.save(oldLibary);
        return oldLibary;
    }


}
