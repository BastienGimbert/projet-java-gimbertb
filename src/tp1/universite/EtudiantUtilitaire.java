package tp1.universite;

import javax.sound.midi.Soundbank;

/**
 * La classe EtudiantUtilitaire contient des méthodes utilitaires pour la classe Etudiant.
 * Elle permet de mettre la première lettre en majuscule et le reste en minuscule et d'afficher les informations de l'étudiant.
 */
public class EtudiantUtilitaire {
    /**
     * Mettre la première lettre en majuscule et le reste en minuscule d'une chaîne.
     * @param chaine la chaîne à modifier (peut être null ou vide)
     * @return la chaîne modifiée avec la première lettre en majuscule et le reste en minuscule
     */

    public static String capitalize(String chaine) {
        if (chaine == null || chaine.isEmpty()) {
            return chaine;
        }
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
    }

    /**
     * Afficher les informations d'un étudiant ( login + nom complet + mail ). Si l'étudiant a une adresse, elle est affichée. Sinon, "aucune" est affiché.
     * @param etudiant
     */
    public static void AfficherEtudiant(Etudiant etudiant) {
        System.out.println("Login : " + etudiant.getLogin());
        System.out.println("Nom complet : " + etudiant.getNomComplet());
        if (etudiant.getGroupe() == null) {
            System.out.println("Groupe : aucun");
        } else {
            System.out.println("Groupe : " + etudiant.getGroupe().getLibelle());
        }
        System.out.println("Mail : " + etudiant.getMail());
        if (etudiant.existAdresse()) {
            System.out.println("Adresse : " + etudiant.getAdresse());
        } else {
            System.out.println("Adresse : aucune");
        }
        if (etudiant.getNbNotes() > 0) {
            System.out.println("Moyenne : " + etudiant.getMoyenne());
        }
        if (etudiant.getNbNotes() > 0) {
            System.out.println(etudiant.getNbNotes() + " notes : " + etudiant.lesNotes());
        }

    }
}
