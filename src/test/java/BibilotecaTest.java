import com.thoughtworks.pathashala67.Bibiloteca;
import com.thoughtworks.pathashala67.ConsoleOutput;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class BibilotecaTest {
    @Test
    void expectWelcomeMessageToBePrintedWhenUserStartsApplication() {
        ConsoleOutput consoleOutput = mock(ConsoleOutput.class);
        Bibiloteca bibiloteca = new Bibiloteca(consoleOutput);

        bibiloteca.welcome();

        verify(consoleOutput,times( 1 )).display("Welcome to Biblioteca. Your one-stop-shop for great book titles in Bangalore!");
    }
}