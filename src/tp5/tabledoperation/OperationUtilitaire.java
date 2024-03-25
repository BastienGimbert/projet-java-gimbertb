package tp5.tabledoperation;
import java.util.Random;
import java.util.Scanner;
/**
 * OperationUtilitaire est une classe utilitaire pour les opérations
 */
public class OperationUtilitaire {
    private static final Random random = new Random();
    private static final int RANGE_MAX = 200;
    private static final int ARRONDI = 10;

    /**
     * Retourne un nombre aléatoire entre 0 et 200
     * @return un nombre aléatoire entre 0 et 200
     */
    public static double randomDouble() {
        return (double)random.nextInt(RANGE_MAX)/ARRONDI;
    }

    /**
     * Arrondi un double à 2 chiffres après la virgule
     * @param valeur
     * @return la valeur arrondie
     */
    public static double arrondir(double valeur) {
        return (double)Math.round(valeur * ARRONDI) / ARRONDI;
    }

    /**
     * Méthode qui permet de saisir un entier entre min et max
     * @param min : valeur minimale
     * @param max : valeur maximale
     * @return un entier entre min et max
     */
    public static int saisieEntreMinEtMax(int min, int max){
        Scanner lecteur = new Scanner(System.in);
        try {
            System.out.println("Addition 1 ou Soustraction 2 ou Multiplication 3 ?");
            int saisie = lecteur.nextInt();
            while (saisie < min || saisie > max) {
                System.out.println("Merci de répondre par 1 ou 2 ou 3 ?");
                saisie = lecteur.nextInt();
            }
            return saisie;
        } catch (Exception e) {
            System.out.println("Merci de répondre par 1 ou 2 ou 3 ?");
            return saisieEntreMinEtMax(min, max);
        }
    }
    /**
     * Méthode qui permet de saisir un boolean
     * @return un boolean
     */
    public static boolean saisieSeulementTrueouFalse() {
        Scanner lecteur = new Scanner(System.in);
        try {
            System.out.println("Mode sans erreur true ou false ?");
            boolean saisie = lecteur.nextBoolean();
            return saisie;
        } catch (Exception e) {
            System.out.println("Merci de répondre par true ou false ?");
            return saisieSeulementTrueouFalse();
        }
    }
}