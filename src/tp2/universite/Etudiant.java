package tp2.universite;

import tp2.contrainte.Note;

import java.util.ArrayList;

/**
 * Classe pour représenter un Etudiant
 */
public class Etudiant extends Personne {
    private String adresseParent;
    private ArrayList<Note> notes;

    /**
     * Constructeur de la classe Etudiant avec 3 paramètres (login, prenom, nom) de la classe Personne
     * @param login
     * @param prenom
     * @param nom
     */
    public Etudiant(String login, String prenom, String nom) {
        // Appel du constructeur de la classe parent
        super(login, prenom, nom);
        this.notes = new ArrayList<Note>();

    }
    /**
     * Constructeur de la classe Etudiant avec 4 paramètres (login, prenom, nom, adresse) de la classe Personne
     * @param login
     * @param prenom
     * @param nom
     * @param adresse
     * @param adresseParent
     */
    public Etudiant(String login, String prenom, String nom, String adresse, String adresseParent) {
        // Appel du constructeur de la classe parent
        super(login, prenom, nom, adresse);
        setAdresseParent(adresseParent);
        this.notes = new ArrayList<Note>();
    }
    /**
     * Méthode pour récupérer le mail
     * @return le mail de l'étudiant ( @etu.univ-grenoble-alpes.fr)
     */
    @Override
    public String getMail() {
        return getNom() + "." + getPrenom() + "@etu.univ-grenoble-alpes.fr";
    }
    /**
     * Méthode pour récupérer l'adresse
     * @return l'adresse de l'étudiant (adresse personnelle et adresse des parents) ou "Adresse inconnue" si l'adresse n'est pas renseignée
     */
    @Override
    public String getAdresse() {
        if (super.getAdresse() != null && this.adresseParent != null) {
            return super.getAdresse() + " (Adresse des parents " + this.adresseParent + ")";
        } else if (super.getAdresse() != null) {
            return super.getAdresse();
        } else if (this.adresseParent != null) {
            return this.adresseParent;
        } else {
            return "Adresse inconnue";
        }
    }
    /**
     * Méthode pour vérifier si l'adresse de l'étudiant est renseignée
     * @return true si l'adresse de l'étudiant est renseignée, false sinon
     */
    @Override
    public boolean existAdresse() {
        return super.existAdresse() || (this.adresseParent != null && !this.adresseParent.isEmpty());
    }

    /**
     * Méthode pour set l'adresse de l'étudiant et l'adresse des parents
     * @param adresse
     * @param adresseParent
     */
    public void setAdresse(String adresse, String adresseParent) {
        super.setAdresse(adresse);
        this.adresseParent = adresseParent;
    }
    /**
     * Méthode pour récupérer l'adresse des parents
     * @return l'adresse des parents
     */
    public void setAdresseParent(String adresseParent) {
        this.adresseParent = adresseParent;
    }

    /**
     * Méthode pour ajouter une note à l'étudiant
     */
    public void addNote (Note note) {
        this.notes.add(note);
    }

    /**
     * Méthode pour récupérer les notes de l'étudiant
     * @return les notes de l'étudiant
     */
    public ArrayList<Note> getNotes() {
        return this.notes;
    }
    /**
     * Méthode pour récupérer la moyenne de l'étudiant
     * @return la moyenne de l'étudiant
     */
    public double getMoyenne() {
        double somme = 0;
        for (Note note : this.notes) {
            somme += note.getValeur();
        }
        return somme / this.notes.size();
    }

}