package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;


import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Book> checkedOutBooks = new ArrayList<>();

    public Library( List<Book> books ) {
        this.books = books;
    }

    public List<Book> displayBookListDetails() {
        return books;
    }

    public String checkout( String bookName ) throws BookNotAvailableException {
        int bookIndex = searchForBook( bookName, books );
        if (bookIndex == -1)
            throw new BookNotAvailableException( "Sorry, that book is not available" );
        checkedOutBooks.add( books.get( bookIndex ) );
        books.remove( bookIndex );
        return ("Thank you! Enjoy the book");
    }

    public int searchForBook( String bookName, List<Book> books ) {
        int index = 0, searchStatus = -1;
        for (Book book : books) {
            if (book.equals( new Book( bookName ) )) {
                searchStatus = index;
                break;
            }
            index++;
        }
        return searchStatus;
    }

    public String returnBook( String bookName ) throws InvalidBookException {
        int bookIndex = searchForBook( bookName, checkedOutBooks );
        if (bookIndex == -1)
            throw new InvalidBookException( "That is not a valid book to return." );
        books.add( checkedOutBooks.get( bookIndex ) );
        checkedOutBooks.remove( bookIndex );
        return ("Thank you for returning the book");
    }
}
