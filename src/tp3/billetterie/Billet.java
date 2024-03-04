package tp3.billetterie;
/**
 * Classe Billet
 */
public class Billet {
    private double prixAuKm;
    private Trajet trajet;
    /**
     * Constructeur de la classe Billet
     * @param trajet
     * @param prixAuKm
     */
    Billet(Trajet trajet, double prixAuKm) {
        setPrixAuKm(prixAuKm);
        this.trajet = trajet;
    }
    /**
     * Méthode getDepart
     * @return depart
     */
    public String getDepart() {
        return trajet.getDepart();
    }
    /**
     * Méthode getArrivee
     * @return arrivee
     */
    public String getArrivee() {
        return trajet.getArrivee();
    }
    /**
     * Méthode getDistance
     * @return distance
     */
    public int getDistance() {
        return trajet.getDistance();
    }
    /**
     * Méthode getPrixAuKm
     * @return prixAuKm
     */
    public double getPrixAuKm() {
        return prixAuKm;
    }
    /**
     * Méthode getPrix
     * @return prix
     */
    public double getPrix() {
        return prixAuKm * trajet.getDistance();
    }
    /**
     * Méthode setPrixAuKm
     * @param prixAuKm au km entre 0.1 et 2
     */
    public void setPrixAuKm(double prixAuKm) {
        this.prixAuKm = Math.max(0.1, Math.min(2, prixAuKm));
    }
    /**
     * Méthode toString
     * @return String
     */
    @Override
    public String toString() {
        return "Billet : [" + trajet + "], prix : " + BilletUtilitaire.arrondirPrix(getPrix()) + " euros";
    }
}