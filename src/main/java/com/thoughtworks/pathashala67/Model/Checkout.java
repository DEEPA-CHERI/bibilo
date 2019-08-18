package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;

public class Checkout implements Action {

    @Override
    public String performAction( Library library, String bookName ) {
        try {
            return library.checkout( bookName );
        } catch (BookNotAvailableException exception) {
            return exception.getMessage();
        }
    }
}
