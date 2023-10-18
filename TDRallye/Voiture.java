package TDRallye;

public class Voiture {
    private String marque;
    private int puissance;
    private String categorie;
    private Personne[] equipage;

    public Voiture(String marque, int puissance, Personne[] equipage) {
        this.marque = marque;
        this.puissance = puissance;
        this.equipage = equipage;
        setCategorie();
    }

    public String getMarque() {
        return marque;
    }

    public int getPuissance() {
        return puissance;
    }

    public Personne[] getEquipage() {
        return equipage;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setPuissance(int puissance) {
        this.puissance = puissance;
    }

    public void setEquipage(Personne[] equipage) {
        this.equipage = equipage;
    }

    public void setCategorie() {
        if (puissance < 100) {
            this.categorie = "A";
        } else if (puissance < 200) {
            this.categorie = "B";
        } else {
            this.categorie = "C";
        }
    }

}
