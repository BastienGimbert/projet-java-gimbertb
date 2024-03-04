package tp3.billetterie;
/**
 * Classe Trajet
 */
public class Trajet {
    private String depart;
    private String arrivee;
    private int distance;
    /**
     * Constructeur de la classe Trajet
     * @param depart en majuscule
     * @param arrivee en majuscule
     * @param distance entre 5 et 2000 km
     */
    public Trajet(String depart, String arrivee, int distance) {
        setDepart(depart);
        setArrivee(arrivee);
        setDistance(distance);
    }
    /**
     * Méthode getDepart
     * @return depart
     */
    public String getDepart() {
        return depart;
    }

    /**
     * Méthode setDepart
     * @param depart en majuscule
     */
    public void setDepart(String depart) {
        this.depart = depart.toUpperCase();
    }
    /**
     * Méthode getArrivee
     * @return arrivee
     */
    public String getArrivee() {
        return arrivee;
    }
    /**
     * Méthode setArrivee
     * @param arrivee en majuscule
     */
    public void setArrivee(String arrivee) {
        this.arrivee = arrivee.toUpperCase();
    }
    /**
     * Méthode getDistance
     * @return distance
     */
    public int getDistance() {
        return distance;
    }
    /**
     * Méthode setDistance
     * @param distance Entre 5 et 2000 km
     */
    public void setDistance(int distance) {
        this.distance = Math.max(5, Math.min(2000, distance));
    }
    /**
     * Méthode toString
     */
    public String toString() {
        return "Trajet : " + depart + " => " + arrivee + " (" + distance + " km)";
    }
}