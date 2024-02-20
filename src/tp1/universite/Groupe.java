package tp1.universite;
/**
 * La classe Groupe représente la notion de groupe (libellé).
 */
public class Groupe {
    private String libelle;

    Groupe(String libelle) {
        this.libelle = libelle;
    }
    /**
     * Retourne le libellé du groupe
     * @return le libellé du groupe
     */
    public String getLibelle() {
        return libelle;
    }
}
