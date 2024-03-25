package tp5.tabledoperation;

import tp5.TestLogging;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;


/**
 * TestTableDOperation est une classe de test pour la classe TableDOperation
 */
public class TestTableDOperation {
    private static Logger LOGGER = Logger.getLogger(TestLogging.class.getPackageName());
    private static final LogManager logManager = LogManager.getLogManager();

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

    static{
        try {
            logManager.readConfiguration( new FileInputStream("conf/debug-logging.properties") );
        } catch ( IOException exception ) {
            LOGGER.log( Level.SEVERE, "Cannot read configuration file", exception );
        }
    }
}