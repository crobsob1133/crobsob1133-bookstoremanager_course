package com.carlosrobson.bookstoremanager.books.repository;

import com.carlosrobson.bookstoremanager.books.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Book, Long> {
}
