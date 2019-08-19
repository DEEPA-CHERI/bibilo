import com.thoughtworks.pathashala67.Model.ActionPerformer;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.Model.Books;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ActionPerformerTest {

    private Books books;
    private List<Book> bookList;


    @BeforeEach
    void setUp() {
        bookList = new ArrayList<>( Arrays.asList( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ),
                new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ),
                new Book( "Head First Design Patterns", "Eric Freeman", 1960 ),
                new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) ) );
        books = new Books( bookList );
    }

    @Test
    void expectToCallCheckoutMethod() {
        ActionPerformer actionPerformer = new ActionPerformer(  books, "Programming Pearls" );
        String expected = "Thank you! Enjoy the book";

        String actual = actionPerformer.perform( "2" );


        assertEquals( expected, actual );
    }

    @Test
    void expectToCallReturnMethod() {
        ActionPerformer actionPerformer = new ActionPerformer( books, "Programming Pearls" );
        String expected = "Thank you for returning the book";
        actionPerformer.perform( "2" );

        String actual = actionPerformer.perform( "3" );


        assertEquals( expected, actual );
    }
}
