package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public List<Book> listOfBooks = new ArrayList<>();
    public List<Book> checkedOutList = new ArrayList<>();
    private ConsoleIO consoleIO;

    public Library( ConsoleIO consoleIO ) {
        loadBooks();
        this.consoleIO = consoleIO;
    }

    private void loadBooks() {
        listOfBooks.add( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ) );
        listOfBooks.add( new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ) );
        listOfBooks.add( new Book( "Head First Design Patterns", "Eric Freeman", 1960 ) );
        listOfBooks.add( new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) );
        listOfBooks.add( new Book( "The Adventures of Duck and Goose", "Sir Quackalot", 1906 ) );
        listOfBooks.add( new Book( "Annotated Notes on the 'Duck and Goose' chronicles", "Prof Macaw", 1911 ) );
        listOfBooks.add( new Book( "Fundamentals of Wavelets", "Goswami, Jaideva", 1986 ) );
        listOfBooks.add( new Book( "Complete Sherlock Holmes, The - Vol I", "Doyle, Arthur Conan", 1891 ) );
        listOfBooks.add( new Book( "Wealth of Nations, The", "Smith, Adam", 2001 ) );
        listOfBooks.add( new Book( "Pillars of the Earth, The", "Follett, Ken", 1999 ) );
        listOfBooks.add( new Book( "Python for Data Analysis", "McKinney, Wes", 2011 ) );
        listOfBooks.add( new Book( "Maugham's Collected Short Stories", "Maugham, William S", 1960 ) );
        listOfBooks.add( new Book( "To Sir With Love", "Braithwaite", 2000 ) );
        listOfBooks.add( new Book( "Rosy is My Relative", "Durrell, Gerald", 2011 ) );
        listOfBooks.add( new Book( "Short History of the World, A", "Wells, H G", 1877 ) );
    }

    public void displayBookListDetails() {
        ConsoleIO consoleIO = new ConsoleIO();
        consoleIO.printBookList( listOfBooks );
    }

    public void checkout( String bookName ) {
        int bookIndex = searchForBook( bookName );
        if (bookIndex == -1) {
            consoleIO.printToConsole( "Sorry, that book is not available" );
        }
            checkedOutList.add( listOfBooks.get( bookIndex ) );
            listOfBooks.remove( bookIndex );
            consoleIO.printToConsole( "Thank you! Enjoy the book" );

    }

    public int searchForBook( String bookName ) {
        int index = 0, searchStatus = -1;
        for (Book book : listOfBooks) {
            if (book.getBookName().equals( bookName )) {
                searchStatus = index;
                break;
            }
            index++;
        }
        return searchStatus;
    }
}
