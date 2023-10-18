package TDFigures;

public class Rectangle extends Figure2D {
    private double longueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        if (longueur < 0) {
            throw new IllegalArgumentException("longueur < 0");
        }
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        if (largeur < 0) {
            throw new IllegalArgumentException("largeur < 0");
        }
        this.largeur = largeur;
    }

    public String toString() {
        return "Rectangle de longueur " + longueur + " et de largeur " + largeur;
    }

    public double aire() {
        return this.longueur * this.largeur;
    }

    public double perimetre() {
        return 2 * (this.longueur + this.largeur);
    }
}
