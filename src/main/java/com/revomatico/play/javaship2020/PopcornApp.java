package com.revomatico.play.javaship2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PopcornApp {
    private List<Movie> movies = new ArrayList<>();

    public void setMovies(List<Movie> movies) // useful for sorting
    {
        this.movies = movies;
    }

    public List<Movie> listMovies() {
        return movies;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public List<Movie> sort_movie(List<Movie> movies) {
        Collections.sort(movies);
        return movies;
    }

    public void print_Movies(List<Movie> movies) {
        System.out.println("Sorted movies are: ");
        for (int i = 0; i < movies.size(); i++) {
            System.out.println(movies.get(i));
        }
    }

    public static class Movie implements Comparable<Movie> {
        private String name;
        private Date prod_date;

        Movie() {
        }

        Movie(String name, Date prod_date) {
            this.name = name;
            this.prod_date = prod_date;
        }

        @Override
        public String toString() {
            return this.name;
        }

        public Date getDate() // useful for sorting
        {
            return this.prod_date;
        }

        @Override
        public int compareTo(Movie o) {
            if (getDate() == null || o.getDate() == null) {
                return 0;
            }
            return getDate().compareTo(o.getDate());
        }
    }

    /*
     * class Sortbyyear implements Comparator<Movie> {
     * 
     * public int compare(Movie a, Movie b) { return a.getDate() - b.getDate(); } }
     */
}
