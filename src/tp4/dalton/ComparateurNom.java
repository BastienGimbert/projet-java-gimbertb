package tp4.dalton;

import java.util.Comparator;
/**
 * Classe ComparateurNom
 */
public class ComparateurNom implements Comparator<Dalton> {
    /**
     * Compare deux daltons par leur nom
     * @param o1 le premier dalton
     * @param o2 le deuxième dalton
     * @return un entier négatif si o1 est avant o2, 0 si o1 est égal à o2, un entier positif si o1 est après o2
     */
    @Override
    public int compare(Dalton o1, Dalton o2) {
        return o1.getNom().compareTo(o2.getNom());
    }
}