package tp2.universite;

import java.util.ArrayList;
import java.util.Collection;
import java.util.TreeSet;

/**
 * Classe pour représenter un Groupe d'étudiants
 */
public class Groupe {
    private String libelle;
    private Collection<Etudiant> etudiants;
    /**
     * Constructeur
     * @param libelle le libellé du groupe
     */
    public Groupe(String libelle) {
        this.libelle = libelle;
        this.etudiants = new TreeSet<>();
    }
    /**
     * Accesseur pour le libellé
     * @return le libellé
     */
    public String getLibelle() {
        return libelle;
    }
    /**
     * Methode pour définir pour le libellé
     * @param libelle le libellé
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    /**
     * Methode pour ajouter un étudiant
     * @param etudiant l'étudiant à ajouter
     * Si l'étudiant est déjà dans le groupe, il ne sera pas ajouté
     * ATTENTION à ne pas boucler à cause de l'association bidirectionnelle !
     */
    public void addEtudiant(Etudiant etudiant) {
        if (!etudiants.contains(etudiant)) {
            etudiants.add(etudiant);
            if (etudiant.getGroupe() != this) {
                etudiant.setGroupe(this);
            }
        }
    }
    /**
     * Methode pour supprimer un étudiant
     * @param etudiant l'étudiant à supprimer
     */
    public void removeEtudiant(Etudiant etudiant) {
        etudiants.remove(etudiant);
    }
    /**
     * Methode pour vérifier si un étudiant est dans le groupe
     * @param etudiant l'étudiant à vérifier
     * @return vrai si l'étudiant est dans le groupe
     */
    public boolean containsEtudiant(Etudiant etudiant) {
        return etudiants.contains(etudiant);
    }
    /**
     * Methode pour obtenir les étudiants
     * @return les étudiants
     */
    public Collection<Etudiant> getEtudiants() {
        return etudiants;
    }
}
