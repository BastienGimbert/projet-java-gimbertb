package tp5.tabledoperation;

/**
 * Classe Multiplication qui hérite de la classe Operation

 */
public class Multiplication extends Operation {
    /**
     * Constructeur de la classe Multiplication
     * @param terme1 : premier terme de la multiplication
     * @param terme2 : deuxième terme de la multiplication
     */
    public Multiplication(double terme1, double terme2) {
        super(terme1, terme2);
    }
    /**
     * Méthode qui calcule le résultat de la multiplication
     * @return le résultat de la multiplication des deux termes
     */
    @Override
    public double calculResultat() {
        return getTerme1() * getTerme2();
    }
    /**
     * Méthode qui retourne une chaîne de caractères représentant la multiplication
     * @return une chaîne de caractères représentant la multiplication
     */
    @Override
    public String toString() {
        return getTerme1() + " * " + getTerme2()+ " = ";
    }
}
