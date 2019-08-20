package com.thoughtworks.pathashala67;

import com.thoughtworks.pathashala67.controller.Bibiloteca;
import com.thoughtworks.pathashala67.model.Books;
import com.thoughtworks.pathashala67.model.Intializer;
import com.thoughtworks.pathashala67.model.Movies;
import com.thoughtworks.pathashala67.view.ConsoleIO;

class BibilotecaApp {
    public static void main( String[] args ) {
        ConsoleIO consoleIO = new ConsoleIO();
        Books books = Intializer.loadBooks();
        Movies movies = Intializer.loadMovies();
        Bibiloteca bibiloteca = new Bibiloteca( consoleIO, books, movies );
        bibiloteca.run();
    }
}
