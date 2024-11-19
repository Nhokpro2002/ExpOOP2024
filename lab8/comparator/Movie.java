/**
 * A Java program to demonstrate Comparator interface
 */
package hus.oop.lab8.comparator;

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
    public int compareTo(Movie m) {
        // TODO
        return this.year - m.getYear();
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
