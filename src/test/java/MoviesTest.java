import com.thoughtworks.pathashala67.exceptions.InvalidMovieException;
import com.thoughtworks.pathashala67.exceptions.MovieNotAvailableException;
import com.thoughtworks.pathashala67.model.Movie;
import com.thoughtworks.pathashala67.model.Movies;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MoviesTest {
    private Movies movies;


    @BeforeEach
    void setUp() {
        ArrayList<Movie> moviesList = new ArrayList<>();
        moviesList.add( new Movie( "Ninnu choodalani", 2001, "V.R.Prathap", "8" ) );
        moviesList.add( new Movie( "Student No 1", 2001, "S.S Rajamouli", "9" ) );
        moviesList.add( new Movie( "Aadi", 2002, "V.V Vinayak", "unrated" ) );
        moviesList.add( new Movie( "Simhadri", 2003, "S.S Rajamouli", "7" ) );
        moviesList.add( new Movie( "NaraSimhudu", 2005, "B.Gopal", "8" ) );
        movies = new Movies( moviesList );
    }

    @Test
    void expectUserAbleToCheckoutMovie() throws MovieNotAvailableException {
        String expected = "Thank you! Enjoy the Movie";

        String actual = movies.checkout( "Student No 1" );

        assertEquals( expected, actual );
    }

    @Test
    void expectBookWhenBookIsFound() throws MovieNotAvailableException {
        Movie movie = movies.searchForMovie( "Aadi" );

        assertEquals( movie, new Movie( "Aadi" ) );
    }

    @Test
    void expectExceptionWhenBookIsNotFound() throws MovieNotAvailableException {

        assertThrows( MovieNotAvailableException.class, () -> movies.searchForMovie( "Student No" ) );
    }

    @Test
    void expectUserAbleToReturnAMovie() throws MovieNotAvailableException, InvalidMovieException {
        movies.checkout( "Student No 1" );
        String expected = "Thank you for returning the movie";

        String actual = movies.returnMovie( "Student No 1" );

        assertEquals( expected, actual );
    }

    @Test
    void expectToDisplayMovieDetailsWhenDisplayMethodCalled() {
        String expected = "********************Movies List********************\n" +
                "|Id   | Name                          | Year      | Director            | Rating         |\n" +
                "|1    | Ninnu choodalani              | 2001      | V.R.Prathap         | 8              |\n" +
                "|2    | Student No 1                  | 2001      | S.S Rajamouli       | 9              |\n" +
                "|3    | Aadi                          | 2002      | V.V Vinayak         | unrated        |\n" +
                "|4    | Simhadri                      | 2003      | S.S Rajamouli       | 7              |\n" +
                "|5    | NaraSimhudu                   | 2005      | B.Gopal             | 8              |\n";

        String movieDetails = movies.displayMovieListDetails();

        assertEquals( expected, movieDetails );
    }
}
