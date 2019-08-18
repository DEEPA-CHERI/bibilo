package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;

public class Checkout implements Action {

    @Override
    public String performAction( Library books, String bookName ) {
        try {
            return books.checkout( bookName );
        } catch (BookNotAvailableException exception) {
            return exception.getMessage();
        }
    }
}
