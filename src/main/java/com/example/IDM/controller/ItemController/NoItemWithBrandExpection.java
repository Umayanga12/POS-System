package com.example.IDM.controller.ItemController;

public class NoItemWithBrandExpection extends RuntimeException{
    NoItemWithBrandExpection(String brand){
        super(brand+"is not available");
    }
}
