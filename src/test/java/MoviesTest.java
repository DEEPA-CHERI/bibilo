import com.thoughtworks.pathashala67.model.Book;
import com.thoughtworks.pathashala67.model.Books;
import com.thoughtworks.pathashala67.model.Movie;
import com.thoughtworks.pathashala67.model.Movies;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class MoviesTest {
    Movies movies;


    @BeforeEach
    void setUp() {
        ArrayList<Movie> moviesList = new ArrayList<Movie>();
        moviesList.add( new Movie( "Ninnu choodalani", 2001, "V.R.Prathap", "8" ) );
        moviesList.add( new Movie( "Student No 1", 2001, "S.S Rajamouli", "unrated" ) );
        moviesList.add( new Movie( "Aadi", 2002, "V.V Vinayak", "9" ) );
        moviesList.add( new Movie( "Simhadri", 2003, "S.S Rajamouli", "7" ) );
        moviesList.add( new Movie( "NaraSimhudu", 2005, "B.Gopal", "9" ) );
        movies = new Movies( moviesList );
    }


}
