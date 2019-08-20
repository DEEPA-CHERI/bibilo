package com.thoughtworks.pathashala67.model;

import java.util.Objects;

public class Movie {
    private String name;
    private int year;
    private String director;
    private String rating;

    public Movie( String name, int year, String director, String rating ) {
        this.name =name;
        this.year = year;
        this.director=director;
        this.rating = rating;
    }

    public Movie( String name ) {
        this.name = name;
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Movie)) return false;
        Movie movie = (Movie) o;
        return name.equals( movie.name );

    }

    @Override
    public int hashCode() {
        return Objects.hash( name, year, director, rating );
    }


    String printDetails( int index ) {
        return String.format( "|%-5s| %-30s| %-10s| %-20s| %-15s|%n", index + 1, name, year, director, rating );
    }

}
