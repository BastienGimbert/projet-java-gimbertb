package tp5.tabledoperation;

import java.util.Scanner;

public class TestTableDOperation {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int saisie = OperationUtilitaire.saisieEntreMinEtMax(1, 3);
        OperationEnum TypeOperation;

        switch (saisie) {
            case 1:
                TypeOperation = OperationEnum.ADDITION;
                break;
            case 2:
                TypeOperation = OperationEnum.SOUSTRACTION;
                break;
            case 3:
                TypeOperation = OperationEnum.MULTIPLICATION;
                break;
            default:
                TypeOperation = OperationEnum.ADDITION;
        }
        TableDOperation tableDOperation = new TableDOperation(TypeOperation);

        for (int i = 0; i < tableDOperation.getNombreDOperations(); i++) {
            Operation operation = tableDOperation.getOperation(i);
            System.out.println(operation);
            Double reponseUtilisateur = lecteur.nextDouble();
            operation.setReponseUtilisateur(reponseUtilisateur);
        }

        System.out.println("Nombre de réponses justes : " + tableDOperation.getNombreReponsesJustes());
    }
}