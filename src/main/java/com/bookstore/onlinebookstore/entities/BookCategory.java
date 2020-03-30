package com.bookstore.onlinebookstore.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class BookCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookCategory")
    private Set<Book> books;
}
