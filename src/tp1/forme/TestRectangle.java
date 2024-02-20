package tp1.forme;
/**
 * La classe TestRectangle permet de tester la classe Rectangle.
 */
public class TestRectangle {
    /**
     * Méthode principale
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 4, 2, 3);
        FormeUtilitaire.afficheRectangle(rectangle);

        System.out.println("On déplace l'origine de dx=10 et dy=4");
        rectangle.deplaceOrigine(10,4);
        // afficher le rectangle
        FormeUtilitaire.afficheRectangle(rectangle);
        // Récupérer l'origine
        Point origine = rectangle.getOrigine();
        // déplacer le point origine
        System.out.println("On déplace le point donné par la méthode getOrigine() de dx=-5 et dy=-6");
        origine.deplaceXY(-5,-6);
        // afficher le point et le rectangle
        FormeUtilitaire.affichePoint(origine);
        FormeUtilitaire.afficheRectangle(rectangle);

    }
}
