package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> books;
    private List<Book> checkedOutBooks = new ArrayList<>();

    public Books( List<Book> books ) {
        this.books = books;
    }

    String displayBookListDetails() {
        StringBuilder booksDetails = new StringBuilder();
        int index = 1;
        for (Book book : books) {
            booksDetails.append( book.printDetails( index - 1 ) + "\n" );
            index++;
        }
        return booksDetails.toString();
    }

    public String checkout( String bookName ) throws BookNotAvailableException {
        Book book = searchForBook( bookName, books );
        checkedOutBooks.add( book );
        books.remove( book );
        return ("Thank you! Enjoy the book");
    }

    public Book searchForBook( String bookName, List<Book> books ) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.equals( new Book( bookName ) )) {
                return book;
            }
        }
        throw new BookNotAvailableException( "Sorry, that book is not available" );
    }

    public String returnBook( String bookName ) throws InvalidBookException {
        Book book;
        try {
            book = searchForBook( bookName, checkedOutBooks );
        } catch (BookNotAvailableException exception) {
            throw new InvalidBookException( "That is not a valid book to return." );
        }
        books.add( book );
        checkedOutBooks.remove( book );
        return ("Thank you for returning the book");
    }

}
