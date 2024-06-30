package com.example.IDM.controller.UserController;

public class UserDetailNotAvailableExpection extends  RuntimeException{
    UserDetailNotAvailableExpection(long id){
        super(id + "Details are not found");
    }
}
