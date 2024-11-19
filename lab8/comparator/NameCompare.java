package hus.oop.lab8.comparator;

import java.util.Comparator;

class NameCompare implements Comparator<Movie> {
    public int compare(Movie left, Movie right) {
        // TODO
        return left.getName().compareTo(right.getName());
    }
}