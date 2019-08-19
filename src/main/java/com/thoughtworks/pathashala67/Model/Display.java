package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Controller.CommonController;

public class Display implements Action {
    private Books books;
    private CommonController controller = new CommonController();

    Display( Books books ) {
        this.books = books;
    }

    @Override
    public void performAction() {
        controller.printBooks( books.displayBookListDetails() );
    }
}
