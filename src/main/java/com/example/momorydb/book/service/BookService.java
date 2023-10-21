package com.example.momorydb.book.service;

import com.example.momorydb.book.db.BookRepository;
import com.example.momorydb.book.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    private final BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;

        // BookService 클래스에  service 어노테이션이 붙으면
        // 객체가 생성될 때 자바 스프링이 생성자 안에 bookRepository를 전달해준다.
        //빈을 주입한다는 표현을 씀

    }

    //create, update
    public BookEntity create(BookEntity book){
        return bookRepository.save(book);
    }

    // all
    public List<BookEntity> findAll(){
        return bookRepository.findAll();
    }

    // delete
    public void delete(BookEntity id){
        bookRepository.delete(id);
    }

    // find one
    public Optional<BookEntity> find(Long id){
        return bookRepository.findById(id);
    }

}
