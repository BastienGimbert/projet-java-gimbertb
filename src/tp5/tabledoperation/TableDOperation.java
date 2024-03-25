package tp5.tabledoperation;
import java.util.logging.Logger;
/**
 * Classe TableDOperation
 */
public class TableDOperation {

    private static final Logger LOGGER = Logger.getLogger(TableDOperation.class.getName());

    private OperationEnum typeOperation;
    private static final int NB_OPERATIONS = 5;
    private Operation[] operation = new Operation[NB_OPERATIONS];
    private boolean modeSansErreur;


    /**
     * Constructeur de la classe TableDOperation
     * @param typeOperation type d'opération
     */
    TableDOperation(OperationEnum typeOperation, boolean modeSansErreur) {
        this.typeOperation = typeOperation;
        this.modeSansErreur = modeSansErreur;
        LOGGER.info("Type d'operation : " + typeOperation);
        initialisation();
    }
    /**
     * Méthode qui initialise le tableau d'opérations
     */
    private void initialisation() {
        LOGGER.info("Initialisation des opérations");
        for (int i = 0; i < NB_OPERATIONS; i++) {
            operation[i] = typeOperation.getOperation(OperationUtilitaire.randomDouble(),OperationUtilitaire.randomDouble(), modeSansErreur);
        }
    }
    /**
     * Méthode qui retourne le nombre de réponses justes
     * @return le nombre de réponses justes
     */
    public int getNombreReponsesJustes() {
        int nbReponsesJustes = 0;
        for (int i = 0; i < NB_OPERATIONS; i++) {
            if (operation[i].isReponseJuste()) {
                LOGGER.info("Une réponse juste de l'utilisateur");
                nbReponsesJustes++;
            } else {
                LOGGER.warning("Une réponse fausse de l'utilisateur");
            }
        }
        return nbReponsesJustes;
    }
    /**
     * Méthode qui retourne le nombre d'opérations
     * @return le nombre d'opérations
     */
    public int getNombreDOperations() {
        return NB_OPERATIONS;
    }

    /**
     * Méthode qui retourne une opération à un index donné
     * @param index index de l'opération
     * @return une opération
     */
    public Operation getOperation(int index) {
        return operation[index];
    }


}
