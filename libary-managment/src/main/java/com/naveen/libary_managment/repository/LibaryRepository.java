package com.naveen.libary_managment.repository;

import com.naveen.libary_managment.entity.Libary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibaryRepository extends JpaRepository<Libary,Integer> {
}
