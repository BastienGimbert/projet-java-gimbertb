package tp2.universite;

/**
 * Classe utilitaire pour l'université
 */

public class UniversiteUtilitaire {
    /**
     * Méthode pour capitaliser une chaine de caractère
     * @param chaine la chaine à capitaliser
     * @return la chaine capitalisée
     */
    public static String capitalize(String chaine) {
        if (chaine == null || chaine.isEmpty()) {
            return chaine;
        }
        return chaine.substring(0, 1).toUpperCase() + chaine.substring(1).toLowerCase();
    }
    /**
     * Méthode pour afficher une personne
     * @param personne la personne à afficher
     * affiche le login, le nom complet, le mail et l'adresse de la personne
     */
    public static void affichePersonne(Personne personne) {
        System.out.println("--------------------");
        System.out.println("Login : " + personne.getLogin());
        System.out.println("Nom Complet : " + personne.getNomComplet());
        System.out.println("Mail : " + personne.getMail());
        System.out.println("Adresse : " + personne.getAdresse() + "\n");
    }

    /**
     * Méthode pour afficher un personnel
     * @param personnel le personnel à afficher
     * affiche le login, le nom complet, le mail, l'adresse, l'échelon, le point d'indice et le salaire du personnel
     */

    public static void affichePersonnel(Personnel personnel) {
        System.out.println("--------------------");
        System.out.println("Login : " + personnel.getLogin());
        System.out.println("Nom Complet : " + personnel.getNomComplet());
        System.out.println("Mail : " + personnel.getMail());
        System.out.println("Adresse : " + personnel.getAdresse());
        System.out.println("Echelon : " + personnel.getEchelon());
        System.out.println("Point d'indice : " + personnel.getPointDIndice());
        System.out.println("Salaire : " + personnel.getSalaire() + "\n");
    }

}
