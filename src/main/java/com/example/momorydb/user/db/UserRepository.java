package com.example.momorydb.user.db;

import com.example.momorydb.db.SimpleDataRepository;
import com.example.momorydb.user.model.UserEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserRepository extends SimpleDataRepository<UserEntity, Long> {

    public List<UserEntity> findAllScoreGreaterThan(int score){
        return this.findAll().stream()
                .filter(it -> {
                    return it.getScore() >= score;
                    }
                ).collect(Collectors.toList());

    }
}
