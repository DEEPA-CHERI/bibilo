package com.thoughtworks.pathashala67.model;

import com.thoughtworks.pathashala67.controller.Controller;

import java.util.ArrayList;
import java.util.List;

//Models to perform various activities
public class ActionPerformer {
    private List<Action> actions = new ArrayList<>();
    private Controller controller = new Controller();


    public ActionPerformer( Books books, Movies movies ) {
        actions.add( new DisplayAction<>( books ) );
        actions.add( new CheckoutAction<>( books ) );
        actions.add( new GiveBackAction<>( books ) );
        actions.add( new DisplayAction<>( movies ) );
        actions.add( new CheckoutAction<>( movies ) );
        actions.add( new GiveBackAction<>( movies ) );
    }

    public void perform( String choice ) {
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
