package TDRallye;

import java.util.ArrayList;

public class Course {

    private String lieuDepart;
    private String lieuArrivee;
    private int longueurKm;
    private ArrayList<Voiture> listeVoiture = new ArrayList<Voiture>();

    public Course(String lieuDepart, String lieuArrivee, int longueurKm, ArrayList<Voiture> listeVoiture) {
        this.lieuDepart = lieuDepart;
        this.lieuArrivee = lieuArrivee;
        this.longueurKm = longueurKm;
        this.listeVoiture = listeVoiture;
    }

    public String getLieuDepart() {
        return lieuDepart;
    }

    public String getLieuArrivee() {
        return lieuArrivee;
    }

    public int getLongueurKm() {
        return longueurKm;
    }

    public ArrayList<Voiture> getListeVoiture() {
        return listeVoiture;
    }

    public void setLieuDepart(String lieuDepart) {
        this.lieuDepart = lieuDepart;
    }

    public void setLieuArrivee(String lieuArrivee) {
        this.lieuArrivee = lieuArrivee;
    }

    public void setLongueurKm(int longueurKm) {
        this.longueurKm = longueurKm;
    }

}
