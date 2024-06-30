package com.example.IDM.controller.SalesController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class SalesDetailsNotAvailableAdvice {
    @ResponseBody
    @ExceptionHandler(StringIndexOutOfBoundsException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String datanotava(SalesDetailNotAvailableException ex){
        return ex.getMessage();
    }
}
