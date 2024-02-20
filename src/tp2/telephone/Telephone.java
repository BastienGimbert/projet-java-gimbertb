package tp2.telephone;

import java.util.ArrayList;
/**
 * Classe Telephone
 */
public class Telephone {
    private String libelle;
    private Ecran ecran;
    private Processeur processeur;
    private ArrayList<Memoire> ram;
    private Memoire stockage;
    /**
     * Constructeur de la classe Telephone
     * @param libelle libelle du téléphone
     * @param ecran ecran du téléphone
     * @param processeur processeur du téléphone
     * @param ram ram du téléphone
     * @param stockage stockage du téléphone
     */
    public Telephone(String libelle, Ecran ecran, Processeur processeur, ArrayList<Memoire> ram, Memoire stockage) {
        setLibelle(libelle);
        setEcran(ecran);
        setProcesseur(processeur);
        setRam(ram);
        setStockage(stockage);
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
     * Getter de ecran
     * @return ecran
     */
    public Ecran getEcran() {
        return ecran;
    }
    /**
     * Setter de ecran
     * @param ecran ecran
     */
    public void setEcran(Ecran ecran) {
        this.ecran = ecran;
    }
    /**
     * Getter de processeur
     * @return processeur
     */
    public Processeur getProcesseur() {
        return processeur;
    }
    /**
     * Setter de processeur
     * @param processeur processeur
     */
    public void setProcesseur(Processeur processeur) {
        this.processeur = processeur;
    }
    /**
     * Getter de ram
     * @return ram
     */
    public ArrayList<Memoire> getRam() {
        return ram;
    }
    /**
     * Setter de ram
     * @param ram ram
     */
    public void setRam(ArrayList<Memoire> ram) {
        this.ram = ram;
    }
    /**
     * Ajoute une mémoire vive
     * @param ram mémoire vive
     */
    public void addRam(Memoire ram) {
        this.ram.add(ram);
    }
    /**
     * Getter de stockage
     * @return stockage
     */
    public Memoire getStockage() {
        return stockage;
    }
    /**
     * Setter de stockage
     * @param stockage stockage
     */
    public void setStockage(Memoire stockage) {
        this.stockage = stockage;
    }
    /**
     * Retourne le nombre total de giga de ram
     * @return nombre total de giga de ram
     */
    public int getNombreGigaRam() {
        int total = 0;
        for (Memoire m : ram) {
            total += m.getNombreGiga();
        }
        return total;
    }
    /**
     * Retourne une représentation textuelle du téléphone
     * @return représentation textuelle du téléphone
     */
    public String toString() {
        return "Libellé: " + libelle + "\n" +
                "Processeur: " + processeur.getLibelle() + " (" + processeur.getFrequence() + " GHz)\n" +
                "Mémoire vive: " + getNombreGigaRam() + " Go\n" +
                "Stockage: " + stockage.getType() + " (" + stockage.getNombreGiga() + " Go)\n" +
                "Ecran: " + ecran.getType() + " (" + ecran.getTaille() + " pouces)\n";
    }
}
