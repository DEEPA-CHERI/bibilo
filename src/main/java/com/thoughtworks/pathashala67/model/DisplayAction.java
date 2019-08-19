package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.controller.Controller;

public class DisplayAction<T> implements Action {
    private T item;
    private Controller controller = new Controller();

    DisplayAction( T item ) {
        this.item = item;
    }

    @Override
    public void performAction() {
        if (item instanceof Books) {
            Books books = (Books) item;
            controller.printToConsole( books.displayBookListDetails() );
        }
        if (item instanceof Movies) {
            Movies movies = (Movies) item;
            controller.printToConsole( movies.displayMovieListDetails() );
        }

    }

}
