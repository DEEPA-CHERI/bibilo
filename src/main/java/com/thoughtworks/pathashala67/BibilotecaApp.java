package com.thoughtworks.pathashala67;

import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.Books;
import com.thoughtworks.pathashala67.Model.Intializer;
import com.thoughtworks.pathashala67.Model.Movies;
import com.thoughtworks.pathashala67.View.ConsoleIO;

class BibilotecaApp {
    public static void main( String[] args ){
        ConsoleIO consoleIO = new ConsoleIO();
        Books books = Intializer.loadBooks();
        Movies movies = Intializer.loadMovies();
        Bibiloteca bibiloteca = new Bibiloteca( consoleIO, books,movies );
        bibiloteca.run();
    }
}
