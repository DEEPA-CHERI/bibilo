package com.thoughtworks.pathashala67.Model;

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

    String displayBooksDetails() {
        StringBuilder booksDetails = new StringBuilder();
        booksDetails.append( "ListOfBooks\n" );
        booksDetails.append(String.format("%4s| %-34s| %-17s| %-4s|\n","Id","Name","Author","PublishedYear"));
        int index = 1;
        for (Book book : listOfBooks) {
            booksDetails.append( book.printBook( index++ ) );
        }
        return booksDetails.toString();
    }
}
