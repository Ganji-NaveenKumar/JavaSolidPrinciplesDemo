package com.naveen.libary_managment.exception;

public class LibaryNotFoundException extends RuntimeException {
    public LibaryNotFoundException(String message) {
        super(message);
    }
}
