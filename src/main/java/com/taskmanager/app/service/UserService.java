package com.taskmanager.app.service;


import com.taskmanager.app.dto.LoginRequest;
import com.taskmanager.app.dto.UserRequest;
import com.taskmanager.app.dto.UserResponse;
import com.taskmanager.app.model.User;
import com.taskmanager.app.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;



    public User register(UserRequest request){

        //check if user already exist
        if(userRepository.findByUsername(request.getUsername()).isPresent()){
            throw new RuntimeException("Username already exists");
        }

        User user=new User();
        user.setUsername(request.getUsername());
        user.setPassword(passwordEncoder.encode(request.getPassword()));

        return userRepository.save(user);
    }

    public UserResponse login(LoginRequest request){

        //check user exists

        User user=userRepository.findByUsername(request.getUsername()).orElseThrow(() -> new RuntimeException("User not found"));

        //check password
        if(!passwordEncoder.matches(request.getPassword(),user.getPassword())){
            throw new RuntimeException("Invalid password");
        }

        //retun safe response
        UserResponse res=new UserResponse();
        res.setId(user.getId());
        res.setUsername(user.getUsername());
        return res;
    }
}
