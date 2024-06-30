package com.example.IDM.controller.StocksController;


public class StocksDetailNotAvailableException extends RuntimeException{
    StocksDetailNotAvailableException(Long id){
        super(id + "Details are Not Available");
    }

}
