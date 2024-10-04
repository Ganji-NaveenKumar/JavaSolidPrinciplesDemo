package com.naveen.libary_managment.repository;

import com.naveen.libary_managment.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
