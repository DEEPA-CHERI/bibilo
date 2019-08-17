package com.thoughtworks.pathashala67.View;

import com.thoughtworks.pathashala67.Model.Book;

import java.util.List;
import java.util.Scanner;

public class ConsoleIO {

    private Scanner scanner = new Scanner( System.in );

    public void printToConsole( String message ) {
        System.out.println( message );
    }

    public String getInput() {
        return scanner.nextLine().toLowerCase();
    }


    public void printBookList( List<Book> listOfBooks ) {
        String titleTemplate = "|%-5s| %-50s| %-25s| %-15s|%n";
        System.out.println( "********************Book List********************" );
        System.out.printf( titleTemplate, "Id", "Name", "Author", "Year Published" );
        int index = 1;
        for (Book book : listOfBooks) {
            book.printDetails( index );
            index++;
        }
    }

    public String getBookName() {
        return scanner.nextLine();
    }
}