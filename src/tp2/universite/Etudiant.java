package tp2.universite;
/**
 * Classe pour représenter un Etudiant
 */
public class Etudiant extends Personne {
    private String adresseParent;

    /**
     * Constructeur de la classe Etudiant avec 3 paramètres (login, prenom, nom) de la classe Personne
     * @param login
     * @param prenom
     * @param nom
     */
    public Etudiant(String login, String prenom, String nom) {
        // Appel du constructeur de la classe parent
        super(login, prenom, nom);

    }
    /**
     * Constructeur de la classe Etudiant avec 4 paramètres (login, prenom, nom, adresse) de la classe Personne
     * @param login
     * @param prenom
     * @param nom
     * @param adresse
     * @param adresseParent
     */
    public Etudiant(String login, String prenom, String nom, String adresse, String adresseParent) {
        // Appel du constructeur de la classe parent
        super(login, prenom, nom, adresse);
        setAdresseParent(adresseParent);
    }
    /**
     * Méthode pour récupérer le mail
     * @return le mail de l'étudiant ( @etu.univ-grenoble-alpes.fr)
     */
    @Override
    public String getMail() {
        return getNom() + "." + getPrenom() + "@etu.univ-grenoble-alpes.fr";
    }
    /**
     * Méthode pour récupérer l'adresse
     * @return l'adresse de l'étudiant (adresse personnelle et adresse des parents) ou "Adresse inconnue" si l'adresse n'est pas renseignée
     */
    @Override
    public String getAdresse() {
        if (super.getAdresse() != null && this.adresseParent != null) {
            return super.getAdresse() + " (Adresse des parents " + this.adresseParent + ")";
        } else if (super.getAdresse() != null) {
            return super.getAdresse();
        } else if (this.adresseParent != null) {
            return this.adresseParent;
        } else {
            return "Adresse inconnue";
        }
    }
    /**
     * Méthode pour vérifier si l'adresse de l'étudiant est renseignée
     * @return true si l'adresse de l'étudiant est renseignée, false sinon
     */
    @Override
    public boolean existAdresse() {
        return super.existAdresse() || (this.adresseParent != null && !this.adresseParent.isEmpty());
    }

    /**
     * Méthode pour set l'adresse de l'étudiant et l'adresse des parents
     * @param adresse
     * @param adresseParent
     */
    public void setAdresse(String adresse, String adresseParent) {
        super.setAdresse(adresse);
        this.adresseParent = adresseParent;
    }
    /**
     * Méthode pour récupérer l'adresse des parents
     * @return l'adresse des parents
     */
    public void setAdresseParent(String adresseParent) {
        this.adresseParent = adresseParent;
    }

}