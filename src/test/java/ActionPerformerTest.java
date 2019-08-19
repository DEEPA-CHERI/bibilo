import com.thoughtworks.pathashala67.controller.Controller;
import com.thoughtworks.pathashala67.model.ActionPerformer;
import com.thoughtworks.pathashala67.model.Book;
import com.thoughtworks.pathashala67.model.Books;
import com.thoughtworks.pathashala67.model.CheckoutAction;
import com.thoughtworks.pathashala67.view.ConsoleIO;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.TestInstance.Lifecycle.PER_CLASS;
import static org.mockito.Mockito.*;

class ActionPerformerTest {

    private Books books;
    private List<Book> bookList;

    private CheckoutAction action;


    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUpStreams() {
        System.setOut( new PrintStream( outContent ) );
    }

    @AfterEach
    void cleanUpStreams() {
        System.setOut( System.out );
    }


    @BeforeEach
    void setUp() {
        bookList = new ArrayList<>( Arrays.asList( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ),
                new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ),
                new Book( "Head First Design Patterns", "Eric Freeman", 1960 ),
                new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) ) );
        books = new Books( bookList );
        action = mock( CheckoutAction.class );

    }

    @Test
    void expectToDisplayInvalidMessageWhenInvalidOptionChosen() {
        ActionPerformer actionPerformer = new ActionPerformer( books );
        String expected = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";

        actionPerformer.perform( "4" );

        assertThat( outContent.toString(), containsString( expected ) );
    }

}
