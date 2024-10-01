package com.naveen.libary_managment.exception;


import lombok.Data;

@Data
public class CustomExceptionError {

    public int status;
    public String message;
    public  String timeStamp;
}
