import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class BibilotecaTest {
    @Test
    void expectWelcomeMessageToBePrintWhenUserStartsApplication() {
        ConsoleIO consoleOutput = mock( ConsoleIO.class);
        Bibiloteca bibiloteca = new Bibiloteca(consoleOutput);

        bibiloteca.welcome();

        verify(consoleOutput,times( 1 )).printToConsole("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
//    @Test
//    void shouldDisplayBookNameAuthorNameAndPublishedYearWhenUsersViewsListOfBooks() {
//        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
//        CatalogOfBooks booksCatalog = new CatalogOfBooks();
//        Bibiloteca bibiloteca = new Bibiloteca(consoleOutput,booksCatalog);
//        String Expected = "ListOfBooks\n"+
//              "Id| Name                              | Author           | PublishedYear|\n"+
//               "1|Introduction to Algorithms         | Thomas H. Cormen | 1975|\n"+
//               "2|Learn You a Haskell for Great Good!| Miran Lipovača   | 1940|\n"+
//               "3|Head First Design Patterns         | Eric Freeman     | 1960|\n"+
//               "4|Programming Pearls                 | Jon L. Bentley   | 1915|\n";
//
//        bibiloteca.viewListOfBooks();
//
//        verify(consoleOutput,times( 1 )).displayDetailsOfBooks(Expected);
//    }


    @Test
    void shouldDisplayMenuWhenViewMenuIsCalled() {
        ConsoleIO consoleOutput = mock( ConsoleIO.class);
        Bibiloteca bibiloteca = new Bibiloteca(consoleOutput);
        String expectedMenu = "=========================\n" +
                              "           Menu           \n"+
                              "=========================\n"+
                              "1. List of Books\n";
        bibiloteca.viewMenuOptions();

        verify( consoleOutput,times(1)).printToConsole(expectedMenu);
    }
}
