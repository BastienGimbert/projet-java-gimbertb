package jeu;

public class TestEtape2 {
    public static void main(String[] args) {
        Elf elf = new Elf();
        ChefElfe chefElfe = new ChefElfe();
        Nain nain = new Nain();
        ChefNain chefNain = new ChefNain();
        Guerrier guerrier = new Guerrier();

        System.out.println("Statistiques de elf : ");
        GuerrieurUtilitaire.afficheGuerrier(elf);
        System.out.println("Statistiques de chefElfe : ");
        GuerrieurUtilitaire.afficheGuerrier(chefElfe);
        System.out.println("Statistiques de nain : ");
        GuerrieurUtilitaire.afficheGuerrier(nain);
        System.out.println("Statistiques de chefNain : ");
        GuerrieurUtilitaire.afficheGuerrier(chefNain);
        System.out.println("Statistiques de guerrier : ");
        GuerrieurUtilitaire.afficheGuerrier(guerrier);
        System.out.println("//////////////////////////////////////////");

        chefNain.attaquer(chefElfe);
        System.out.println("Points de vie de chefElfe après attaque de chefNain : " + chefElfe.getPointsDeVie());

        nain.attaquer(elf);
        System.out.println("Points de vie de elf après attaque de nain : " + elf.getPointsDeVie());

        chefElfe.attaquer(guerrier);
        System.out.println("Points de vie de guerrier après attaque de chefElfe : " + guerrier.getPointsDeVie());

        chefNain.attaquer(chefNain);
        System.out.println("Points de vie de chefElfe après attaque de chefElfe : " + chefElfe.getPointsDeVie());
    }
}
