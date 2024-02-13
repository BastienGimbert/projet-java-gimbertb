package tp1.forme;

public class Rectangle {
    private int longueur;
    private int largeur;
    private Point origine;

    Rectangle(int l,int L){
        setLargeur(l);
        setLongueur(L);
    }
    Rectangle(int l, int L, int ValX, int ValY){
        setLargeur(l);
        setLongueur(L);
        this.origine = new Point(ValX,ValY);
    }

    public void setLargeur(int l){
        largeur = l;
    }
    public void setLongueur(int L){
        longueur = L;
    }

    public int getLargeur(){
        return largeur;
    }
    public int getLongueur(){
        return longueur;
    }
    public Point getOrigine(){
        return new Point(origine.getX(), origine.getY());
    }

    public double getPerimetre(){
        return 2*(longueur+largeur);
    }

    public double getAir(){
        return longueur*largeur;
    }

    public void deplaceOrigine(int x, int y){
        origine.deplaceXY(x, y);
    }

}
