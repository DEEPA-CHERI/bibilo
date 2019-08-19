package com.thoughtworks.pathashala67.view;

import java.util.Scanner;

public class ConsoleIO {

    private Scanner scanner = new Scanner( System.in );

    public void printToConsole( String message ) {
        System.out.println( message );
    }

    public String getInput() {
        return scanner.nextLine().toLowerCase();
    }


    public void printBookList( String bookList ) {
        String titleTemplate = "|%-5s| %-50s| %-25s| %-15s|%n";
        System.out.println( "********************Book List********************" );
        System.out.printf( titleTemplate, "Id", "Name", "Author", "Year Published" );
        System.out.println(bookList);
    }

    public String getBookName() {
        return scanner.nextLine();
    }
}