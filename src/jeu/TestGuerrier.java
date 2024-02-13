package jeu;

public class TestGuerrier {
    public static void main(String[] args) {
        Guerrier guerrier1 = new Guerrier();
        Guerrier guerrier2 = new Guerrier();
        System.out.println("Statistiques de guerrier1 : ");
        GuerrieurUtilitaire.afficheGuerrier(guerrier1);
        System.out.println("Statistiques de guerrier2 : ");
        GuerrieurUtilitaire.afficheGuerrier(guerrier2);
        guerrier1.attaquer(guerrier2);
        System.out.println("Points de vie de guerrier2 après attaque de guerrier1 : " + guerrier2.getPointsDeVie());
        guerrier2.subirDegats(100);
        System.out.println("Points de vie de guerrier2 après subirDegats(5) : " + guerrier2.getPointsDeVie());
        System.out.println("Est-ce que guerrier2 est vivant ? " + guerrier2.estVivant());
    }
}
