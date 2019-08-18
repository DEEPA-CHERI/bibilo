package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;


import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> books;
    public List<Book> checkedOutBooks = new ArrayList<>();

    public Library( List<Book> books ) {
        this.books = books;
    }

    public List<Book> displayBookListDetails() {
        return books;
    }

    public String checkout( String bookName ) throws BookNotAvailableException {
        int bookIndex = searchForBook( bookName, books );
        checkedOutBooks.add( books.get( bookIndex ) );
        books.remove( bookIndex );
        return ("Thank you! Enjoy the book");
    }

    public int searchForBook( String bookName, List<Book> books ) throws BookNotAvailableException {
        int index = 0, searchStatus = -1;
        for (Book book : books) {
            if (book.equals( new Book( bookName ) )) {
                searchStatus = index;
                break;
            }
            index++;
        }
        if(searchStatus==-1)
            throw new BookNotAvailableException("Sorry, that book is not available");
        return searchStatus;
    }

    public void returnBook( String bookName ) throws BookNotAvailableException {
        int bookIndex = searchForBook( bookName,checkedOutBooks );
        books.add(checkedOutBooks.get(bookIndex));
        checkedOutBooks.remove( bookIndex );
    }
}
