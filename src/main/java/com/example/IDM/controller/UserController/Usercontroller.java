package com.example.IDM.controller.UserController;


import com.example.IDM.model.UserModel;
import com.example.IDM.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class Usercontroller {
    private final UserRepo userRepo;

    @Autowired
    public Usercontroller(UserRepo userRepo){
        this.userRepo = userRepo;
    }

    @PostMapping("/add")
    UserModel newUser(@RequestBody UserModel newUser){
        return userRepo.save(newUser);
    }

    @GetMapping("/{id}")
    UserModel getUserDetailById(@PathVariable long id){
        return userRepo.findById(id).orElseThrow(() -> new UserDetailNotAvailableExpection(id));
    }

    @PutMapping("update/{id}")
    public ResponseEntity<UserModel> updateUserDetail(@PathVariable long id, @RequestBody UserModel updatedUserDetail){
        Optional<UserModel> user = userRepo.findById(id);
        if (user.isPresent()){
            UserModel oldUserDetail = user.get();
            oldUserDetail.setUsername(updatedUserDetail.getUsername());
            oldUserDetail.setPassword(updatedUserDetail.getPassword());
            oldUserDetail.setName(updatedUserDetail.getName());
            oldUserDetail.setEmail(updatedUserDetail.getEmail());
            UserModel newDetail = userRepo.save(oldUserDetail);
            return ResponseEntity.ok(newDetail);
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
