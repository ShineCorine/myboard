package com.example.momorydb.book.service;

import com.example.momorydb.book.db.BookRepository;
import com.example.momorydb.book.entity.BookEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public void delete(Long id){
        bookRepository.delete(id);
    }

    // find one




}



// 위의 코드와 동일하다. 롬복에서 제공한다.

//@Service
//@RequiredArgsConstructor
//public class BookService {
//    private final BookRepository bookRepository;
//}


//@Service
//@RequiredArgsConstructor
//public class BookService {
//
//    @Autowired
//    private  BookRepository bookRepository;
//}
