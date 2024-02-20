package tp2.contrainte;
/**
 * Classe pour les notes
 */
public class TestContrainte {
    /**
     * Méthode principale
     * @param args les arguments de la ligne de commande
     */
    public static void main(String[] args) {

        // Tester la méthode saisir avec un intervalle [0, 20]
        ReelContraint note1 = ContrainteUtilitaire.saisir(0, 20);
        System.out.println("Valeur de note1 : " +note1);

        // Tester la méthode saisir avec un intervalle [-10, 10]
        ReelContraint note2 = ContrainteUtilitaire.saisir(-10, 10);
        System.out.println("Valeur de note2 : " + note2);

        // Tester la méthode setValeur
        note1.setValeur(15);
        System.out.println("Définir note1 a 15, valeur :" + note1);

        note1.setValeur(25);
        System.out.println("Définir note1 a 25, valeur :" + note1); // Ici, la valeur ne change pas car elle est hors de l'intervalle

        /////////////////////////////////////////////
        // Tester la méthode setValeur de la classe Note
        /////////////////////////////////////////////
        Note note3 = new Note();
        Note note4 = new Note(4);
        Note note5 = ContrainteUtilitaire.saisir();
        System.out.println("Valeur de note3 : " + note3);
        System.out.println("Valeur de note4 : " + note4);
        System.out.println("Valeur de note5 : " + note5);
        note3.setValeur(15);
        System.out.println("Définir note3 a 15, valeur :" + note3);
        note4.setValeur(5);
        System.out.println("Définir note4 a 5, valeur :" + note4);
    }
}