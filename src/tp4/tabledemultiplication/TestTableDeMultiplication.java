package tp4.tabledemultiplication;
import java.util.Scanner;
/**
 * Classe de test pour la table de multiplication
 */
public class TestTableDeMultiplication {
    /**
     * Méthode principale
     * @param args arguments
     * @throws ErreurMultiplicationException
     */
    public static void main(String[] args) throws ErreurMultiplicationException {
        Scanner lecteur = new Scanner(System.in);
        TableDeMultiplication table;

        // Choix de la table de multiplication
        System.out.println("Donner un nombre pour la table de multiplication entre 1 et 10");
        int multiplicateur = saisieEntierEntreBornes(1, 10);

        // Choix entre entrainement et examen
        System.out.println("Entrainement ou Examen ? (1 pour Entrainement, 2 pour Examen)");
        int choix = saisieEntierEntreBornes(1, 2);

        System.out.println("Mode sans erreur true ou false ? (1 pour true, 2 pour false)");
        int sansErreur = saisieEntierEntreBornes(1, 2);


        boolean modeSansErreur = sansErreur == 1;

        if (choix == 1 && modeSansErreur) {
            System.out.println("Entrainement sans erreur");
            table = new TableDeMultiplication(multiplicateur, false, true);
        } else if (choix == 1 && !modeSansErreur) {
            System.out.println("Entrainement avec erreur");
            table = new TableDeMultiplication(multiplicateur, false, false);
        } else if (choix == 2 && modeSansErreur) {
            System.out.println("Examen sans erreur");
            table = new TableDeMultiplication(multiplicateur, true, true);
        } else {
            System.out.println("Examen avec erreur");
            table = new TableDeMultiplication(multiplicateur, true, false);
        }

        // Affichage des multiplications
        if (modeSansErreur) {
            for (int i = 0; i < table.getNombreDeMultiplications(); i++) {
                demandeReponseUtilisateur(table.getMultiplication(i));
            }
        } else {
            for (int i = 0; i < table.getNombreDeMultiplications(); i++) {
                System.out.println(table.getMultiplication(i));
                table.getMultiplication(i).setReponseUtilisateur(lecteur.nextInt(), modeSansErreur);
            }
        }
        System.out.println("Nombre de réponses justes : " + table.getNombreReponsesJustes());
    }

    /**
     * Saisie d'un entier entre deux bornes
     * @param min Valeur minimale
     * @param max Valeurs maximale
     * @return un entier entre min et max
     */
    public static int saisieEntierEntreBornes(int min, int max) {
        Scanner lecteur = new Scanner(System.in);
        int entier = lecteur.nextInt();
        while (entier < min || entier > max) {
            System.out.println("Merci de répondre par " + min + " ou " + max);
            entier = lecteur.nextInt();
        }
        return entier;
    }
    /**
     * Demande la réponse à l'utilisateur
     * @param multiplication la multiplication
     */
    private static void demandeReponseUtilisateur(Multiplication multiplication){
        Scanner entree = new Scanner(System.in);
        // Affichage de la multiplication
        System.out.print(multiplication);
        // Demander la réponse utilisateur
        int reponseUtilisateur = entree.nextInt();
        entree.nextLine();
        // Enregistrer la réponse utilisateur
        // Mode sans erreur : attraper l'exception si la réponse de
        // l'utilisateur n'est pas la bonne et redemander la reponse
        // utilisateur
        try {
            multiplication.setReponseUtilisateur(reponseUtilisateur, true);
        } catch (ErreurMultiplicationException e) {
            System.out.println(e.getMessage());
            demandeReponseUtilisateur(multiplication);
        }

    }
}
