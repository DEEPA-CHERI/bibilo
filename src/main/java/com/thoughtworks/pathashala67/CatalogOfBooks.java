package com.thoughtworks.pathashala67;

import java.util.ArrayList;
import java.util.List;

public class CatalogOfBooks {
    private List<Book> listOfBooks= new ArrayList<>(  );

    public CatalogOfBooks()
    {
        createListOfBooks();
    }

    private void createListOfBooks() {
        listOfBooks.add(new Book("Introduction to Algorithms"));
        listOfBooks.add(new Book("Learn You a Haskell for Great Good!"));
        listOfBooks.add(new Book("Head First Design Patterns"));
        listOfBooks.add(new Book("Programming Pearls"));
    }
    String displayBooksName()
    {
        StringBuilder booksNames = new StringBuilder(  );
        int book_id =1;
        booksNames.append( "****Books****\n" );
        for(Book book : listOfBooks)
        {
            booksNames.append(book_id+" - "+book.getBookName());
            booksNames.append("\n");
            book_id++;
        }
        return booksNames.toString();
    }


}
