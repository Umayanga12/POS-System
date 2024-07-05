package com.example.IDM.controller.UserController;

public class UserDetailNotAvailableExpection extends RuntimeException {
    public UserDetailNotAvailableExpection(long id) {
        super(id + "Data is not avaiable");
    }
}
