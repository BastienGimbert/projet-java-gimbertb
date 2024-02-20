package tp2.telephone;
/**
 * Classe Ecran
 */
public class Ecran {
    private String type;
    private int taille;
    /**
     * Constructeur de la classe Ecran
     * @param type type de l'écran
     * @param taille taille de l'écran
     */
    public Ecran(String type, int taille) {
        setType(type);
        setTaille(taille);
    }
    /**
     * Getter de type
     * @return type
     */
    public String getType() {
        return type;
    }
    /**
     * Setter de type
     * @param type type
     */
    public void setType(String type) {
        this.type = type;
    }
    /**
     * Getter de taille
     * @return taille
     */
    public int getTaille() {
        return taille;
    }
    /**
     * Setter de taille
     * @param taille taille
     */
    public void setTaille(int taille) {
        this.taille = taille;
    }
}
