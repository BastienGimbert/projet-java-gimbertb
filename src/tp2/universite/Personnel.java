package tp2.universite;

import tp2.contrainte.ReelContraint;

/**
 * Classe pour les personnels
 */
public class Personnel extends Personne {
    private int echelon;
    private ReelContraint pointDIndice;

    public static final int MIN_ECHELON = 1;
    public static final int MAX_ECHELON = 4;
    public static final double MIN_POINT_D_INDICE = 1000;
    public static final double MAX_POINT_D_INDICE = 1200;

    /**
     * Constructeur par défaut
     * @param login le login
     * @param prenom le prénom
     * @param nom le nom
     */
    public Personnel(String login, String prenom, String nom) {
        super(login, prenom, nom);
        this.echelon = MIN_ECHELON;
        this.pointDIndice = new ReelContraint(MIN_POINT_D_INDICE, MAX_POINT_D_INDICE);
        this.pointDIndice.setValeur(MIN_POINT_D_INDICE);
    }

    /**
     * Constructeur avec l'adresse
     * @param login le login
     * @param prenom le prénom
     * @param nom le nom
     * @param echelon l'échelon
     * @param @pointDIndice le point d'indice
     */

    public Personnel(String login, String prenom, String nom, int echelon, double pointDIndice) {
        super(login, prenom, nom);
        setEchelon(echelon);
        this.pointDIndice = new ReelContraint(MIN_POINT_D_INDICE, MAX_POINT_D_INDICE);
        this.pointDIndice.setValeur(pointDIndice);
    }

    /**
     * Méthode pour obtenir l'échelon
     * @return l'échelon
     */

    public int getEchelon() {
        return echelon;
    }

    /**
     * Méthode pour obtenir le point d'indice
     * @return le point d'indice
     */

    public ReelContraint getPointDIndice() {
        return pointDIndice;
    }

    /**
     * Méthode pour obtenir le salaire
     * @return le salaire ( échelon * pointDIndice)
     */

    public double getSalaire() {
        return echelon * pointDIndice.getValeur();
    }

    /**
     * Méthode pour définir l'échelon entre 1 et 4 , sinon 1
     * @param echelon l'échelon
     */

    public void setEchelon(int echelon) {
        if (echelon < MIN_ECHELON) {
            this.echelon = MIN_ECHELON;
        } else if (echelon > MAX_ECHELON) {
            this.echelon = MAX_ECHELON;
        } else {
            this.echelon = echelon;
        }
    }

    /**
     * Méthode pour définir le point d'indice entre 1000 et 1200, sinon 1000
     * @param pointDIndice le point d'indice
     */

    public void setPointDIndice(double pointDIndice) {
        this.pointDIndice.setValeur(pointDIndice);
    }

    /**
     * Méthode pour obtenir le mail
     * @return le mail
     */

    public String getMail() {
        return getPrenom() + "." + getNom() + "@univ-grenoble-alpes.fr";
    }
}