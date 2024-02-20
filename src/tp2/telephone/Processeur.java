package tp2.telephone;
/**
 * Classe Processeur
 */
public class Processeur {
    private String libelle;
    private double frequence;
    /**
     * Constructeur de la classe Processeur
     * @param libelle libelle du processeur
     * @param frequence frequence du processeur
     */
    public Processeur(String libelle, double frequence) {
        setLibelle(libelle);
        setFrequence(frequence);
    }
    /**
     * Getter de libelle
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }
    /**
     * Setter de libelle
     * @param libelle libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }
    /**
     * Getter de frequence
     * @return frequence
     */
    public double getFrequence() {
        return frequence;
    }
    /**
     * Setter de frequence
     * @param frequence frequence
     */
    public void setFrequence(double frequence) {
        this.frequence = frequence;
    }
}
