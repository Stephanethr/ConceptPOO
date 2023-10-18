package TDRallye;

public class Pilote extends Personne {

    public Pilote(String nom, String prenom, String grpSanguin, Voiture voiture) {
        super(nom, prenom, grpSanguin, voiture);
    }

    public void piloter() {
        System.out.println("Je pilote");
    }
}
