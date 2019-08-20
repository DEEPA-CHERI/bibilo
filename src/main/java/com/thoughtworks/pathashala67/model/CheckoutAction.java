package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.controller.Controller;
import com.thoughtworks.pathashala67.exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.exceptions.MovieNotAvailableException;

// Represents taking
public class CheckoutAction<T> implements Action {

    private T item;
    private Controller controller = new Controller();

    CheckoutAction( T item ) {
        this.item = item;
    }

    @Override
    public void performAction() {
        if (item instanceof Books) {
            performBookCheckout();
        }
        if (item instanceof Movies) {
            performMovieCheckout();
        }

    }

    private void performMovieCheckout() {
        Movies movies = (Movies) item;
        controller.printToConsole( "enter the Movie name" );
        String movieName = controller.getName();
        String status;
        try {
            status = movies.checkout( movieName );
        } catch (MovieNotAvailableException exception) {
            status = exception.getMessage();
        }
        controller.printToConsole( status );
    }

    private void performBookCheckout() {
        Books books = (Books) item;
        controller.printToConsole( "enter the book name" );
        String bookName = controller.getName();
        String status;
        try {
            status = books.checkout( bookName );
        } catch (BookNotAvailableException exception) {
            status = exception.getMessage();
        }
        controller.printToConsole( status );
    }
}
