package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.controller.Controller;
import com.thoughtworks.pathashala67.exceptions.BookNotAvailableException;

// Represents taking
public class CheckoutAction implements Action {

    private Books books;
    private Controller controller = new Controller();

    CheckoutAction( Books books ) {
        this.books = books;
    }

    @Override
    public void performAction(){
        controller.printToConsole( "enter the book name" );
        String bookName =controller.getBookName();
        String status;
        try {
            status = books.checkout( bookName );
        } catch (BookNotAvailableException exception) {
            status = exception.getMessage();
        }
        controller.printToConsole( status );
    }

}
