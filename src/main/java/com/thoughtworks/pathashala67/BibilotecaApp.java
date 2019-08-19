package com.thoughtworks.pathashala67;

import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.Model.BooksLoader;
import com.thoughtworks.pathashala67.View.ConsoleIO;

class BibilotecaApp {
    public static void main( String[] args ) {
        ConsoleIO consoleIO = new ConsoleIO();
        Library library = BooksLoader.loadBooks();
        Bibiloteca bibiloteca = new Bibiloteca( consoleIO, library );
        bibiloteca.run();
    }
}
