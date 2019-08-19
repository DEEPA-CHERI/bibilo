package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;

// Represents taking
public class Checkout implements Action {

    @Override
    public String performAction( Books books, String bookName ) {
        try {
            return books.checkout( bookName );
        } catch (BookNotAvailableException exception) {
            return exception.getMessage();
        }
    }


}
