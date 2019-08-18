package com.thoughtworks.pathashala67.Model;

import com.thoughtworks.pathashala67.Controller.Bibiloteca;

import java.util.ArrayList;
import java.util.List;

public class ActionPerformer {
    List<Action> actions = new ArrayList<>();
    Library library;
    String bookName;

    public ActionPerformer( Library library, String bookName ) {
        actions.add( new Checkout() );
        actions.add( new GiveBack() );
        this.library = library;
        this.bookName = bookName;
    }

    public String perform( String choice ) {
        String errorMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";
        int index = Integer.parseInt( choice );
        if (index + 1 > actions.size())
            return errorMessage;
        Action actionPerformer = actions.get( index - 1 );
        return actionPerformer.performAction( library, bookName );
    }
}
