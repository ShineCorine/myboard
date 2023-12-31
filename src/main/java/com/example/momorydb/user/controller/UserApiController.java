package com.example.momorydb.user.controller;


import com.example.momorydb.user.model.UserEntity;
import com.example.momorydb.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController {

    private final UserService userService;

    // Entity는 컨트롤러에서 받으면 안되지만 여기서는 우선 그렇게 함.
    @PutMapping("")
    public UserEntity create(
            @RequestBody UserEntity userEntity
    ){
        return userService.save(userEntity);
    }

    @GetMapping("/all")
    public List<UserEntity> findAll(){

        return userService.findAll();
    }

    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ){
//        userService.deleteById(id);
    }

    @GetMapping("/id/{id}")
    public UserEntity findById(
            @PathVariable Long id
    ){
        var response = userService.findById(id);
        return response.get();
    }

    @GetMapping("/score")
    public List<UserEntity> filterScore(
            @RequestParam int score
    ){
        return userService.filterScore(score);
    }
    @GetMapping("/min_max")
    public List<UserEntity> filterScore(
            @RequestParam int min, @RequestParam int max
    ){
        return userService.filterScore(min, max);
    }



}
