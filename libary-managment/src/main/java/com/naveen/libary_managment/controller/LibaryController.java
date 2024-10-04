package com.naveen.libary_managment.controller;


import com.naveen.libary_managment.entity.Libary;
import com.naveen.libary_managment.service.LibaryService;
import com.naveen.libary_managment.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Constants.LIBRARIES)
public class LibaryController {

    @Autowired
    private LibaryService libaryService;

    @GetMapping(Constants.EMPTY)
    public List<Libary> findAll(){
        return libaryService.findAll();
    }

    @GetMapping(Constants.LIBARY_ID)
    public Libary findById(@PathVariable("libaryId") int libaryId){
        return libaryService.findById(libaryId);
    }


    @PostMapping(Constants.EMPTY)
    public String saveLibary(@RequestBody Libary libary){
        libaryService.saveLibary(libary);
        return Constants.SAVED;
    }

    @PatchMapping(Constants.LIBARY_ID)
    public Libary updateLibary(@PathVariable("libaryId") int libaryId,@RequestBody Libary libary){
        return libaryService.updateLibary(libaryId,libary);
    }

    @DeleteMapping(Constants.LIBARY_ID)
    public String deleteLibary(@PathVariable("libaryId") int libaryId){
        libaryService.deleteLibary(libaryId);
        return Constants.DELETED+libaryId;
    }


    @PostMapping(Constants.LIBARY_ID_BOOK_ID)
    public Libary saveBookForLibary(@PathVariable("libaryId") int libaryId,@PathVariable("bookId") int bookId){
        return libaryService.saveBookForLibary(bookId,libaryId);
    }

    @DeleteMapping(Constants.LIBARY_ID_BOOK_ID)
    public Libary deleteBookForLibary(@PathVariable("libaryId") int libaryId,@PathVariable("bookId") int bookId){
        return libaryService.deleteBookForLibary(bookId,libaryId);
    }
}
