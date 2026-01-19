package com.ses_service.exception;

public class SESNotFoundException extends RuntimeException{
    public SESNotFoundException(String message){
        super(message);
    }
}
