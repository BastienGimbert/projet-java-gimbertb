package tp4.dalton;


import java.util.Comparator;
/**
 * Classe Dalton
 */
public class Dalton implements Comparable<Dalton> {
    private String nom;
    private Taille taille;
    /**
     * Constructeur
     * @param nom le nom du dalton
     * @param taille la taille du dalton
     */
    public Dalton(String nom, Taille taille) {
        this.nom = nom;
        this.taille = taille;
    }
    /**
     * Accesseur
     * @return le nom du dalton
     */
    public String getNom() {
        return nom;
    }
    /**
     * Accesseur
     * @return la taille du dalton
     */
    public Taille getTaille() {
        return taille;
    }
    /**
     * Compare deux daltons par leur taille puis par leur nom
     * @param o le dalton à comparer
     * @return un entier négatif si this est avant o, 0 si this est égal à o, un entier positif si this est après o
     */
    @Override
    public int compareTo(Dalton o) {
        int tailleComparison = this.taille.compareTo(o.getTaille());
        if (tailleComparison != 0) {
            return tailleComparison;
        } else {
            return this.nom.compareTo(o.getNom());
        }
    }
    /**
     * Comparateur de nom pour trier les daltons par leur nom
     */
    public static final Comparator<Dalton> comparateurNomSolution2 = new Comparator<>() {
        @Override
        public int compare(Dalton d1, Dalton d2) {
            return d1.getNom().compareTo(d2.getNom());
        }
    };
    /**
     * Redéfinition de la méthode toString
     * @return une chaîne de caractères représentant le dalton
     */
    @Override
    public String toString() {
        return nom + " (" + taille + ")";
    }
}
