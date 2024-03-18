package tp4.dalton;
/**
 * Enumération Taille
 */
public enum Taille {
    PETIT("petit"),
    MOYEN("moyen"),
    GRAND("grand");
    private String libelle;
    /**
     * Constructeur
     * @param libelle le libellé de la taille
     */
    private Taille(String libelle) {
        this.libelle = libelle;
    }
    /**
     * Redéfinition de la méthode toString
     * @return une chaîne de caractères représentant la taille
     */
    @Override
    public String toString() {
        return libelle;
    }
}