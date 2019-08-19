package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.controller.Controller;
import com.thoughtworks.pathashala67.view.ConsoleIO;

import java.util.ArrayList;
import java.util.List;

//Models to perform various activities
public class ActionPerformer {
    private List<Action> actions = new ArrayList<>();
    private Books books;
    private Controller controller = new Controller();


    public ActionPerformer( Books books ) {
        actions.add( new DisplayAction( books ) );
        actions.add( new CheckoutAction( books ) );
        actions.add( new GiveBackAction( books ) );
        this.books = books;

    }

    public void perform( String choice )  {
        String errorMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";
        int index = Integer.parseInt( choice );
        if (index > actions.size()) {
            controller.printToConsole( errorMessage );
            return;
        }
        Action actionPerformer = actions.get( index - 1 );
        actionPerformer.performAction();
    }
}
