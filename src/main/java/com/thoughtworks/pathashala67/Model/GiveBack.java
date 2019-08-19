package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Controller.CommonController;
import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;

// Represent returning back
public class GiveBack implements Action {
    private Books books;
    private CommonController controller = new CommonController();

    GiveBack( Books books ) {
        this.books = books;
    }

    @Override
    public void performAction() {
        controller.display( "enter the book name" );
        String bookName = controller.getBookName();
        String status;
        try {
            status = books.returnBook( bookName );
        } catch (InvalidBookException exception) {
            status = exception.getMessage();
        }
        controller.display( status );
    }
}
