package com.thoughtworks.pathashala67.model;
import com.thoughtworks.pathashala67.controller.Controller;
import com.thoughtworks.pathashala67.exceptions.InvalidBookException;
import com.thoughtworks.pathashala67.exceptions.InvalidMovieException;

// Represent returning back
public class GiveBackAction<T> implements Action {
    private T item;
    private Controller controller = new Controller();

    GiveBackAction( T item) {
        this.item = item;
    }

    @Override
    public void performAction() {
        if (item instanceof Books) {
            performBookReturn();
        }
        if (item instanceof Movies) {
            performMovieReturn();
        }

    }

    private void performMovieReturn() {
        Movies movies = (Movies) item;
        controller.printToConsole( "enter the Movie name" );
        String movieName = controller.getName();
        String status;
        try {
            status =movies.returnMovie( movieName );
        } catch ( InvalidMovieException exception) {
            status = exception.getMessage();
        }
        controller.printToConsole( status );
    }

    private void performBookReturn() {
        Books books = (Books) item;
        controller.printToConsole( "enter the book name" );
        String bookName = controller.getName();
        String status;
        try {
            status =books.returnBook( bookName );
        } catch (InvalidBookException exception) {
            status = exception.getMessage();
        }
        controller.printToConsole( status );
    }
}
