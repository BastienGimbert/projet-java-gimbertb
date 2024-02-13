package jeu;

import java.util.Random;

public class GuerrieurUtilitaire {
    private static Random random = new Random();

    /**
     * Affiche les statistiques d'un guerrier.
     * @param guerrier le guerrier à afficher.
     */

    public static void afficheGuerrier(Guerrier guerrier) {
        System.out.println("Force : " + guerrier.getForce());
        System.out.println("Points de vie : " + guerrier.getPointsDeVie());
    }

    /**
     * Simule le lancer d'un dé à 3 faces.
     * @return un entier entre 1 et 3.
     */
    public static int de3() {
        return random.nextInt(3) + 1;
    }

    /**
     * Simule le lancer de plusieurs dés à 3 faces.
     * @param nombreLance le nombre de dés à lancer.
     * @return la somme des résultats des lancers de dés.
     */
    public static int de3(int nombreLance) {
        int somme = 0;
        for (int i = 0; i < nombreLance; i++) {
            somme += de3();
        }
        return somme;
    }
}