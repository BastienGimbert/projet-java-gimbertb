package tp4.collection;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Classe utilitaire pour les collections
 */
public class CollectionUtilitaire {
    /**
     * Affiche une collection
     * @param message le message à afficher
     * @param collection la collection à afficher
     */
    public static void afficheCollection(String message, ArrayList collection) {
        System.out.println(message);
        for (Object o : collection) {
            System.out.println(o);
        }
    }
    /**
     * Affiche une collection
     * @param message le message à afficher
     * @param collection la collection à afficher
     */
    public static void afficheCollection(String message, TreeSet collection) {
        System.out.println(message);
        for (Object o : collection) {
            System.out.println(o);
        }
    }
}
