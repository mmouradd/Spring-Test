package com.example.SpringCrud.reposotories;
import com.example.SpringCrud.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<Book, Long> {}
