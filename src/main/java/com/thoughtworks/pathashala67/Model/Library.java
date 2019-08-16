package com.thoughtworks.pathashala67.Model;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> listOfBooks = new ArrayList<>();

    public Library() {
        loadBooks();
    }

    private void loadBooks() {
        listOfBooks.add( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ) );
        listOfBooks.add( new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ) );
        listOfBooks.add( new Book( "Head First Design Patterns", "Eric Freeman", 1960 ) );
        listOfBooks.add( new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) );
        listOfBooks.add(new Book("The Adventures of Duck and Goose", "Sir Quackalot", 1906));
        listOfBooks.add(new Book("Annotated Notes on the 'Duck and Goose' chronicles","Prof Macaw", 1911));
        listOfBooks.add(new Book("Fundamentals of Wavelets", "Goswami, Jaideva", 1986));
        listOfBooks.add(new Book("Complete Sherlock Holmes, The - Vol I", "Doyle, Arthur Conan", 1891));
        listOfBooks.add(new Book("Wealth of Nations, The", "Smith, Adam", 2001));
        listOfBooks.add(new Book("Pillars of the Earth, The", "Follett, Ken", 1999));
        listOfBooks.add(new Book("Python for Data Analysis", "McKinney, Wes", 2011));
        listOfBooks.add(new Book("Maugham's Collected Short Stories", "Maugham, William S", 1960));
        listOfBooks.add(new Book("To Sir With Love", "Braithwaite", 2000));
        listOfBooks.add(new Book("Rosy is My Relative", "Durrell, Gerald", 2011));
        listOfBooks.add(new Book("Short History of the World, A", "Wells, H G", 1877));
    }

//    public String displayBooksDetails() {
//        StringBuilder booksDetails = new StringBuilder();
//        booksDetails.append( "ListOfBooks\n" );
//        booksDetails.append(String.format("%4s| %-34s| %-17s| %-4s|\n","Id","Name","Author","PublishedYear"));
//        int index = 1;
//        for (Book book : listOfBooks) {
//            booksDetails.append( book.printBook( index++ ) );
//        }
//        return booksDetails.toString();
//    }
}
