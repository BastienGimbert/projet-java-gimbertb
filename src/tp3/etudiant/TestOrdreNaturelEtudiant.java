package tp3.etudiant;

import tp2.universite.Etudiant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;
/**
 * Classe pour tester l'ordre naturel des étudiants
 */
public class TestOrdreNaturelEtudiant {
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
        // Créer la liste d'étudiants quelconque et ajouter les étudiants
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = new ArrayList<>();
        mesEtudiantsOrdreQcq.add(etudiant1);
        mesEtudiantsOrdreQcq.add(etudiant2);
        mesEtudiantsOrdreQcq.add(etudiant3);
        mesEtudiantsOrdreQcq.add(etudiant4);
        mesEtudiantsOrdreQcq.add(etudiant5);
        // Afficher la liste d'étudiants quelconque
        System.out.println("--------------\nLes étudiants : mesEtudiantsOrdreQcq");
        affichageEtudiants(mesEtudiantsOrdreQcq);
        // Créer l'ensemble d'étudiants trié et ajouter les étudiants
        TreeSet<Etudiant> mesEtudiantsTries = new TreeSet<>();
        mesEtudiantsTries.add(etudiant1);
        mesEtudiantsTries.add(etudiant2);
        mesEtudiantsTries.add(etudiant3);
        mesEtudiantsTries.add(etudiant4);
        mesEtudiantsTries.add(etudiant5);
        // Afficher l'ensemble d'étudiants trié
        System.out.println("--------------\nLes étudiants triés : mesEtudiantsTries");
        affichageEtudiants(mesEtudiantsTries);
    }

    private static void affichageEtudiants(Collection<Etudiant> etudiants) {
        for(Etudiant etudiant : etudiants) {
            System.out.println(etudiant.getNom() + ", " + etudiant.getPrenom());
        }
    }
}
