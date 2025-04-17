package com.java.login.Internal;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    private String genre;
    private String isbn;

    public Book(String title, String author, String genre, String isbn) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Book(Title: " + title + ", Author: " + author + ", Genre: " + genre + ", ISBN: " + isbn + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null && obj instanceof Book) {
            Book b = (Book) obj;
            if (Objects.equals(this.title, b.title) && Objects.equals(this.isbn, b.isbn)) {
                System.out.println("Book title and ISBN match");
                return true;
            }
        }
        return false;
    }
}
