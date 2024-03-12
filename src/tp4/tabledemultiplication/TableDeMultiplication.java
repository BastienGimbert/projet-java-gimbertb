package tp4.tabledemultiplication;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Classe représentant une table de multiplication
 */
public class TableDeMultiplication{
    private  int nombreTable;
    private ArrayList<Multiplication> table;

    /**
     * Constructeur
     * @param nombreTable le nombre de la table pret a etre calculer
     * @param estMelange vrai si la table doit être mélangée
     * @param sansErreur vrai si le mode sans erreur est activé
     */
    public TableDeMultiplication(int nombreTable, boolean estMelange, boolean sansErreur) {
        this.nombreTable = nombreTable;
        this.table = new ArrayList<Multiplication>();
        if (estMelange) {
            initialisation();
            melange();
        } else {
            initialisation();
        }
    }
    /**
     * Initialise la table de multiplication
     */
    private void initialisation (){
        for (int i = 1; i <= 10; i++) {
            table.add(new Multiplication(nombreTable, i));
        }
    }
    /**
     * Mélange la table de multiplication
     */
    public void melange() {
        Collections.shuffle(table);
    }
    /**
     * Retourne le nombre de réponses justes
     * @return le nombre de réponses justes
     */
    public int getNombreReponsesJustes() {
        int nombreReponsesJustes = 0;
        for (Multiplication multiplication : table) {
            if (multiplication.isReponseJuste()) {
                nombreReponsesJustes++;
            }
        }
        return nombreReponsesJustes;
    }
    /**
     * Retourne le nombre de multiplications
     * @return le nombre de multiplications a faire
     */
    public int getNombreDeMultiplications() {
        return table.size();
    }
    /**
     * Retourne une multiplication
     * @param index l'index de la multiplication
     * @return la multiplication
     */
    public Multiplication getMultiplication(int index) {
        return table.get(index);
    }

}
