package tp1.forme;

/**
 * La classe Rectangle représente une forme géométrique rectangulaire.
 */
public class Rectangle {
    private int longueur;
    private int largeur;
    private Point origine;

    /**
     * Constructeur de Rectangle avec longueur et largeur.
     * @param l la largeur du rectangle
     * @param L la longueur du rectangle
     */
    Rectangle(int l,int L){
        setLargeur(l);
        setLongueur(L);
    }

    /**
     * Constructeur de Rectangle avec longueur, largeur et point d'origine.
     * @param l la largeur du rectangle
     * @param L la longueur du rectangle
     * @param ValX la coordonnée x du point d'origine
     * @param ValY la coordonnée y du point d'origine
     */
    Rectangle(int l, int L, int ValX, int ValY){
        setLargeur(l);
        setLongueur(L);
        this.origine = new Point(ValX,ValY);
    }

    /**
     * Définit la largeur du rectangle.
     * @param l la nouvelle largeur
     */
    public void setLargeur(int l){
        largeur = l;
    }

    /**
     * Définit la longueur du rectangle.
     * @param L la nouvelle longueur
     */
    public void setLongueur(int L){
        longueur = L;
    }

    /**
     * Récupère la largeur du rectangle.
     * @return la largeur du rectangle
     */
    public int getLargeur(){
        return largeur;
    }

    /**
     * Récupère la longueur du rectangle.
     * @return la longueur du rectangle
     */
    public int getLongueur(){
        return longueur;
    }

    /**
     * Récupère le point d'origine du rectangle.
     * @return le point d'origine
     */
    public Point getOrigine(){
        return new Point(origine.getX(), origine.getY());
    }

    /**
     * Calcule le périmètre du rectangle.
     * @return le périmètre du rectangle
     */
    public double getPerimetre(){
        return 2*(longueur+largeur);
    }

    /**
     * Calcule l'aire du rectangle.
     * @return l'aire du rectangle
     */
    public double getAir(){
        return longueur*largeur;
    }

    /**
     * Déplace le point d'origine du rectangle.
     * @param x la nouvelle coordonnée x du point d'origine
     * @param y la nouvelle coordonnée y du point d'origine
     */
    public void deplaceOrigine(int x, int y){
        origine.deplaceXY(x, y);
    }

}