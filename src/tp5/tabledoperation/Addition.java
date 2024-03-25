package tp5.tabledoperation;

/**
 * Classe Addition qui hérite de la classe Operation

 */
public class Addition extends Operation {
    /**
    Constructeur de la classe Addition
    @param terme1 : premier terme de l'addition
    @param terme2 : deuxième terme de l'addition
     */
    public Addition(double terme1, double terme2) {
        super(terme1, terme2);
    }

    /**
     * Méthode qui calcule le résultat de l'addition
     * @return le résultat de l'addition des deux termes
     */
    @Override
    public double calculResultat() {
        return getTerme1() + getTerme2();
    }
    /**
     * Méthode qui retourne une chaîne de caractères représentant l'addition
     * @return une chaîne de caractères représentant l'addition
     */
    public String toString() {
        return getTerme1() + " + " + getTerme2() + " = ";
    }
}
