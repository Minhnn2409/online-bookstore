package com.nnminh.onlinebookstore.repository;

import com.nnminh.onlinebookstore.enitity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
