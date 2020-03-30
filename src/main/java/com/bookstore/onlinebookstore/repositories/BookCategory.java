package com.bookstore.onlinebookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategory extends JpaRepository<BookCategory, Long> {
}
