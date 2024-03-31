package com.example.Flight_App_Backend.CONTROLLER;


import com.example.Flight_App_Backend.MODEL.User;
import com.example.Flight_App_Backend.SERVICE.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "http://localhost:3000")

public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public void createUser(@RequestBody User user) {
        userService.addUser(user);
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @PutMapping("/update/{userID}")
    public User updateUser(@RequestBody User newUser,@PathVariable Long userID) {
        return userService.updateUser(userID, newUser);
    }

}
