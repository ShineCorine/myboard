package com.example.momorydb.user.db;

import com.example.momorydb.user.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<UserEntity, Long> {

    //ex)  select * from user where 조건
    List<UserEntity> findAllByScoreGreaterThanEqual(int score);

    List<UserEntity> findAllByScoreGreaterThanEqualAndScoreLessThanEqual(int min, int max);

    @Query(
        value="select * from user as u where u.score >= :min AND u.score <= :max",
            nativeQuery = true
    )
    List<UserEntity> score (
            @Param(value="min") int min,
            @Param(value="max") int max);
}