package TDFigures;

public class Cercle extends Figure2D {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public String toString() {
        return "Cercle de rayon " + rayon;
    }

    public double aire() {
        return Math.pow(Math.PI * this.rayon, 2);
    }

    public double perimetre() {
        return 2 * Math.PI * this.rayon;
    }
}
