package TDFigures;

public class Carre extends Rectangle {
    public Carre(double cote) {
        super(cote, cote);
    }

    public void setCote(double cote) {
        super.setLongueur(cote);
        super.setLargeur(cote);
    }

    public double getCote() {
        return super.getLongueur();
    }

    public String toString() {
        return "Carre de cote " + this.getCote();
    }
}
