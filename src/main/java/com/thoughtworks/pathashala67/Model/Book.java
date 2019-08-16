package com.thoughtworks.pathashala67.Model;

public class Book {
    private String name;
    private String author;
    private int publishedYear;

    Book( String name, String author, int publishedYear ) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public void printDetails( int index ) {
        System.out.println( String.format( "|%-5s| %-25s| %-25s| %-15s|%n", index, name, author, publishedYear ) );
    }

}
