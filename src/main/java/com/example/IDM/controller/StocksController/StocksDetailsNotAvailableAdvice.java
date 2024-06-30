package com.example.IDM.controller.StocksController;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class StocksDetailsNotAvailableAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(StocksDetailNotAvailableException.class)
    String dataNotavail(StocksDetailNotAvailableException ex){
        return ex.getMessage();
    }
}
