package com.example.IDM.controller.SalesController;

public class SalesDetailNotAvailableException extends RuntimeException{
    SalesDetailNotAvailableException(Long id){
        super(id + "Details are not Available");
    }
}
