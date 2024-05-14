package com.example.crud_using_Maven.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.crud_using_Maven.model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book, Long> {

}
