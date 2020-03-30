package com.bookstore.onlinebookstore.repositories;

import com.bookstore.onlinebookstore.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositories extends JpaRepository<Book, Long> {
}
