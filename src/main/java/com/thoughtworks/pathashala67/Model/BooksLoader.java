package com.thoughtworks.pathashala67.Model;

import java.util.ArrayList;
import java.util.List;
//Load books to the Library
public class  BooksLoader{
    public static Library loadBooks() {
        List<Book> books = new ArrayList<>();
        books.add( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ) );
        books.add( new Book( "Learn You a Haskell for Great Good!", "Miran Lipovaca", 1940 ) );
        books.add( new Book( "Head First Design Patterns", "Eric Freeman", 1960 ) );
        books.add( new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) );
        books.add( new Book( "The Adventures of Duck and Goose", "Sir Quackalot", 1906 ) );
        books.add( new Book( "Annotated Notes on the 'Duck and Goose' chronicles", "Prof Macaw", 1911 ) );
        books.add( new Book( "Fundamentals of Wavelets", "Goswami, Jaideva", 1986 ) );
        books.add( new Book( "Complete Sherlock Holmes, The - Vol I", "Doyle, Arthur Conan", 1891 ) );
        books.add( new Book( "Wealth of Nations, The", "Smith, Adam", 2001 ) );
        books.add( new Book( "Pillars of the Earth, The", "Follett, Ken", 1999 ) );
        books.add( new Book( "Python for Data Analysis", "McKinney, Wes", 2011 ) );
        books.add( new Book( "Maugham's Collected Short Stories", "Maugham, William S", 1960 ) );
        books.add( new Book( "To Sir With Love", "Braithwaite", 2000 ) );
        books.add( new Book( "Rosy is My Relative", "Durrell, Gerald", 2011 ) );
        books.add( new Book( "Short History of the World, A", "Wells, H G", 1877 ) );
        return  new Library( books );
    }
}
