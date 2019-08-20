import com.thoughtworks.pathashala67.model.Books;
import com.thoughtworks.pathashala67.model.Intializer;
import com.thoughtworks.pathashala67.model.Movies;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;

class IntializerTest {
    private Intializer intializer = mock( Intializer.class );


    @Test
    void expectBooksWhenLoadBooksMethodCalled() {

        assertTrue( intializer.loadBooks() instanceof Books );
    }

    @Test
    void expectMoviesWhenLoadMoviesMethodCalled() {

        assertTrue( intializer.loadMovies() instanceof Movies );
    }


}
