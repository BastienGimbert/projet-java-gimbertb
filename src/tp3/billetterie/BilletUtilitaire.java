package tp3.billetterie;
import java.util.ArrayList;
/**
 * Classe BilletUtilitaire
 */
public class BilletUtilitaire {
    /**
     * Méthode afficheTrajets
     * @param trajets affiche les trajets
     */
    public static void afficheTrajets(ArrayList<Trajet> trajets) {
        System.out.println("----- Les trajets -----");
        for (Trajet t : trajets) {
            System.out.println(t);
        }
    }
    /**
     * Méthode afficheBillets
     * @param billets affiche les billets
     */
    public static void afficheBillets(ArrayList<Billet> billets) {
        System.out.println("----- Les billets -----");
        for (Billet b : billets) {
            System.out.println(b);
        }
    }

    /**
     * Méthode arrondirPrix
     * @param prix à arrondir
     * @return prix arrondi à 2 chiffres après la virgule
     */
    public static double arrondirPrix(double prix) {
        return (double) Math.round(prix * 100) /100;
    }


}
