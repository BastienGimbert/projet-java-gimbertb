package jeu;

public class Elf extends Guerrier{
    public Elf() {
        super();
    }

    public int getForce() {
        return super.getForce() * 2;
    }
}
