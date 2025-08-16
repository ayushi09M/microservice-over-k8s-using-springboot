package com.learnToCode.accounts.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{

    public ResourceNotFoundException(String resourceName, String fieldName,  String fieldValue){
//    As this super is only acccepting one param, so we make a one message to pass this super.
//        super(message);

        super(String.format("%s not found with %s : '%s'", resourceName, fieldName, fieldValue));
    }
}
