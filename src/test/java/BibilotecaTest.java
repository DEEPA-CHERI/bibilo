import com.thoughtworks.pathashala67.controller.Bibiloteca;
import com.thoughtworks.pathashala67.model.Books;
import com.thoughtworks.pathashala67.model.Movies;
import com.thoughtworks.pathashala67.view.ConsoleIO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class BibilotecaTest {

    private ConsoleIO consoleIO;
    private Bibiloteca bibiloteca;

    @BeforeEach
    void beforeEach() {
        consoleIO = mock( ConsoleIO.class );
        Books books = mock( Books.class );
        Movies movies = mock( Movies.class);
        bibiloteca = new Bibiloteca( consoleIO, books, movies );
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
                "1 - List of Books\n" +
                "2 - Checkout Book\n" +
                "3 - Return Book\n" +
                "4 - List of Movies\n" +
                "5 - Return Movie\n" +
                "q - Quit the application\n";

        bibiloteca.viewMenuOptions();

        verify( consoleIO, times( 1 ) ).printToConsole( expectedMenu );
    }

    @Test
    void expectApplicationToQuitWhenQuitOptionSelected() {
        when( consoleIO.getInput() ).thenReturn( "q" );

        verifyNoMoreInteractions( consoleIO );
    }


}
