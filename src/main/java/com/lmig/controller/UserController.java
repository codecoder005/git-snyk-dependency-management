package com.lmig.controller;

import com.lmig.persistance.entity.UserEntity;
import com.lmig.request.UserRequestDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/users")
public class UserController {
    private final static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
    private List<UserEntity> users = List.of(
            new UserEntity(101L, "101@email", "John", null, null),
            new UserEntity(102L, "102@email", "Mark", null, null),
            new UserEntity(103L, "103@email", "Donald", null, null)
    );
    @GetMapping
    public List<UserEntity> getAllUsers(){
        LOGGER.info("UserController.getAllUsers()");
        return users;
    }

    @GetMapping("/{uid}")
    public UserEntity getUserById(@PathVariable Long uid) {
        LOGGER.info("UserController.getUserById()");
        return users.stream()
                .filter(user -> user.getUid().equals(uid))
                .findFirst()
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
    }

    @PostMapping
    public ResponseEntity<Object> saveUser(@Valid @RequestBody UserRequestDto requestDto){
        try{
            System.out.println(requestDto);
            LOGGER.info("UserController.saveUser()");
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            throw new ResponseStatusException(HttpStatus.SERVICE_UNAVAILABLE, requestDto.toString());
        }
    }
}
