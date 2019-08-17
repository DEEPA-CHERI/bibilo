import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class LibraryTest {
    @Test
    void ShouldAbleToCheckoutBook() {
        ConsoleIO consoleIO = new ConsoleIO();
        Library books =  new Library(consoleIO);

        books.checkout("Introduction to Algorithms");

        assertEquals(14,books.listOfBooks.size());
        assertEquals(1,books.checkedOutList.size());
    }
    @Test
    void expectSuccessfulMessageWhenCheckoutIsSuccess() {
        ConsoleIO consoleIO = mock(ConsoleIO.class);
        Library books =  new Library(consoleIO);
        String expected = "Thank you! Enjoy the book";

        books.checkout("Introduction to Algorithms");

        assertEquals(14,books.listOfBooks.size());
        assertEquals(1,books.checkedOutList.size());
        verify(consoleIO).printToConsole(expected);
    }
    @Test
    void expectUnSuccessfulMessageWhenCheckoutIsUnSuccess() {
        ConsoleIO consoleIO = mock(ConsoleIO.class);
        Library books =  new Library(consoleIO);
        String expected = "Sorry, that book is not available";

        books.checkout("Introduction to Algo");

        verify(consoleIO).printToConsole(expected);
    }

    @Test
    void expectBookIndexWhenBookIsInLibrary()
    {
        ConsoleIO consoleIO = mock(ConsoleIO.class);
        Library books =  new Library(consoleIO);

        int bookIndex = books.searchForBook("Pillars of the Earth, The");

        assertEquals( 9,bookIndex );
    }

}
