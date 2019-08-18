package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;
// Represent returning back
public class GiveBack implements Action {

    @Override
    public String performAction( Library library, String bookName ) {
        try {
            return library.returnBook( bookName );
        } catch (InvalidBookException exception) {
            return exception.getMessage();
        }
    }
}
