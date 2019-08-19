import com.thoughtworks.pathashala67.exceptions.BookNotAvailableException;
import com.thoughtworks.pathashala67.exceptions.InvalidBookException;
import com.thoughtworks.pathashala67.model.Book;
import com.thoughtworks.pathashala67.model.Books;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


class BooksTest {

    private Books books;
    private List<Book> bookList;

    @BeforeEach
    void setUp() {
        bookList = new ArrayList<>( Arrays.asList( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ),
                new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ),
                new Book( "Head First Design Patterns", "Eric Freeman", 1960 ),
                new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) ) );
        books = new Books(bookList);
    }

    @Test
    void expectBookIndexWhenBookIsInLibrary() throws BookNotAvailableException {
        Book book = books.searchForBook( "Programming Pearls", bookList );

        assertEquals( bookList.get( 3 ), book );
    }

    @Test
    void expectSuccessMessageWhenCheckoutIsSuccessful() throws BookNotAvailableException {
        String expected = "Thank you! Enjoy the book";

        String actual = books.checkout( "Learn You a Haskell for Great Good!" );

        assertEquals( expected, actual );
    }

    @Test
    void expectExceptionWhenCheckoutIsUnSuccessful() throws BookNotAvailableException {
        books.checkout( "Learn You a Haskell for Great Good!" );

        assertThrows( BookNotAvailableException.class, () -> books.checkout( "Learn You a Haskell for Great Good!" ) );
    }

    @Test
    void expectUserAbleToReturnBook() throws BookNotAvailableException, InvalidBookException {
        books.checkout( "Learn You a Haskell for Great Good!" );
        String expected = "Thank you for returning the book";

        String actual = books.returnBook( "Learn You a Haskell for Great Good!" );

        assertEquals( expected, actual );
    }

    @Test
    void expectUserToBeNotifiedOnUnsuccessfulReturnOfBook() throws BookNotAvailableException {
        books.checkout( "Introduction to Algorithms" );

        assertThrows( InvalidBookException.class, () -> books.returnBook( "Introduction to Algorits" ) );
    }
}
