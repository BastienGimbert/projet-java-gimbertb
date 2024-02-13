package tp1.forme;

public class Cercle {
    private int rayon;
    private Point centre = new Point();
    Cercle(int rayon) {
        this.rayon = rayon;
    }
    Cercle(int rayon, Point centre) {
        setRayon(rayon);
        this.centre = centre;
    }
    /**
     * Modifie le rayon du cercle
     * @param NouveauRayon le nouveau rayon
     */
    public void setRayon(int NouveauRayon) {
        this.rayon = NouveauRayon;
    }

    /**
     * Retourne le rayon du cercle
     * @return le rayon du cercle
     */
    public int getRayon() {
        return this.rayon;
    }
    /**
     * Retourne le centre du cercle
     * @return le centre du cercle
     */
    public Point getCentre() {
        return this.centre;
    }

    /**
     * Retourne le périmètre du cercle
     * @return le périmètre du cercle
     */
    public double getPerimetre() {
        return 2 * Math.PI * this.rayon;
    }

    /**
     * Retourne l'aire du cercle
     * @return l'aire du cercle
     */
    public double getAire() {
        return Math.PI * this.rayon* this.rayon;
    }

    /**
     * Déplace le centre du cercle
     * @param dx déplacement en abscisse
     * @param dy déplacement en ordonnée
     */
    public void deplaceCentre(int dx, int dy) {
        this.centre.deplaceXY(dx, dy);
    }


}
