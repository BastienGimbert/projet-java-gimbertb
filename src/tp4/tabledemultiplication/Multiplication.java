package tp4.tabledemultiplication;
/**
 * Classe représentant une multiplication
 */
public class Multiplication {
    private int terme1;
    private int terme2;
    private Integer reponseUtilisateur;
    /**
     * Constructeur
     * @param terme1
     * @param terme2
     */

    Multiplication(int terme1, int terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;
    }
    /**
     * Définit la réponse de l'utilisateur
     * Si la réponse de l'utilisateur ne correspond pas à la solution, une exception est levée ErreurMultiplicationException
     * @param reponseUtilisateur la réponse de l'utilisateur
     * @param modeSansEchec vrai si le mode sans échec est activé
     */
    public void setReponseUtilisateur(Integer reponseUtilisateur, boolean modeSansEchec) throws ErreurMultiplicationException {
        this.reponseUtilisateur = reponseUtilisateur;
        if (modeSansEchec && reponseUtilisateur != terme1 * terme2) {
            throw new ErreurMultiplicationException("Votre réponse n'est pas correcte , Réessayez");
        }
    }
    /**
     * Retourne vrai si la réponse de l'utilisateur est juste
     * @return vrai si la réponse de l'utilisateur est juste
     */
    public boolean isReponseJuste() {
        return reponseUtilisateur == terme1 * terme2;
    }
    /**
     * Retourne une chaîne de caractères représentant la multiplication
     */
    public String toString() {
        return terme1 + " * " + terme2 + " = ";
    }
}
