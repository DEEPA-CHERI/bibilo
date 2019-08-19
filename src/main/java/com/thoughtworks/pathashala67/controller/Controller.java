package com.thoughtworks.pathashala67.controller;

import com.thoughtworks.pathashala67.view.ConsoleIO;

public class Controller {
    private ConsoleIO consoleIo = new ConsoleIO();

    public void display( String displayBookListDetails ) {
        consoleIo.printToConsole( displayBookListDetails );
    }

    public void printBooks( String books ) {
        consoleIo.printBookList( books );
    }

    public String getBookName() {
        return consoleIo.getBookName();
    }

}


