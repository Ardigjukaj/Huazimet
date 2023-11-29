package com.example.huazimet;

import jakarta.persistence.*;

import java.awt.print.Book;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String username;
    private String email;

    @OneToMany(mappedBy = "user")
    private List<Book> borrowedBooks;


    public User(String username, String email, List<Book> borrowedBooks) {
        this.username = username;
        this.email = email;
        this.borrowedBooks = borrowedBooks;
    }


    public User() {

    }
}
