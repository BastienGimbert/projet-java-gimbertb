package tp3.etudiant;

import tp2.contrainte.Note;
import tp2.universite.Etudiant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
/**
 * Classe pour tester le tri des étudiants par moyenne
 */
public class TestEtudiantTriMoyenne {
    /**
     * Méthode principale
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        // Créer les étudiants
        Etudiant etudiant1 = new Etudiant("SANZF", "FLORIANT", "Sanz");
        Etudiant etudiant2 = new Etudiant("portepa", "Pierre-Antoine", "Porte");
        Etudiant etudiant3 = new Etudiant("burlatn", "nils", "burlat", "1 rue pas loin", "10 rue des parents");
        Etudiant etudiant4 = new Etudiant("bmanquatr", "Raphaël", "Brunet-manquat");
        Etudiant etudiant5 = new Etudiant("bmanquatm", "Maxime", "Brunet-manquat");

        // Ajouter des notes aux étudiants
        etudiant1.addNote(new Note(12));
        etudiant1.addNote(new Note(8));
        etudiant2.addNote(new Note(5));
        etudiant2.addNote(new Note(3));
        etudiant3.addNote(new Note(18));
        etudiant3.addNote(new Note(8));
        etudiant4.addNote(new Note(13.5));
        etudiant4.addNote(new Note(14));
        etudiant5.addNote(new Note(14));
        etudiant5.addNote(new Note(2.75));
        // Créer la liste d'étudiants et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsTries = new ArrayList<>();
        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        mesEtudiantsTries.add(etudiant3);
        mesEtudiantsTries.add(etudiant4);
        mesEtudiantsTries.add(etudiant5);
        // Afficher la liste des étudiants avant tri
        affichageEtudiants(mesEtudiantsTries);
        // trier la liste
        Collections.sort(mesEtudiantsTries, ComparateurMoyenne);
        // Afficher la liste des étudiants après tri
        System.out.println("--------------\nLes étudiants après Collections.sort");
        affichageEtudiants(mesEtudiantsTries);
    }

    private static void affichageEtudiants(Collection<Etudiant> etudiants) {
        System.out.println("--------------");
        for(Etudiant etudiant : etudiants) {
            System.out.println("Moyenne = " + etudiant.getMoyenne() + " : " + etudiant.getNom() + ", " + etudiant.getPrenom());
        }
    }

    public static final Comparator<Etudiant> ComparateurMoyenne = new Comparator<Etudiant>() {
        @Override
        public int compare(Etudiant etudiant1, Etudiant etudiant2) {
            return Double.compare(etudiant1.getMoyenne(), etudiant2.getMoyenne());
        }
    };
}
