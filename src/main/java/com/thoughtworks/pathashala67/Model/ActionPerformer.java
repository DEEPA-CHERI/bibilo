package com.thoughtworks.pathashala67.Model;

import java.util.ArrayList;
import java.util.List;

//Models to perform various activities
public class ActionPerformer {
    private List<Action> actions = new ArrayList<>();
    private Library library;
    private String bookName;

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
        if (index  > actions.size()+1)
            return errorMessage;
        Action actionPerformer = actions.get( index - 2 );
        return actionPerformer.performAction( library, bookName );
    }
}
