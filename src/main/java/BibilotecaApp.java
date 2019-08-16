import com.thoughtworks.pathashala67.Controller.Bibiloteca;
import com.thoughtworks.pathashala67.View.ConsoleIO;

class BibilotecaApp {
    public static void main( String[] args ) {
        ConsoleIO consoleIO = new ConsoleIO();
        Bibiloteca bibiloteca = new Bibiloteca(consoleIO);
        bibiloteca.welcome();
        bibiloteca.run();
    }

}
