import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class LibraryTest {
    @Test
    void expectUserShouldAbleToCheckoutBook() {
        ConsoleIO consoleIO = new ConsoleIO();
        Library books =  new Library(consoleIO);

        books.checkout("Introduction to Algorithms");

        assertEquals(14,books.listOfBooks.size());
        assertEquals(1,books.checkedOutList.size());
    }
    @Test
    void expectSuccessMessageWhenCheckoutIsSuccessful() {
        ConsoleIO consoleIO = mock(ConsoleIO.class);
        Library books =  new Library(consoleIO);
        String expected = "Thank you! Enjoy the book";

        books.checkout("Introduction to Algorithms");

        assertEquals(14,books.listOfBooks.size());
        assertEquals(1,books.checkedOutList.size());
        verify(consoleIO).printToConsole(expected);
    }
}
