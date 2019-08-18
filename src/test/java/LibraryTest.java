import com.thoughtworks.pathashala67.Exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.Exceptions.InvalidBookException;
import com.thoughtworks.pathashala67.Model.Book;
import com.thoughtworks.pathashala67.Model.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class LibraryTest {

    private Library library;
    List<Book> books;

    @BeforeEach
    void setUp() {
        books = new ArrayList<>( Arrays.asList( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ),
                new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ),
                new Book( "Head First Design Patterns", "Eric Freeman", 1960 ),
                new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) ) );
        library = new Library( books );
    }

    @Test
    void expectBookIndexWhenBookIsInLibrary() throws BookNotAvailableException {
        Book book = library.searchForBook( "Programming Pearls", books );

        assertEquals( books.get( 3 ), book );
    }

    @Test
    void expectSuccessMessageWhenCheckoutIsSuccessful() throws BookNotAvailableException {
        String expected = "Thank you! Enjoy the book";

        String actual = library.checkout( "Learn You a Haskell for Great Good!" );

        assertEquals( expected, actual );
    }

    @Test
    void expectExceptionWhenCheckoutIsUnSuccessful() throws BookNotAvailableException {
        library.checkout( "Learn You a Haskell for Great Good!" );

        assertThrows( BookNotAvailableException.class, () -> library.checkout( "Learn You a Haskell for Great Good!" ) );
    }

    @Test
    void expectUserAbleToReturnBook() throws BookNotAvailableException, InvalidBookException {
        library.checkout( "Learn You a Haskell for Great Good!" );
        String expected = "Thank you for returning the book";

        String actual = library.returnBook( "Learn You a Haskell for Great Good!" );

        assertEquals( expected, actual );
    }

    @Test
    void expectUserToBeNotifiedOnUnsuccessfulReturnOfBook() throws BookNotAvailableException {
        library.checkout( "Introduction to Algorithms" );

        assertThrows( InvalidBookException.class, () -> library.returnBook( "Introduction to Algorits" ) );
    }
}
