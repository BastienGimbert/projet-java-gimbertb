package tp1.forme;

public class FormeUtilitaire {
    /**
     * Affiche les coordonnées d'un point dans la console sous la forme "Point: x=..., y=..."
     * @param p le point à afficher
     */
    public static void affichePoint(Point p) {
        System.out.println("Point: x=" + p.getX() + ", y=" + p.getY());
    }

    /**
     * Affiche les caractéristiques d'un cercle dans la console sous la forme "Cercle: rayon=..., centre=(..., ...)"
     * @param c le cercle à afficher
     */
    public static void afficheCercle(Cercle c) {
        System.out.println("Cercle: rayon=" + c.getRayon() + ", centre=(" + c.getCentre().getX() + "," + c.getCentre().getY() + ")");
        System.out.println("Cercle: périmètre=" + c.getPerimetre() + ", aire=" + c.getAire());
    }

    /**
     * Affiche les caractéristiques d'un rectangle dans la console sous la forme "Rectangle: longueur=..., largeur=..., origine=(..., ...)"
     * @param r le rectangle à afficher
     */

    public static void afficheRectangle(Rectangle r) {
        System.out.println("Rectangle: longueur=" + r.getLongueur() + ", largeur=" + r.getLargeur() + ", origine=(" + r.getOrigine().getX() + "," + r.getOrigine().getY() + ")");
        System.out.println("Rectangle: périmètre=" + r.getPerimetre() + ", aire=" + r.getAir());
    }
}
