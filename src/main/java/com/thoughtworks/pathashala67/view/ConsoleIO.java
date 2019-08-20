package com.thoughtworks.pathashala67.view;

import java.util.Scanner;

public class ConsoleIO implements IO {

    private Scanner scanner = new Scanner( System.in );

    public void printToConsole( String message ) {
        System.out.println( message );
    }

    public String getInput() {
        return scanner.nextLine().toLowerCase();
    }


    public void printBookList( String bookList ) {

        System.out.println(bookList);
    }

    public String getName() {
        return scanner.nextLine();
    }


}