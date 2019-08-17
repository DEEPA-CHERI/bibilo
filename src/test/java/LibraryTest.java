import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.Model.Library;
import com.thoughtworks.pathashala67.View.ConsoleIO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class LibraryTest {

    private Library library;

    @BeforeEach
    void setUp() {
        List<Book> books = new ArrayList<>( Arrays.asList( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ),
                new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ),
                new Book( "Head First Design Patterns", "Eric Freeman", 1960 ),
                new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) ) );
        library = new Library( books );
    }

    @Test
    void expectBookIndexWhenBookIsInLibrary() throws BookNotAvailableException {
        int bookIndex = library.searchForBook( "Programming Pearls", library.books );

        assertEquals( 3, bookIndex );
    }

    @Test
    void expectUserAbleToCheckoutBook() throws BookNotAvailableException {
        library.checkout( "Introduction to Algorithms" );

        assertEquals( 3, library.books.size() );
        assertEquals( 1, library.checkedOutBooks.size() );
    }

    @Test
    void expectSuccessMessageWhenCheckoutIsSuccessful() throws BookNotAvailableException {
        String expected = "Thank you! Enjoy the book";

        String actual = library.checkout( "Learn You a Haskell for Great Good!" );

        assertEquals( 3, library.books.size() );
        assertEquals( 1, library.checkedOutBooks.size() );
        assertEquals( expected,actual);
    }

    @Test
    void expectExceptionWhenCheckoutIsUnSuccessful() throws BookNotAvailableException {
        String expected = "Sorry, that book is not available";
        library.checkout("Learn You a Haskell for Great Good!"  );

        assertThrows( BookNotAvailableException.class, ()->library.checkout("Learn You a Haskell for Great Good!"));
    }



}
