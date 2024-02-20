package tp1.universite;
/**
 * La classe TestEtudiant permet de tester la classe Etudiant.
 * Elle crée des étudiants et affiche leurs informations.
 */
public class TestEtudiant {
    /**
     * Méthode principale
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // Création des étudiants
        // IMPORTANT mettre des valeurs qui ne respectent pas les contraintes
        // pour vérifier leur prise en compte

        Etudiant etudiant1 = new Etudiant("DUPONTP", "pierre", "DUPONT");
        Etudiant etudiant2 = new Etudiant("martinf", "francis", "martin");

        // Ajouter une adresse
        etudiant2.setAdresse("2 Place Doyen Gosse");

        // Ajouter des notes
        etudiant1.addNote(12);
        etudiant1.addNote(14);
        etudiant1.addNote(9);

        // Ajouter un groupe
        etudiant1.setGroupe(new Groupe("A"));
        etudiant2.setGroupe(new Groupe("B"));

        // Affichage des informations
        System.out.println("-----------------");
        EtudiantUtilitaire.AfficherEtudiant(etudiant1);
        System.out.println("-----------------");
        EtudiantUtilitaire.AfficherEtudiant(etudiant2);

    }
}
