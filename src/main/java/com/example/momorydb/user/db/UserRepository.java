package com.example.momorydb.user.db;

import com.example.momorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository extends JpaRepository<UserEntity, Long> {
}
