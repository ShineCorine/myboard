package com.example.momorydb.user.model;

import com.example.momorydb.entity.Entity;
import lombok.*;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

// 데이터베이스에 저장하기 위해 이름을 UserEntity로 명명.
public class UserEntity extends Entity {

    private String name;
    private int score;
}
