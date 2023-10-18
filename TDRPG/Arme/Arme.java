package TDRPG.Arme;

public class Arme {
    protected String nom;
    protected int degats;
    protected String typeDegats;

    public Arme(String nom, int degats, String typeDegats) {
        this.nom = nom;
        this.degats = degats;
        this.typeDegats = typeDegats;
    }

    public Arme(int degats) {
        this.nom = "Poings";
        this.degats = degats;
        this.typeDegats = "physique";
    }

    public int getDegats() {
        return this.degats;
    }

    public String getNom() {
        return this.nom;
    }

    public String getTypeDegats() {
        return this.typeDegats;
    }

}
