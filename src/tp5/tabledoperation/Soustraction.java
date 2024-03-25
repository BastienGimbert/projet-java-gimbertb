package tp5.tabledoperation;
/**
 * Classe Soustraction qui hérite de la classe Operation
 */
public class Soustraction extends Operation{
    /**
     * Constructeur de la classe Soustraction
     * @param terme1 : premier terme de la soustraction
     * @param terme2 : deuxième terme de la soustraction
     */
    public Soustraction(double terme1, double terme2) {
        super(terme1, terme2);
    }
    /**
     * Méthode qui calcule le résultat de la soustraction
     * @return le résultat de la soustraction des deux termes
     */
    @Override
    public double calculResultat() {
        return getTerme1() - getTerme2();
    }
    /**
     * Méthode qui retourne une chaîne de caractères représentant la soustraction
     * @return une chaîne de caractères représentant la soustraction
     */
    @Override
    public String toString() {
        return getTerme1() + " - " + getTerme2() + " = ";
    }
}
