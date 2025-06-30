package com.example.SpringCrud.controllers;
import com.example.SpringCrud.entities.Book;
import com.example.SpringCrud.reposotories.BookRepo;
import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepo repo;

    @PostMapping("/add")
    public Book createBook(@RequestBody Book Book) {
        return repo.save(Book);
    }

    @GetMapping("list")
    public List<Book> getBooks() {
        return repo.findAll();
    }

    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book updatedBook) {
        return repo.findById(id).map(Book -> {
                    Book.setBook_name(updatedBook.getBook_name());
                    return repo.save(Book);
                })
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteUser(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
