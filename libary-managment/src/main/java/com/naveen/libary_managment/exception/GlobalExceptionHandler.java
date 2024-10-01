package com.naveen.libary_managment.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LibaryNotFoundException.class)
    public ResponseEntity<CustomExceptionError> handleException(LibaryNotFoundException exc){
        CustomExceptionError custom=new CustomExceptionError();
        custom.setMessage(exc.getMessage());
        custom.setStatus(HttpStatus.NOT_FOUND.value());
        custom.setTimeStamp(String.valueOf(System.currentTimeMillis()));

        return new ResponseEntity<>(custom,HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(BookNotFoundException.class)
    public ResponseEntity<CustomExceptionError> handleException(BookNotFoundException exc){
        CustomExceptionError custom=new CustomExceptionError();
        custom.setMessage(exc.getMessage());
        custom.setStatus(HttpStatus.NOT_FOUND.value());
        custom.setTimeStamp(String.valueOf(System.currentTimeMillis()));

        return new ResponseEntity<>(custom,HttpStatus.NOT_FOUND);
    }
}
