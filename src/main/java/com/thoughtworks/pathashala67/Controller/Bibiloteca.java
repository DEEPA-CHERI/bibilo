package com.thoughtworks.pathashala67.Controller;

import com.thoughtworks.pathashala67.Model.*;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.List;

public class Bibiloteca {
    private ConsoleIO consoleIo;
    private Library library;
    private boolean application_status = true;


    public Bibiloteca( ConsoleIO consoleIo, Library library) {
        this.consoleIo = consoleIo;
        this.library = library;
    }

    public void welcome() {
        consoleIo.printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great books in Bangalore!" );
    }

    private void viewListOfBooks() {
        List<Book> books = library.displayBookListDetails();
        consoleIo.printBookList( books );
    }

    public void run() {
        welcome();
        String choice;
        while (application_status) {
            viewMenuOptions();
            selectChoice();
            choice = consoleIo.getInput();
            selectMenuOption( choice );
        }
    }

    private void selectChoice() {
        String enterChoice = "Enter your choice!!\n";
        consoleIo.printToConsole( enterChoice );
    }

    public void viewMenuOptions() {
        String menu = "=========================\n"
                + "           Menu           \n" +
                "=========================\n" +
                "1. List of Books\n" +
                "2 - Checkout Book\n" +
                "3 - Return Book\n" +
                "q. Quit the application\n";

        consoleIo.printToConsole( menu );
    }

    public void selectMenuOption( String choice ) {

        if (choice.equals( "q" )) {
            application_status = false;
            return;
        }
        if (choice.equals( "1" )) {
            viewListOfBooks();
            return;
        }
        String bookName = enterBookName();
        ActionPerformer actionPerformer = new ActionPerformer( library, bookName );
        String statusMessage = actionPerformer.perform( choice );
        consoleIo.printToConsole( statusMessage );
    }

    private String enterBookName() {
        String name = "Enter the book name ";
        consoleIo.printToConsole( name );
        return consoleIo.getBookName();
    }
}

