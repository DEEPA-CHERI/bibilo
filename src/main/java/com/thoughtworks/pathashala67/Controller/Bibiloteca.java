package com.thoughtworks.pathashala67.Controller;

import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.Arrays;
import java.util.List;

public class Bibiloteca {
    ConsoleIO consoleIo;
    private Library books;
    boolean application_status = true;
    List<String> menuOptions = Arrays.asList( "1" );

    public Bibiloteca( ConsoleIO consoleIo ) {
        this.consoleIo = consoleIo;
        this.books = new Library( consoleIo );
    }

    public void welcome() {
        consoleIo.printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!" );
    }

    public void viewListOfBooks() {
        books.displayBookListDetails();
    }

    public void run() {
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
                "1. List of Books\n";
        consoleIo.printToConsole( menu );
    }

    public void selectMenuOptionWithChoice( String choice ) {
        String errorMessage = "=====================\n" +
                              "Select a valid option!\n" +
                               "=====================";
            switch(choice)
            {
                case "1":       viewListOfBooks();
                                break;
                default:        consoleIo.printToConsole( errorMessage );
            }

    }
}

