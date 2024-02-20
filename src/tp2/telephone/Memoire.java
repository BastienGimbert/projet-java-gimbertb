package tp2.telephone;
/**
 * Classe Memoire
 */
public class Memoire {
    private String type;
    private int nombreGiga;
    /**
     * Constructeur de la classe Memoire
     * @param type type de la mémoire
     * @param nombreGiga nombre de giga de la mémoire
     */
    public Memoire(String type, int nombreGiga) {
        setType(type);
        setNombreGiga(nombreGiga);
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
     * Getter de nombreGiga
     * @return nombreGiga
     */
    public int getNombreGiga() {
        return nombreGiga;
    }
    /**
     * Setter de nombreGiga
     * @param nombreGiga nombreGiga
     */
    public void setNombreGiga(int nombreGiga) {
        this.nombreGiga = nombreGiga;
    }
}
