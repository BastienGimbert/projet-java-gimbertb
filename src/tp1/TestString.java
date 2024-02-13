package tp1;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        // Exercice 1


        // Déclaration des variables
        Scanner entree = new Scanner(System.in);
        System.out.println("Veuillez saisir une chaine de caractères : ");
        String maChaine = entree.nextLine();

        // Affichage des propriétés de la chaine 1
        System.out.println("La chaine saisie est : " + maChaine);
        System.out.println("1. La longueur de la chaine est : " + maChaine.length());
        System.out.println("2. La chaines en majuscule est : " + maChaine.toUpperCase());

        // Initialisation de la chaine 2
        System.out.println("3. Veuillez saisir une autre chaine de caractères : ");
        String maChaine2 = entree.nextLine();

        // Comparaison des chaines
        if (maChaine.equalsIgnoreCase(maChaine2)) {
            System.out.println("Les chaines sont identiques (sans tenir compte de la casse)");
        } else {
            System.out.println("Les chaines sont différentes (sans tenir compte de la casse)");
        }

        // Vérification si la chaine est en minuscules
        if (maChaine.equals(maChaine.toLowerCase())) {
            System.out.println("4. La chaine est en minuscules");
        } else {
            System.out.println("4. La chaine n'est pas en minuscules");
        }

        // Affichage de la chaine en majuscules et sans blancs au début et à la fin
        System.out.println("5. La chaine en majuscules et sans blancs au début et à la fin est : " + maChaine.trim().toUpperCase());

        // Vérification palaindrome
        StringBuilder sb = new StringBuilder(maChaine);
        String maChaineInverse = sb.reverse().toString();

        if (maChaine.equals(maChaineInverse)) {
            System.out.println("6. La chaine est un palindrome");
        } else {
            System.out.println("6. La chaine n'est pas un palindrome");
        }

    }
}
