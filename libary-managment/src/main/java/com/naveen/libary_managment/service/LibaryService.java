package com.naveen.libary_managment.service;

import com.naveen.libary_managment.entity.Libary;

import java.util.List;

public interface LibaryService {

    public List<Libary> findAll();

    public Libary findById(int libaryId);

    public void saveLibary(Libary libary);

    public void deleteLibary(int libaryId);


    public Libary saveBookForLibary(int bookId,int libaryId);

    public Libary deleteBookForLibary(int bookId,int libaryId);

   public Libary updateLibary(int libaryId, Libary libary);
}
