package tp5.tabledoperation;
/**
 * Enumération OperationEnum
 */
public enum OperationEnum {
    ADDITION, SOUSTRACTION, MULTIPLICATION;
    /**
     * Méthode qui retourne une opération en fonction de l'opération
     * @param terme1 : premier terme de l'opération
     * @param terme2 : deuxième terme de l'opération
     * @return une opération
     */
    public Operation  getOperation(double terme1, double terme2, boolean modeSansErreur) {
        switch (this) {
            case ADDITION:
                return new Addition(terme1, terme2, modeSansErreur);
            case SOUSTRACTION:
                return new Soustraction(terme1, terme2, modeSansErreur);
            case MULTIPLICATION:
                return new Multiplication(terme1, terme2, modeSansErreur);
            default:
                return null;
        }
    }
}
