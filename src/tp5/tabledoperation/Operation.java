package tp5.tabledoperation;

public abstract class Operation {
    private double terme1;
    private double terme2;
    private Double reponseUtilisateur;

    public Operation(double terme1, double terme2) {
        this.terme1 = terme1;
        this.terme2 = terme2;
    }

    public void setReponseUtilisateur(Double reponseUtilisateur) {
        this.reponseUtilisateur = reponseUtilisateur;
    }

    public boolean existeReponseUtilisateur() {
        return reponseUtilisateur != null;
    }

    public abstract double calculResultat();

    public double getTerme1() {
        return terme1;
    }

    public double getTerme2() {
        return terme2;
    }

    public boolean isReponseJuste() {
        return Math.abs(calculResultat() - reponseUtilisateur) < 0.01; // 0.01 car on a des doubles , 2 chiffres après la virgule
    }

}