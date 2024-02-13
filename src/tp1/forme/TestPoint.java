package tp1.forme;
/**
 * La classe TestPoint permet de tester la classe Point
 */
public class TestPoint {
    public static void main(String[] args) {
        Point point1 = new Point();
        Point point2 = new Point(-1,4);


        System.out.println("---------");
        System.out.println("Les points :");
        FormeUtilitaire.affichePoint(point1);
        FormeUtilitaire.affichePoint(point2);

        System.out.println("---------");
        System.out.println("Les points se déplacent");
        point1.deplaceXY(23,-2);
        point2.deplaceXY(-10,-6);

        System.out.println("---------");
        System.out.println("Les points :");
        FormeUtilitaire.affichePoint(point1);
        FormeUtilitaire.affichePoint(point2);



    }
}
