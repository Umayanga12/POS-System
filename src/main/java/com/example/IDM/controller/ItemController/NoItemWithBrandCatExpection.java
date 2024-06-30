package com.example.IDM.controller.ItemController;

public class NoItemWithBrandCatExpection extends RuntimeException{
    NoItemWithBrandCatExpection(String category, String brand){
        super("No" + brand + "item under the " +category+ "category" );
    }
}
