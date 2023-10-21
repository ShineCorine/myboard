package com.example.momorydb.book.controller;

import com.example.momorydb.book.entity.BookEntity;
import com.example.momorydb.book.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookApiController {

    private final BookService bookService;

    @PostMapping("")
    public BookEntity create(
            @RequestBody BookEntity bookEntity
    ){
       return bookService.create(bookEntity);
    }

    @GetMapping("/all")
    public List<BookEntity> findAll(){
        return bookService.findAll();
    }


    @DeleteMapping("/id/{id}")
    public void delete(
            @PathVariable Long id
    ){
        bookService.delete(id);
    }


    @GetMapping("/id/{id}")
    public BookEntity findById(
            @PathVariable Long id
    ){
        return bookService.find(id).get();

    }

//    @GetMapping("/find")
//    public BookEntity findByName(
//    )
}
