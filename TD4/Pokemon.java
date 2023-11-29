package TD4;

public class Pokemon {
    private String nom;
    private int niveau;

    public Pokemon(String nom, int niveau) {
        this.nom = nom;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }
}
