package com.taskmanager.app.controller;


import com.taskmanager.app.dto.*;
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
    public AuthResponse login(@RequestBody LoginRequest request){
        return userService.login(request);
    }
    }


