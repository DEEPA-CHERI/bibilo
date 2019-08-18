import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BibilotecaTest {

    private ConsoleIO consoleIO;
    private Bibiloteca bibiloteca;
    private Library library;

    @BeforeEach
    void beforeEach() {
        consoleIO = mock( ConsoleIO.class );
        library = mock( Library.class );
        bibiloteca = new Bibiloteca( consoleIO, library );
    }


    @Test
    void expectWelcomeMessageToBePrintWhenUserStartsApplication() {
        bibiloteca.welcome();

        verify( consoleIO, times( 1 ) ).printToConsole( "Welcome to Biblioteca. Your one-stop-shop for great books in Bangalore!" );
    }

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
    void expectInvalidMessageWhenInvalidInputGiven() {
        String expectedMessage = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";

        bibiloteca.selectMenuOption( "4" );

        verify( consoleIO, times( 1 ) ).printToConsole( expectedMessage );
    }

    @Test
    void expectApplicationToQuitWhenQuitOptionSelected() {
        when( consoleIO.getInput() ).thenReturn( "q" );

        verifyNoMoreInteractions( consoleIO );
    }


}
