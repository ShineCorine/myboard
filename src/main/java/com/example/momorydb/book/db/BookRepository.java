package com.example.momorydb.book.db;

import com.example.momorydb.book.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;



//repository는 bean으로 등록되어 관리되어어야 다른 부분과 연결될 수 있다?
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
