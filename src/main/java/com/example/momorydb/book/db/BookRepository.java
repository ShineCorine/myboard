package com.example.momorydb.book.db;

import com.example.momorydb.book.entity.BookEntity;
import com.example.momorydb.db.SimpleDataRepository;
import org.springframework.stereotype.Service;



//repository는 bean으로 등록되어 관리되어어야 다른 부분과 연결될 수 있다?
@Service
public class BookRepository extends SimpleDataRepository<BookEntity, Long> {
}
