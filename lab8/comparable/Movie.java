/**
 * A Java program to demonstrate use of Comparable
 */
package hus.oop.lab8.comparable;

import java.io.*;
import java.util.*;

/**
 * A class 'Movie' that implements Comparable
 */
class Movie implements Comparable<Movie> {
    private String name;
    private double rating;
    private int year;

    // Used to sort movies by year
    public int compareTo(Movie movie) {
        // TODO
        return this.year - movie.getYear();
    }

    // Constructor
    public Movie(String name, double rating, int year) {
        // TODO
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    // Getter methods for accessing private data
    public double getRating() {
        // TODO
        return rating;
    }

    public String getName() {
        // TODO
        return name;
    }

    public int getYear() {
        // TODO
        return year;
    }
}

class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting:");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
    }
}
