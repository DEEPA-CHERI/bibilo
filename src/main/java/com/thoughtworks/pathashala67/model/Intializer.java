package com.thoughtworks.pathashala67.model;

import java.util.ArrayList;
import java.util.List;
//Load books and movies to the Library
public class Intializer {
    public static Books loadBooks() {
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
        return new Books( books );
    }

    public static Movies loadMovies() {
        return new Movies( new ArrayList<Movie>() {{
            add( new Movie( "Ninnu choodalani", 2001, "V.R.Prathap", "8" ) );
            add( new Movie( "Student No 1", 2001, "S.S Rajamouli", "unrated" ) );
            add( new Movie( "Aadi", 2002, "V.V Vinayak", "9" ) );
            add( new Movie( "Simhadri", 2003, "S.S Rajamouli", "7" ) );
            add( new Movie( "NaraSimhudu", 2005, "B.Gopal", "9" ) );
            add( new Movie( "Rakhi", 2006, "KrishnaVamsi", "8" ) );
            add( new Movie( "YamaDonga", 2007, "S.S Rajamouli", "7" ) );
            add( new Movie( "Oosarvelli", 2011, "Surender Reddy", "8" ) );
            add( new Movie( "Temper", 2015, "Puri Jagannadh", "8" ) );
            add( new Movie( "Nannaku Prematho", 2016, "Sukumar", "7" ) );
            add( new Movie( "Janatha Garage", 2016, "Koratala Siva", "8" ) );
            add( new Movie( "Aravinda Sametha Veera Raghava", 2018, "Trivikram Srinivas", "6" ) );
        }} );
    }
}
