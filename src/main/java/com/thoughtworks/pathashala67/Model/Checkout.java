package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Controller.CommonController;
import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;

// Represents taking
public class Checkout implements Action {

    private Books books;
    private CommonController controller = new CommonController();

    Checkout( Books books ) {
        this.books = books;
    }

    @Override
    public void performAction(){
        controller.display( "enter the book name" );
        String bookName =controller.getBookName();
        String status;
        try {
            status = books.checkout( bookName );
        } catch (BookNotAvailableException exception) {
            status = exception.getMessage();
        }
        controller.display( status );
    }

}
