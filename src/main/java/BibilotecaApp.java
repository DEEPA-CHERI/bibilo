import com.thoughtworks.pathashala67.Bibiloteca;
import com.thoughtworks.pathashala67.ConsoleOutput;

class BibilotecaApp {
    public static void main( String[] args ) {
        ConsoleOutput consoleOutput = new ConsoleOutput();
        Bibiloteca bibiloteca = new Bibiloteca( consoleOutput );
        bibiloteca.welcome();
    }

}
