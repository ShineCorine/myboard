package com.example.momorydb.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class Entity implements PrimaryKey{

    @Setter
    private Long id;
}
