package com.thoughtworks.pathashala67.Exceptions;

public class BookNotAvailableException extends Exception {
    public BookNotAvailableException( String errorMessage ) {
        super(errorMessage);
    }
}
