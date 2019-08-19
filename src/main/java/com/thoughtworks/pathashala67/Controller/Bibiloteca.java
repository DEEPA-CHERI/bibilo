package com.thoughtworks.pathashala67.Controller;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.ActionPerformer;
import com.thoughtworks.pathashala67.Model.Books;
import com.thoughtworks.pathashala67.Model.Movies;
import com.thoughtworks.pathashala67.View.ConsoleIO;

public class Bibiloteca {
    private ConsoleIO consoleIo;
    private Books books;
    private Movies movies;
    private boolean application_status = true;


    public Bibiloteca( ConsoleIO consoleIo, Books books, Movies movies ) {
        this.consoleIo = consoleIo;
        this.books = books;
        this.movies = movies;
    }

    public void welcome() {
        consoleIo.printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great books in Bangalore!" );
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

    private void selectMenuOption( String choice ){
        if (choice.equals( "q" )) {
            application_status = false;
            return;
        }
        ActionPerformer actionPerformer = new ActionPerformer( books );
        actionPerformer.perform( choice );
    }
}

