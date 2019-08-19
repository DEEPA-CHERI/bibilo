package com.thoughtworks.pathashala67;

import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.Model.Books;
import com.thoughtworks.pathashala67.Model.BooksLoader;
import com.thoughtworks.pathashala67.View.ConsoleIO;

class BibilotecaApp {
    public static void main( String[] args ) {
        ConsoleIO consoleIO = new ConsoleIO();
        Books books = BooksLoader.loadBooks();
        Bibiloteca bibiloteca = new Bibiloteca( consoleIO, books );
        bibiloteca.run();
    }
}
