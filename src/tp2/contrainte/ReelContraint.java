package tp2.contrainte;
/**
 * Classe pour les réels contraints
 */
public class ReelContraint {

    private double min;
    private double max;
    private double valeur;
    /**
     * Constructeur par défaut
     * @param min la valeur minimale
     * @param max la valeur maximale
     */
    public ReelContraint(double min, double max) {
        this.min = min;
        this.max = max;
        this.valeur = min;
    }
    /**
     * Méthode pour obtenir la valeur
     * @return la valeur
     */

    public double getValeur() {
        return valeur;
    }
    /**
     * Méthode pour définir la valeur
     * @param valeur la valeur
     */
    public void setValeur(double valeur) {
        if (valeur >= min && valeur <= max) {
            this.valeur = valeur;
        }
    }
    /**
     * Méthode toString
     * @return la chaine de caractère
     */
    @Override
    public String toString() {
        return "{Valeur=" + valeur + ", min=" + min + ", max=" + max + '}';
    }
    /**
     * Méthode pour obtenir la valeur minimale
     * @return la valeur minimale
     */
    public double getMin() {
        return min;
    }
    /**
     * Méthode pour obtenir la valeur maximale
     * @return la valeur maximale
     */
    public double getMax() {
        return max;
    }
}
