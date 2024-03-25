package tp5.tabledoperation;

public class TableDOperation {
    private OperationEnum typeOperation;
    private static final int NB_OPERATIONS = 5;
    private Operation[] operation = new Operation[NB_OPERATIONS];

    TableDOperation(OperationEnum typeOperation) {
        this.typeOperation = typeOperation;
        initialisation();
    }

    private void initialisation() {
        for (int i = 0; i < NB_OPERATIONS; i++) {
            operation[i] = typeOperation.getOperation(OperationUtilitaire.randomDouble(),OperationUtilitaire.randomDouble());
        }
    }

    public int getNombreReponsesJustes() {
        int nbReponsesJustes = 0;
        for (int i = 0; i < NB_OPERATIONS; i++) {
            if (operation[i].isReponseJuste()) {
                nbReponsesJustes++;
            }
        }
        return nbReponsesJustes;
    }

    public int getNombreDOperations() {
        return NB_OPERATIONS;
    }

    public Operation getOperation(int index) {
        return operation[index];
    }


}
