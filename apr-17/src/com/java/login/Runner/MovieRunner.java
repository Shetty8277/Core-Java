package com.java.login.Runner;

import com.java.login.Internal.Movie;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie1 = new Movie();
        movie1.setTitle("Inception");
        movie1.setGenre("Sci-Fi");
        movie1.setDuration(148);
        movie1.setRating(8.8);

        Movie movie2 = new Movie();
        movie2.setTitle("Titanic");
        movie2.setGenre("Romance");
        movie2.setDuration(195);
        movie2.setRating(7.8);

        Movie movie3 = new Movie();
        movie3.setTitle("Inception");
        movie3.setGenre("Sci-Fi");
        movie3.setDuration(148);
        movie3.setRating(8.8);

        System.out.println(movie1.equals(movie2)); // false
        System.out.println(movie1.equals(movie3)); // true

        System.out.println(movie1);
        System.out.println(movie2);
        System.out.println(movie3);
    }
}
