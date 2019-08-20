package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.exceptions.InvalidException;
import com.thoughtworks.pathashala67.exceptions.InvalidMovieException;

import java.util.ArrayList;
import java.util.List;

public class CheckedOutLibraryItem<T> {

    List<T> items = new ArrayList<T>();

    void add( T item ) {
        items.add( item );
    }

    T search( T item ) throws InvalidException {
        for (T eachItem : items) {
            if (item instanceof Movie && eachItem instanceof Movie) {
                Movie movie = (Movie) item;
                Movie anotherMovie = (Movie) eachItem;
                if (movie.equals( anotherMovie ))
                    return (T) anotherMovie;
            }
            if (item instanceof Book && eachItem instanceof Book) {
                Book book = (Book) item;
                Book anotherBook = (Book) eachItem;
                if (book.equals( anotherBook ))
                    return (T) anotherBook;
            }

        }
        throw new InvalidException( "That is not a valid  to return." );
    }

    void remove( T item ) {
        items.remove( item );
    }
}
