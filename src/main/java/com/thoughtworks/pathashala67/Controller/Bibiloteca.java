package com.thoughtworks.pathashala67.Controller;

import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;

public class Bibiloteca {
    ConsoleIO consoleIo;
    private Library books;
    boolean application_status;

    public Bibiloteca( ConsoleIO consoleIo, Library books ) {
        this.books = books;
        this.consoleIo = consoleIo;
        application_status = true;
    }

    public Bibiloteca( ConsoleIO consoleIo ) {
        this.consoleIo = consoleIo;
        application_status = true;
    }

    public Bibiloteca() {
        application_status = true;
        this.consoleIo = new ConsoleIO();
        this.books = new Library();
    }

    public void welcome() {
        consoleIo.printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!" );
    }

//    private void viewListOfBooks() {
//        String booksDetails = books.displayBooksDetails();
//        consoleOutput.displayDetailsOfBooks( booksDetails );
//    }


    public void run() {
        while (application_status) {
            // viewListOfBooks();
            viewMenuOptions();
            break;
        }
    }

    public void viewMenuOptions() {
        String menu = "=========================\n"
                      + "           Menu           \n" +
                      "=========================\n" +
                "1. List of Books\n";
        consoleIo.printToConsole( menu );
    }
}

