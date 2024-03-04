package tp3.billetterie;
/**
 * Classe BilletReduit
 */
public class BilletReduit extends Billet {
    private double tauxDeReduction;
    /**
     * Constructeur de la classe BilletReduit
     * @param trajet
     * @param prixAuKm
     * @param tauxDeReduction
     */
    BilletReduit(Trajet trajet, double prixAuKm, double tauxDeReduction) {
        super(trajet, prixAuKm);
        setTauxDeReduction(tauxDeReduction);
    }
    /**
     * Méthode getTauxDeReduction
     * @return tauxDeReduction
     */
    public double getTauxDeReduction() {
        return tauxDeReduction;
    }
    /**
     * Méthode getPrix
     * @return prix
     */
    public double getPrix() {
        return super.getPrix() * (1 - tauxDeReduction);
    }
    /**
     * Méthode setTauxDeReduction
     * @param tauxDeReduction entre 0.05 et 0.5
     */
    public void setTauxDeReduction(double tauxDeReduction) {
        this.tauxDeReduction = Math.max(0.05, Math.min(0.5, tauxDeReduction));
    }
    /**
     * Méthode toString
     * @return String
     */
    public String toString() {
        return "BilletReduit : [Trajet : " + super.getDepart() + " => " + getArrivee() + "(" + getDistance() + " km)], prix : " + BilletUtilitaire.arrondirPrix(getPrix()) + "euros, avec une réduction de " + tauxDeReduction * 100 + "%";
    }
}