package tp5.tabledoperation;
import java.util.Random;
import java.util.Scanner;

public class OperationUtilitaire {
    private static final Random random = new Random();
    private static final int RANGE_MAX = 200;
    private static final int ARRONDI = 10;

    // Retourne une valeur de type double entre 0 et RANGE_MAX/ARRONDI
    public static double randomDouble() {
        return (double)random.nextInt(RANGE_MAX)/ARRONDI;
    }

    // Retourne la valeur double arrondi
    // Evite les erreurs de calcul du au double en Java

    public static double arrondir(double valeur) {
        return (double)Math.round(valeur * ARRONDI) / ARRONDI;
    }


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
}