package com.example.momorydb.user.service;


import com.example.momorydb.user.db.UserRepository;
import com.example.momorydb.user.model.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    // save를 위해 repository 필요
    @Autowired
    private final UserRepository userRepository;
    // userRepository가 bean으로 등록되지 않아서 찾아지지 않음. <- bean으로 등록시켜야 함
    public UserEntity save(UserEntity user){
        return userRepository.save(user);
    }


    public List<UserEntity> findAll(){
        return userRepository.findAll();
    }

    public void deleteById(Long id){
        userRepository.delete(id);
    }

    public Optional<UserEntity> findById(Long id){
        return userRepository.findById(id);
    }

    public List<UserEntity> filterScore(int score){
        return userRepository.findAllScoreGreaterThan(score);
    }


}
