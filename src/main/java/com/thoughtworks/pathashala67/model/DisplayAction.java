package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.controller.Controller;

public class DisplayAction implements Action {
    private Books books;
    private Controller controller = new Controller();

    DisplayAction( Books books ) {
        this.books = books;
    }
    @Override
    public void performAction() {
        controller.printBooks( books.displayBookListDetails() );
    }
}
