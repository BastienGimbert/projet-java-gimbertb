package tp2.contrainte;
/**
 * Classe pour les notes
 */
public class Note extends ReelContraint {
    /**
     * Constructeur par défaut
     */
    public Note() {
        super(0, 20);
        setValeur(getMin());
    }
    /**
     * Constructeur avec la valeur
     * @param valeur la valeur
     */
    public Note(double valeur) {
        super(0, 20);
        if (valeur < getMin()) {
            setValeur(getMin());
        } else if (valeur > getMax()) {
            setValeur(getMax());
        } else {
            setValeur(valeur);
        }
    }
}