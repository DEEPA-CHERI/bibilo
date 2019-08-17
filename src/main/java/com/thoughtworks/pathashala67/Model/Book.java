package com.thoughtworks.pathashala67.Model;

import java.util.Objects;

public class Book {
    private String name;
    private String author;
    private int publishedYear;

    public Book( String name, String author, int publishedYear ) {
        this.name = name;
        this.author = author;
        this.publishedYear = publishedYear;
    }

    Book( String bookName ) {
        this.name = bookName;
    }

    public void printDetails( int index ) {
        System.out.println( String.format( "|%-5s| %-50s| %-25s| %-15s|%n", index, name, author, publishedYear ) );
    }

    @Override
    public boolean equals( Object o ) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals( name, book.name ) ;

    }

    @Override
    public int hashCode() {
        return Objects.hash( name, author, publishedYear );
    }
}
