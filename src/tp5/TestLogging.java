package tp5;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestLogging {
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Mon premier log !");

        Random random = new Random();
        int dividende = random.nextInt(10);
        int diviseur = random.nextInt(3);

        LOGGER.log(Level.WARNING, "Attention à une division par zéro peut se produire");

        try {
            int quotient = dividende / diviseur;
            Object[] data = { dividende, diviseur, quotient };
            LOGGER.log( Level.INFO, "dividende = {0}, diviseur = {1} et quotient = {2}", data );
        } catch (ArithmeticException e) {
            LOGGER.log(Level.SEVERE, "Le message d'exception : " + e.toString());
        }
    }
}