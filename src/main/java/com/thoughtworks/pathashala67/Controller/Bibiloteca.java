package com.thoughtworks.pathashala67.Controller;

import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.Model.Checkout;
import com.thoughtworks.pathashala67.Model.GiveBack;
import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.List;

public class Bibiloteca {
    private ConsoleIO consoleIo;
    private Library library;
    private boolean application_status = true;


    public Bibiloteca( ConsoleIO consoleIo, Library library ) {
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
        String errorMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";
        switch (choice) {
            case "1":
                viewListOfBooks();
                break;
            case "2": {
                bookCheckOut();
                break;
            }
            case "3": {
                returnBook();
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

    private void bookCheckOut() {
        String bookName = enterBookName();
        Checkout checkout = new Checkout();
        String statusMessage = checkout.performAction( library, bookName );
        consoleIo.printToConsole( statusMessage );
    }

    private void returnBook() {
        String bookName = enterBookName();
        GiveBack returnBook = new GiveBack();
        String statusMessage = returnBook.performAction( library, bookName );
        consoleIo.printToConsole( statusMessage );
    }
    private String enterBookName() {
        String name = "Enter the book name ";
        consoleIo.printToConsole( name );
        return name;
    }
}

