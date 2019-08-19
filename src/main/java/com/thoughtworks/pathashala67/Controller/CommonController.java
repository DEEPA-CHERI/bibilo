package com.thoughtworks.pathashala67.Controller;
import com.thoughtworks.pathashala67.View.ConsoleIO;

public class CommonController {
    private ConsoleIO consoleIo = new ConsoleIO();

    public void display( String displayBookListDetails ) {
        consoleIo.printToConsole( displayBookListDetails );
    }

    public  void printBooks(String books)
    {
        consoleIo.printBookList( books );
    }

    public String getBookName() {
        return consoleIo.getBookName();
    }

}
