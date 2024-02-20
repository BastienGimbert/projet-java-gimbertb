package tp1.universite;
/**
 * La classe Etudiant représente la notion d'étudiant (login, nom, prénom
 et adresse).
 * ATTENTION des contraintes sur la notion d’étudiant :
 * – un étudiant doit toujours avoir un login en minuscule
 * – un étudiant doit toujours avoir un nom et un prénom avec
 * le premier caractère en majuscule et les autres en minuscule.
 */
public class Etudiant {
    private String login;
    private String nom;
    private String prenom;
    private String Adresse;
    private double[] notes;
    private Groupe groupe;
    /**
     * Constructeur de la classe Etudiant avec 3 paramètres (login, prenom, nom)
     * @param login le login de l'étudiant
     * @param prenom le prénom de l'étudiant
     * @param nom le nom de l'étudiant
     */
    public Etudiant(String login, String nom, String prenom) {
        setLogin(login);
        setNom(nom);
        setPrenom(prenom);
        this.notes = new double[5];
    }

    /**
     * Récupérer le login de l'étudiant
     * @return le login de l'étudiant
     */

    public String getLogin() {
        return login;
    }

    /**
     * Modifier le login de l'étudiant
     * @param login le nouveau login de l'étudiant (en minuscule)
     */

    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }

    /**
     * Récupérer le nom de l'étudiant
     * @return le nom de l'étudiant
     */

    public String getNom() {
        return nom;
    }

    /**
     * Modifier le nom de l'étudiant
     * @param nom le nouveau nom de l'étudiant (avec la première lettre en majuscule et le reste en minuscule)
     */
    public void setNom(String nom) {
        this.nom = EtudiantUtilitaire.capitalize(nom);;
    }

    /**
     * Récupérer le prénom de l'étudiant
     * @return le prénom de l'étudiant
     */

    public String getPrenom() {
        return prenom;
    }

    /**
     * Modifier le prénom de l'étudiant
     * @param prenom le nouveau prénom de l'étudiant (avec la première lettre en majuscule et le reste en minuscule)
     */

    public void setPrenom(String prenom) {
        this.prenom = EtudiantUtilitaire.capitalize(prenom);
    }

    /**
     * Récupérer l'adresse de l'étudiant
     * @return l'adresse de l'étudiant
     */

    public String getAdresse() {
        return Adresse;
    }

    /**
     * Modifier l'adresse de l'étudiant
     * @param adresse la nouvelle adresse de l'étudiant
     */

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    /**
     * Récupérer le nom complet de l'étudiant
     * @return le nom complet de l'étudiant (nom + prénom)
     */

    public String getNomComplet() {
        return getPrenom() + " " + getNom();
    }

    /**
     * Récupérer le mail de l'étudiant
     * @return le mail de l'étudiant (prenom.nom@etu.univ-grenoble-alpes.fr)
     */

    public String getMail() {
        return getPrenom() + "." + getNom() + "@etu.univ-grenoble-alpes.fr";
    }

    /**
     * Vérifier l'existence d'un adresse pour l'étudiant
     *
     * @return Vrai si l'étudiant à une adresse, Faux sinon
     */
    public boolean existAdresse() {
        return !(Adresse == null || Adresse.isEmpty());
    }

    /**
     * Ajouter une note à l'étudiant
     * @param note la note à ajouter à l'étudiant
     */
    public void addNote(double note) {
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == 0.0) {
                notes[i] = note;
                break;
            }
        }
    }

    /**
     * Récupérer la moyenne de l'étudiant
     * @return la moyenne de l'étudiant (la moyenne des notes non nulles)
     */
    public double getMoyenne() {
        double somme = 0;
        int nbNotes = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != 0.0) {
                somme += notes[i];
                nbNotes++;
            }
        }
        return somme / nbNotes;
    }

    /**
     * Récupérer les notes de l'étudiant
     * @return les notes de l'étudiant (sous forme de chaîne de caractères)
     */
    public String lesNotes() {
        String res = "";
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != 0.0) {
                res += notes[i] + " ";
            }
        }
        return res;
    }

    /**
     * Récupérer le nombre de notes de l'étudiant
     * @return le nombre de notes de l'étudiant
     */
    public int getNbNotes() {
        int nbNotes = 0;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] != 0.0) {
                nbNotes++;
            }
        }
        return nbNotes;
    }
    /**
     * Modifier le groupe de l'étudiant
     * @param groupe le nouveau groupe de l'étudiant
     */
    public void setGroupe(Groupe groupe) {
        this.groupe = groupe;
    }
    /**
     * Récupérer le groupe de l'étudiant
     * @return le groupe de l'étudiant
     */
    public Groupe getGroupe() {
        return groupe;
    }
    /**
     * Vérifier l'existence d'un groupe pour l'étudiant
     *
     * @return Vrai si l'étudiant à un groupe, Faux sinon
     */
    public Boolean existGroupe() {
        if (groupe == null) {
            return false;
        }else {
            return true;
        }
    }


}
