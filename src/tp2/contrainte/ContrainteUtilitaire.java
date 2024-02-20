package tp2.contrainte;
import java.util.Scanner;

/**
 * Classe utilitaire pour les contraintes
 */
public class ContrainteUtilitaire {
    /**
     * Méthode pour saisir un entier entre min et max
     * @param min la valeur minimale
     * @param max la valeur maximale
     * @return l'entier saisi
     */
    public static ReelContraint saisir(double min, double max) {
        Scanner lecteur = new Scanner(System.in);
        double valeur;
        ReelContraint reelContraint = new ReelContraint(min, max);

        do {
            System.out.println("Entrez une valeur entre " + min + " et " + max + " : ");
            valeur = lecteur.nextDouble();
            lecteur.nextLine();
        } while (valeur < min || valeur > max);

         reelContraint.setValeur(valeur);
         return reelContraint;
    }
    /**
     * Méthode pour saisir une note
     * @return la note saisie entre 0 et 20
     */

    public static Note saisir(){
        Scanner lecteur = new Scanner(System.in);
        double valeur;
        Note note = new Note();

        do {
            System.out.println("Entrez une valeur de Note entre " + note.getMin() + " et " + note.getMax() + " : ");
            valeur = lecteur.nextDouble();
            lecteur.nextLine();
        } while (valeur < note.getMin() || valeur > note.getMax());

        note.setValeur(valeur);
        return note;
    }
}