package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.ArrayList;
import java.util.List;

//Models to perform various activities
public class ActionPerformer {
    private List<Action> actions = new ArrayList<>();
    private Books books;
    private ConsoleIO consoleIO = new ConsoleIO();


    public ActionPerformer( Books books ) {
        actions.add( new Display( books ) );
        actions.add( new Checkout( books ) );
        actions.add( new GiveBack( books ) );
        this.books = books;

    }

    public void perform( String choice )  {
        String errorMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";
        int index = Integer.parseInt( choice );
        if (index > actions.size()) {
            consoleIO.printToConsole( errorMessage );
            return;
        }
        Action actionPerformer = actions.get( index - 1 );
        actionPerformer.performAction();
    }
}
