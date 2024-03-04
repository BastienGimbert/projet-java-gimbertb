package tp2.telephone;
import java.util.ArrayList;
/**
 * Classe Telephone
 */
public class TestTelephone {
    /**
     * Méthode main
     * @param args arguments
     */
    public static void main(String[] args) {
        // Liste de processeurs disponibles : Octa-Core 2.84Ghz et Octa-Core 3Ghz
        Processeur processeur1 = new Processeur("Octa-Core", 2.84);
        Processeur processeur2 = new Processeur("Octa-Core", 3);

        // Liste de ram disponibles : LPDDR5 4G et LPDDR5 8G
        Memoire ram4G = new Memoire("LPDDR5", 4);
        Memoire ram8G = new Memoire("LPDDR5", 8);

        ArrayList<Memoire> ramList4G = new ArrayList<>();
        ramList4G.add(ram4G);
        ArrayList<Memoire> ramList8G = new ArrayList<>();
        ramList8G.add(ram4G);
        ramList8G.add(ram4G);
        ArrayList<Memoire> ramList16G = new ArrayList<>();
        ramList16G.add(ram8G);
        ramList16G.add(ram8G);


        // Liste de stockage disponibles : 3 mémoires UFS Storage 3.1 de grandeur 64/128/256
        Memoire stockage64G = new Memoire("UFS Storage 3.1", 64);
        Memoire stockage128G = new Memoire("UFS Storage 3.1", 128);
        Memoire stockage256G = new Memoire("UFS Storage 3.1", 256);

        // Liste d'écran disponibles : 3 amoled de tailles 5/6/7
        Ecran ecran5 = new Ecran("amoled", 5);
        Ecran ecran6 = new Ecran("amoled", 6);
        Ecran ecran7 = new Ecran("amoled", 7);

        // Construction des téléphones

        Telephone telephoneBasDeGamme = new Telephone("Bas de gamme", ecran5, processeur1, ramList4G, stockage64G);
        Telephone telephoneBasDeGammePlus = new Telephone("Bas de gamme+", ecran5, processeur1, ramList8G, stockage128G);
        Telephone telephoneMilieuDeGamme = new Telephone("Milieu de gamme", ecran6, processeur1, ramList8G, stockage128G);
        Telephone telephoneHautDeGamme = new Telephone("Haut de gamme", ecran7, processeur2, ramList16G, stockage256G);

        System.out.println(telephoneBasDeGamme);
        System.out.println(telephoneBasDeGammePlus);
        System.out.println(telephoneMilieuDeGamme);
        System.out.println(telephoneHautDeGamme);
    }
}
