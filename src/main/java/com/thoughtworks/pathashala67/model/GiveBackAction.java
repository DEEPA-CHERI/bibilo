package com.thoughtworks.pathashala67.model;
import com.thoughtworks.pathashala67.controller.Controller;
import com.thoughtworks.pathashala67.exceptions.InvalidBookException;

// Represent returning back
public class GiveBackAction implements Action {
    private Books books;
    private Controller controller = new Controller();

    GiveBackAction( Books books ) {
        this.books = books;
    }

    @Override
    public void performAction() {
        controller.printToConsole( "enter the book name" );
        String bookName = controller.getBookName();
        String status;
        try {
            status = books.returnBook( bookName );
        } catch (InvalidBookException exception) {
            status = exception.getMessage();
        }
        controller.printToConsole( status );
    }
}
