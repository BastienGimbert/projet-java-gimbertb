package tp5.tabledoperation;
import java.util.logging.Logger;


/**
 * Classe Operation
 */
public abstract class Operation {
    private static final Logger LOGGER = Logger.getLogger(Operation.class.getName());
    //private static final LogManager logManager = LogManager.getLogManager();
    private double terme1;
    private double terme2;
    private Double reponseUtilisateur;
    private boolean modeSansErreur;

    /**
     * Constructeur de la classe Operation
     * @param terme1 TERME 1
     * @param terme2 TERME 2
     */

    public Operation(double terme1, double terme2, boolean modeSansErreur) {
        this.terme1 = terme1;
        this.terme2 = terme2;
        this.modeSansErreur = modeSansErreur;
        LOGGER.info("Création d'opération avec les termes " + terme1 + " et " + terme2);
    }
    /**
     * Méthode qui set la réponse de l'utilisateur
     */
    public void setReponseUtilisateur(Double reponse) throws ErreurOperationException {
        this.reponseUtilisateur = reponse;
        if (modeSansErreur && !isReponseJuste() ) {
            throw new ErreurOperationException("La réponse n'est pas correcte, réessayez !");
        }
    }
    /**
     * Méthode qui retourne une valeur booléenne représentant si l'utilisateur a répondu
     * @return true si l'utilisateur a répondu, false sinon
     */
    public boolean existeReponseUtilisateur() {
        return reponseUtilisateur != null;
    }
    /**
     * Méthode qui retourne un double représentant le resultat de l'opération
     * @return le résultat de l'opération
     */
    public abstract double calculResultat();

    /**
     * Methode qui retourne le terme 1
     * @return le terme 1
     */
    public double getTerme1() {
        return terme1;
    }
    /**
     * Methode qui retourne le terme 2
     * @return le terme 2
     */
    public double getTerme2() {
        return terme2;
    }

    /**
     * Méthode qui permet de savoir si la réponse de l'utilisateur est juste
     * @return true si la réponse est juste, false sinon.
     */
    public boolean isReponseJuste() {
        return Math.abs(calculResultat() - reponseUtilisateur) < 0.01; // 0.01 car on a des doubles , 2 chiffres après la virgule
    }

}