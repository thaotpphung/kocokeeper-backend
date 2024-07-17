package com.kocokeeper.backend.repository;

import com.kocokeeper.backend.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
