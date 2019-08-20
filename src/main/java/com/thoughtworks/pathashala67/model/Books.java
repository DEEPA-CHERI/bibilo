package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.exceptions.InvalidBookException;
import com.thoughtworks.pathashala67.exceptions.InvalidException;

import java.util.ArrayList;
import java.util.List;

public class Books {
    private List<Book> books;
    private CheckedOutLibraryItem checkedOutLibraryItem = new CheckedOutLibraryItem();

    public Books( List<Book> books ) {
        this.books = books;
    }

    String displayBookListDetails() {
        StringBuilder booksDetails = new StringBuilder();
        String titleTemplate = "|%-5s| %-50s| %-25s| %-15s|%n";
        booksDetails.append("********************Book List********************\n" );
        booksDetails.append(String.format(titleTemplate, "Id", "Name", "Author", "Year Published" ));
        int index = 1;
        for (Book book : books) {
            booksDetails.append( book.printDetails( index - 1 ) + "\n" );
            index++;
        }
        return booksDetails.toString();
    }

    public String checkout( String bookName ) throws BookNotAvailableException {
        Book book = searchForBook( bookName);
        checkedOutLibraryItem.add( book );
        books.remove( book );
        return ("Thank you! Enjoy the book");
    }

    public Book searchForBook( String bookName) throws BookNotAvailableException {
        for (Book book : books) {
            if (book.equals( new Book( bookName ) )) {
                return book;
            }
        }
        throw new BookNotAvailableException( "Sorry, that book is not available" );
    }

    public String returnBook( String bookName ) throws InvalidBookException {
        Book book = new Book( bookName );
        try {
            book = (Book) checkedOutLibraryItem.search( book );
        } catch ( InvalidException exception) {
            throw new InvalidBookException( "That is not a valid book to return." );
        }
        books.add( book );
        checkedOutLibraryItem.remove( book );
        return ("Thank you for returning the book");
    }

}
