package com.example.SpringCrud.entities;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.*;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String Book_name;
    private String Book_auth;

    public long getID() {
        return id;
    }

    public String getBook_name() {
        return Book_name;
    }

    public String getBook_auth() {
        return Book_auth;
    }


    public void setBook_name(String book_name) {
        Book_name = book_name;
    }

    public void setBook_auth(String book_auth) {
        Book_auth = book_auth;
    }


    @Override
    public String toString() {
        return "Book{" +
                "ID=" + id +
                ", Name='" + Book_name + '\'' +
                ", Author='" + Book_auth + '\'' +
                '}';
    }



}
