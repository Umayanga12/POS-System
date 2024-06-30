package com.example.IDM.controller.BrandController;

public class BrandDetailNotAvailableException extends RuntimeException{
    BrandDetailNotAvailableException(Long id){
        super(id + "Details Not Available");
    }
}
