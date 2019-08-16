package com.thoughtworks.pathashala67;

import java.util.ArrayList;
import java.util.List;

public class CatalogOfBooks {
    private List<Book> listOfBooks = new ArrayList<>();

    public CatalogOfBooks() {
        createListOfBooks();
    }

    private void createListOfBooks() {
        listOfBooks.add( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ) );
        listOfBooks.add( new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ) );
        listOfBooks.add( new Book( "Head First Design Patterns", "Eric Freeman", 1960 ) );
        listOfBooks.add( new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) );
    }

    String displayBooksName() {
        StringBuilder booksNames = new StringBuilder();
        int book_id = 1;
        booksNames.append( "****Books****\n" );
        for (Book book : listOfBooks) {
            booksNames.append( book_id + " - " + book.getBookName() );
            booksNames.append( "\n" );
            book_id++;
        }
        return booksNames.toString();
    }


    String displayBooksDetails() {
        StringBuilder booksDetails = new StringBuilder();
        booksDetails.append( "****Books****\n" +
                "Id     Name   Author  PublishedYear\n" );
        int index = 1;
        for (Book book : listOfBooks) {
            booksDetails.append( book.printBook( index++ ) );
        }
        return booksDetails.toString();
    }
}
