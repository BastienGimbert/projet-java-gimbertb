package tp4.tabledemultiplication;
/**
 * Classe exception pour les erreurs de multiplication

 */
public class ErreurMultiplicationException extends Exception{
    /**
     * Constructeur
     * @param message le message de l'exception
     */
    public ErreurMultiplicationException(String message) {
        super(message);
    }
}
