package TDRallye;

public class Personne {
    private String nom;
    private String prenom;
    private String grpSanguin;
    private Voiture voiture;

    public Personne(String nom, String prenom, String grpSanguin, Voiture voiture) {
        this.nom = nom;
        this.prenom = prenom;
        this.grpSanguin = grpSanguin;
        this.voiture = voiture;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getGrpSanguin() {
        return grpSanguin;
    }

    public Voiture getVoiture() {
        return voiture;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGrpSanguin(String grpSanguin) {
        this.grpSanguin = grpSanguin;
    }

    public void setVoiture(Voiture voiture) {
        this.voiture = voiture;
    }
}
