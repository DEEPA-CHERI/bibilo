package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;
// Represent returning back
public class GiveBack implements Action {

    @Override
    public String performAction( Books books, String bookName ) {
        try {
            return books.returnBook( bookName );
        } catch (InvalidBookException exception) {
            return exception.getMessage();
        }
    }
}
