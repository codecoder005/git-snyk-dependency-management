package com.lmig.controller;

import com.lmig.persistance.entity.UserEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
    @GetMapping
    public List<UserEntity> getAllUsers(){
        return List.of(
                new UserEntity(101L, "101@email", "John"),
                new UserEntity(102L, "102@email", "Mark"),
                new UserEntity(103L, "103@email", "Donald")
        );
    }
}
