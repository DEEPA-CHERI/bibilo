import com.thoughtworks.pathashala67.Bibiloteca;
import com.thoughtworks.pathashala67.CatalogOfBooks;
import com.thoughtworks.pathashala67.ConsoleOutput;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class BibilotecaTest {
    @Test
    void expectWelcomeMessageToBePrintWhenUserStartsApplication() {
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        Bibiloteca bibiloteca = new Bibiloteca(consoleOutput);

        bibiloteca.welcome();

        verify(consoleOutput,times( 1 )).display("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
    @Test
    void shouldDisplayListOfAllBooksAfterWelcomeMessageAppears() {
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        CatalogOfBooks booksCatalog = new CatalogOfBooks();
        Bibiloteca bibiloteca = new Bibiloteca(consoleOutput,booksCatalog);
        String Expected = "****Books****\n" +
                "1 - Introduction to Algorithms\n" +
                "2 - Learn You a Haskell for Great Good!\n" +
                "3 - Head First Design Patterns\n" +
                "4 - Programming Pearls\n";

        bibiloteca.viewListOfBooks();

        verify(consoleOutput,times( 1 )).displayBooks(Expected);
    }
}
