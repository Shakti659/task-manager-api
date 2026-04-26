package com.taskmanager.app.controller;


import com.taskmanager.app.dto.LoginRequest;
import com.taskmanager.app.dto.UserRequest;
import com.taskmanager.app.dto.UserResponse;
import com.taskmanager.app.model.User;
import com.taskmanager.app.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.taskmanager.app.dto.LoginRequest;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    public String test() {
        return "working";
    }

    @PostMapping("/signup")
    public User register(@Valid @RequestBody UserRequest request){
        return userService.register(request);
    }

    @PostMapping("/login")
    public UserResponse login(@Valid @RequestBody LoginRequest request){
        return userService.login(request);
    }
}
