package com.thoughtworks.pathashala67.Controller;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.List;

public class Bibiloteca {
    private ConsoleIO consoleIo;
    private Library library;
    private boolean application_status = true;


    public Bibiloteca( ConsoleIO consoleIo, List<Book> books ) {
        this.consoleIo = consoleIo;
        this.library = new Library( books );
    }

    public void welcome() {
        consoleIo.printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!" );
    }

    private void viewListOfBooks() {
        List<Book> books = library.displayBookListDetails();
        consoleIo.printBookList( books );
    }

    public void run() throws BookNotAvailableException {
        String choice;
        while (application_status) {
            viewMenuOptions();
            selectChoice();
            choice = consoleIo.getInput();
            selectMenuOptionWithChoice( choice );
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
                "q. Quit the application\n";

        consoleIo.printToConsole( menu );
    }

    public void selectMenuOptionWithChoice( String choice ) {
        String errorMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";
        switch (choice) {
            case "1":
                viewListOfBooks();
                break;
            case "2": {
                String bookNumber = "Enter the book name ";
                consoleIo.printToConsole( bookNumber );
                String bookName = consoleIo.getBookName();
                try {
                    consoleIo.printToConsole( library.checkout( bookName ) );
                } catch (BookNotAvailableException exception) {
                    consoleIo.printToConsole( exception.getMessage());
                }
                break;
            }
            case "q": {
                application_status = false;
                return;
            }
            default:
                consoleIo.printToConsole( errorMessage );
        }

    }
}

