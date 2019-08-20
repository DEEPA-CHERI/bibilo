package com.thoughtworks.pathashala67.controller;

import com.thoughtworks.pathashala67.model.ActionPerformer;
import com.thoughtworks.pathashala67.model.Books;
import com.thoughtworks.pathashala67.model.Movies;
import com.thoughtworks.pathashala67.view.ConsoleIO;

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
                "1 - List of Books\n" +
                "2 - Checkout Book\n" +
                "3 - Return Book\n" +
                "4 - List of Movies\n" +
                "5 - Checkout Movie\n" +
                "6 - Return Movie\n" +
                "q - Quit the application\n";

        consoleIo.printToConsole( menu );
    }

    private void selectMenuOption( String choice ){
        if (choice.equals( "q" )) {
            application_status = false;
            return;
        }
        ActionPerformer actionPerformer = new ActionPerformer( books,movies );
        actionPerformer.perform( choice );
    }
}

