package jeu;

public class Guerrier {
    private int force = 10;
    private int pointsDeVie = 100;

    public Guerrier() {}

    public int getForce() {
        return force;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public boolean estVivant() {
        return pointsDeVie > 0;
    }

    public void attaquer(Guerrier guerrier) {
        guerrier.subirDegats(this.getForce());
    }

    protected void subirDegats(int degats) {
        pointsDeVie -= degats;
    }

}
