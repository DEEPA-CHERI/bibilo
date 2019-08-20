import com.thoughtworks.pathashala67.model.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

class ActionPerformerTest {

    private Books books;
    private Movies movies;


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
        List<Book> bookList = new ArrayList<>( Arrays.asList( new Book( "Introduction to Algorithms", "Thomas H. Cormen", 1975 ),
                new Book( "Learn You a Haskell for Great Good!", "Miran Lipovača", 1940 ),
                new Book( "Head First Design Patterns", "Eric Freeman", 1960 ),
                new Book( "Programming Pearls", "Jon L. Bentley", 1915 ) ) );
        books = new Books( bookList );

        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add( new Movie( "Ninnu choodalani" ) );
        moviesList.add( new Movie( "Student No 1" ) );
        moviesList.add( new Movie( "Aadi" ) );
        moviesList.add( new Movie( "Simhadri" ) );
        moviesList.add( new Movie( "NaraSimhudu" ) );
        movies = new Movies( moviesList );
    }

    @Test
    void expectToDisplayInvalidMessageWhenInvalidOptionChosen() {
        ActionPerformer actionPerformer = new ActionPerformer( books, movies );
        String expected = "=====================\n" +
                "Select a valid option!\n" +
                "=====================";

        actionPerformer.perform( "4" );

        assertThat( outContent.toString(), containsString( expected ) );
    }

}
