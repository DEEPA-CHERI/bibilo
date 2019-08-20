package com.thoughtworks.pathashala67.controller;

import com.thoughtworks.pathashala67.view.IO;
import com.thoughtworks.pathashala67.view.ConsoleIO;

public class Controller implements IO {
    private ConsoleIO consoleIo = new ConsoleIO();

    public String getName() {
        return consoleIo.getName();
    }

    @Override
    public void printToConsole( String message ) {
        consoleIo.printToConsole( message );
    }

    @Override
    public void printBookList( String bookList ) {
        consoleIo.printBookList( bookList );
    }

    @Override
    public String getInput() {
        return consoleIo.getInput();
    }
}


