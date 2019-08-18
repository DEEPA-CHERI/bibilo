import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.Model.CreateLibrary;
import com.thoughtworks.pathashala67.View.ConsoleIO;

import java.util.List;

class BibilotecaApp {
    public static void main( String[] args ) throws BookNotAvailableException {
        ConsoleIO consoleIO = new ConsoleIO();
        List<Book> books = CreateLibrary.loadBooks();
        Bibiloteca bibiloteca = new Bibiloteca( consoleIO, books );
        bibiloteca.run();
    }
}
