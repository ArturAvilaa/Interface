
import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "Mensagem de depurar!");
        LoggerFactory.onConsole().log(Level.WARNING, "Mensagem de avisoi!");
        LoggerFactory.onConsole().log(Level.ERROR, "Mensagem de erro!");
    }
}