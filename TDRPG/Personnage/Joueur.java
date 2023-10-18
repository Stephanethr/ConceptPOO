package TDRPG.Personnage;

public class Joueur extends Personnage {
    private int argent;

    public Joueur() {
        super();
        this.argent = 0;
    }

    public Joueur(String pseudo) {
        super(pseudo);
        this.argent = 0;
    }

    public int getArgent() {
        return this.argent;
    }

    public void setArgent(int argent) {
        this.argent = argent;
    }

    public void gagnerArgent(int argent) {
        this.argent += argent;
    }

    public void perdreArgent(int argent) {
        this.argent -= argent;
    }

    public void gagnerExperience(int experience) {
        this.experience += experience;
        if (this.experience >= 100) {
            this.niveau += 1;
            this.experience -= 100;
        }
    }

}
