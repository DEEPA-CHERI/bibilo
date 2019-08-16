package com.thoughtworks.pathashala67;

//
public class Bibiloteca {
    ConsoleOutput consoleOutput;
    private CatalogOfBooks books;
    boolean application_status;

    public Bibiloteca( ConsoleOutput consoleOutput,CatalogOfBooks books) {
        this.books = books;
        this.consoleOutput = consoleOutput;
    }

    public Bibiloteca( ConsoleOutput consoleOutput ) {
        this.consoleOutput = consoleOutput;
    }

    public Bibiloteca() {
        application_status = true;
        this.consoleOutput = new ConsoleOutput();
        this.books = new CatalogOfBooks();
    }

    public void welcome() {
        consoleOutput.display( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!" );
    }

    public void viewListOfBooks() {
        String booksName = books.displayBooksName();
        consoleOutput.displayBooks(booksName);
    }

    public void run() {
        while(application_status)
        {
            viewListOfBooks();
            viewDetailsOfListOfBooks();
            break;
        }
    }

    public void viewDetailsOfListOfBooks() {
        String booksDetails = books.displayBooksDetails();
        consoleOutput.displayDetailsOfBooks(booksDetails);
    }

}

