package com.bookstore.onlinebookstore.repositories;

import com.bookstore.onlinebookstore.entities.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
