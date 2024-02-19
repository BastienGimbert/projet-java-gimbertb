package tp2.universite;
/**
 * Classe pour représenter une personne
 */

public class Personne {
    private String login;
    private String nom;
    private String prenom;
    private String adresse;

    /**
     * Constructeur de la classe Personne
     * @param login
     * @param nom
     * @param prenom
     */
    Personne(String login, String nom, String prenom) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
    }

    /**
     * Constructeur de la classe Personne
     * @param login
     * @param nom
     * @param prenom
     * @param adresse
     */
    Personne(String login, String nom, String prenom, String adresse) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
        setAdresse(adresse);
    }
    /**
     * Méthode pour récupérer le login
     * @return le login
     */
    public String getLogin() {
        return login;
    }

    /**
     * Méthode pour récupérer le prénom
     * @return le prénom
     */
    public String getPrenom() {
        return prenom;
    }
    /**
     * Méthode pour récupérer le nom
     * @return le nom
     */
    public String getNom() {
        return nom;
    }
    /**
     * Méthode pour récupérer le nom complet
     * @return le nom complet
     */
    public String getNomComplet() {
        return nom + " " + prenom;
    }
    /**
     * Méthode pour récupérer l'adresse
     * @return l'adresse
     */
    public String getAdresse() {
        if (adresse == null || adresse.isEmpty()) {
            return "Adresse inconnue";
        }else {
            return adresse;
        }
    }
    /**
     * Méthode pour récupérer le mail
     * @return le mail de la personne ( @univ-grenoble-alpes.fr)
     */
    public String getMail() {
        return getNom() + "." + getPrenom() + "@univ-grenoble-alpes.fr";
    }
    /**
     * Méthode pour vérifier si l'adresse existe
     * @return true si l'adresse existe, false sinon
     */
    public boolean existAdresse() {
        return !(adresse == null || adresse.isEmpty());
    }
    /**
     * Méthode pour modifier le login
     * @param login le nouveau login de la personne (en minuscule)
     */
    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }
    /**
     * Méthode pour modifier le prénom
     * @param prenom le nouveau prénom de la personne (avec la première lettre en majuscule)
     */
    public void setPrenom(String prenom) {
        this.prenom = UniversiteUtilitaire.capitalize(prenom);;
    }
    /**
     * Méthode pour modifier le nom
     * @param nom le nouveau nom de la personne (avec la première lettre en majuscule)
     */
    public void setNom(String nom) {
        this.nom = UniversiteUtilitaire.capitalize(nom);;
    }
    /**
     * Méthode pour modifier l'adresse
     * @param adresse la nouvelle adresse de la personne
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
