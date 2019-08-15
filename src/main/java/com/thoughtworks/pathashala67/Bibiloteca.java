package com.thoughtworks.pathashala67;

public class Bibiloteca {
    ConsoleOutput consoleOutput;

    public Bibiloteca( ConsoleOutput consoleOutput ) {
        this.consoleOutput = consoleOutput;
    }

    public void welcome() {
        consoleOutput.display( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!" );
    }
}

