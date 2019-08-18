import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

class BibilotecaTest {

    private ConsoleIO consoleIO;
    private Bibiloteca bibiloteca;
    private List<Book> books;

    @BeforeEach
    void beforeEach() {
        consoleIO = mock( ConsoleIO.class );
        bibiloteca = new Bibiloteca( consoleIO, books );
    }


    @Test
    void expectWelcomeMessageToBePrintWhenUserStartsApplication() {
        bibiloteca.welcome();

        verify( consoleIO, times( 1 ) ).printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!" );
    }
//    @Test
//    void shouldDisplayBookNameAuthorNameAndPublishedYearWhenUsersViewsListOfBooks() {
//        ConsoleIO consoleIO = mock(ConsoleIO.class);
//        Bibiloteca bibiloteca = new Bibiloteca(consoleIO);
//        String Expected =
//
//        bibiloteca.viewListOfBooks();
//
//        verify(consoleIO,times( 1 )).display(Expected);
//    }


    @Test
    void shouldDisplayMenuWhenViewMenuIsCalled() {
        String expectedMenu = "=========================\n"
                + "           Menu           \n" +
                "=========================\n" +
                "1. List of Books\n" +
                "2 - Checkout Book\n" +
                "3 - Return Book\n" +
                "q. Quit the application\n";

        bibiloteca.viewMenuOptions();

        verify( consoleIO, times( 1 ) ).printToConsole( expectedMenu );
    }

    @Test
    void expectInvalidMessageWhenInvalidInputGiven() throws BookNotAvailableException {
        String expectedMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";

        bibiloteca.selectMenuOptionWithChoice( "XYZ" );

        verify( consoleIO, times( 1 ) ).printToConsole( expectedMessage );
    }

    @Test
    void expectApplicationToQuitWhenQuitOptionSelected() {
        when( consoleIO.getInput() ).thenReturn( "q" );

        verifyNoMoreInteractions( consoleIO );
    }


}
