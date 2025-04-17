package com.java.login.Internal;

public class Movie {
    private String title;
    private String genre;
    private int duration;
    private double rating;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie(Title: " + title + ", Genre: " + genre + ", Duration: " + duration + " mins, Rating: " + rating + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Movie) {
            Movie movie = (Movie) obj;
            return this.title.equals(movie.title) && this.genre.equals(movie.genre);
        }
        return false;
    }
}
