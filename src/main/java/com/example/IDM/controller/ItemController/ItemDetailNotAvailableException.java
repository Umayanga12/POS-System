package com.example.IDM.controller.ItemController;

public class ItemDetailNotAvailableException extends RuntimeException{
    ItemDetailNotAvailableException(Long id){
        super(id+ "Item Details Are Not Available");
    }
}
