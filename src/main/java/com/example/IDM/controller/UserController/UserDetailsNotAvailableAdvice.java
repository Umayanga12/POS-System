package com.example.IDM.controller.UserController;

import com.example.IDM.controller.StocksController.StocksDetailNotAvailableException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserDetailsNotAvailableAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserDetailNotAvailableExpection.class)
    String dataNotavial(StocksDetailNotAvailableException ex){return ex.getMessage();}
}
