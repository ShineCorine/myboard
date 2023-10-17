package com.example.momorydb.user.db;

import com.example.momorydb.db.SimpleDataRepository;
import com.example.momorydb.user.model.UserEntity;
import org.springframework.stereotype.Service;


@Service
public class UserRepository extends SimpleDataRepository<UserEntity, Long> {

}
