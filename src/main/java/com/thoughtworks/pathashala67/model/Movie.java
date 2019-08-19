package com.thoughtworks.pathashala67.model;

public class Movie {
    private String name;
    private int year;
    private String director;
    private String rating;
    public Movie( String name, int year, String director, String rating ) {
        this.name = name;
        this.year = year;
        this.director = director;
        this.rating = rating;
    }


    String printDetails( int index ) {
        return String.format("|%-5s| %-30s| %-10s| %-20s| %-15s|%n", index+1, name, year, director, rating);
    }
}
