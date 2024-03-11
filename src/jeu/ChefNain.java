package jeu;

public class ChefNain extends Nain{
    public ChefNain() {
        super();
    }

    protected void subirDegats(int degats) {
        super.subirDegats(degats / 2);
    }

}
