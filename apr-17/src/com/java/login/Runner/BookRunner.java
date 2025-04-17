package com.java.login.Runner;

import com.java.login.Internal.Book;

public class BookRunner {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "Fiction", "9780061122415");
        Book b2 = new Book("The Alchemist", "Paulo Coelho", "Fiction", "9780061122415");
        Book b3 = new Book("Atomic Habits", "James Clear", "Self-Help", "9780735211292");

        boolean match = b1.equals(b2);
        boolean noMatch = b2.equals(b3);

        System.out.println("Book match: " + match);
        System.out.println("Book not match: " + noMatch);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
