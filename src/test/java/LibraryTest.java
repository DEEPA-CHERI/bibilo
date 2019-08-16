import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LibraryTest {
    @Test
    void expectUserShouldAbleToCheckoutBook() {
        ConsoleIO consoleIO = new ConsoleIO();
        Library books =  new Library(consoleIO);

        books.checkout(1);

        assertEquals(14,books.listOfBooks.size());
        assertEquals(1,books.checkedOutList.size());
    }
}
