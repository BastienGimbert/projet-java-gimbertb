package tp1.forme;

public class Point {

    private int x = 0;
    private int y = 0;
    public Point() {
        this(0, 0);
    }
    public Point(int x, int y) {
        setX(x);
        setY(y);
    }
    /**
     * Déplace le point de dx sur l'axe des abscisses et de dy sur l'axe des ordonnées
     * @param dx le déplacement sur l'axe des abscisses
     * @param dy le déplacement sur l'axe des ordonnées
     */
    public void deplaceXY(int dx, int dy) {
        setX(x + dx);
        setY(y + dy);
    }
    /**
     * Retourne la coordonnée x du point
     * @return la coordonnée x du point
     */
    public int getX() {
        return x;
    }
    /**
     * Retourne la coordonnée y du point
     * @return la coordonnée y du point
     */
    public int getY() {
        return y;
    }

    /**
     * Modifie la coordonnée x du point
     * @param x la nouvelle coordonnée x du point
     */
    public void setX(int x) {
        this.x = Math.max(x, 0);
    }

    /**
     * Modifie la coordonnée y du point
     * @param y la nouvelle coordonnée y du point
     */
    public void setY(int y) {
        this.y = Math.max(y, 0);
    }

}
