package com.example.momorydb.book.entity;

import com.example.momorydb.entity.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor

public class BookEntity extends Entity {
    private String title;
    private String isbn;
    private String author;
    private int price;
}
