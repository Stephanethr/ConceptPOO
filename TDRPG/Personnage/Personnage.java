package TDRPG.personnage;

import java.util.ArrayList;

import TDRPG.arme.Arme;
import TDRPG.arme.ArmeMagique;
import TDRPG.arme.ArmePhysique;


public class Personnage {
    protected String nom;
    protected int vie;
    protected int force;
    protected int magie;
    protected int defensePhysique;
    protected int defenseMagique;
    protected int vitesse;
    protected int chance;
    protected int precision;
    protected int esquive;
    protected int niveau;
    protected int experience;
    protected int positionX;
    protected int positionY;
    protected String classe;
    protected Boolean estHostile;
    protected Arme arme;
    protected boolean estVivant;

    public Personnage(String nom, int vie, int force, int magie, int defensePhysique, int defenseMagique, int vitesse,
            int chance,
            int precision,
            int esquive) {
        this.nom = nom;
        this.vie = vie;
        this.force = force;
        this.magie = magie;
        this.defensePhysique = defensePhysique;
        this.defenseMagique = defenseMagique;
        this.vitesse = vitesse;
        this.chance = chance;
        this.precision = precision;
        this.esquive = esquive;
        this.niveau = 1;
        this.experience = 0;
        this.positionX = 0;
        this.positionY = 0;
        this.classe = "Neutre";
        this.estHostile = false;
        setArme();
        this.estVivant = true;
    }

    public Personnage() {
        this.nom = "Personnage";
        this.vie = 100;
        this.force = 10;
        this.magie = 10;
        this.defensePhysique = 10;
        this.defenseMagique = 10;
        this.vitesse = 10;
        this.chance = 10;
        this.precision = 10;
        this.esquive = 10;
        this.niveau = 1;
        this.experience = 0;
        this.positionX = 0;
        this.positionY = 0;
        this.classe = "Neutre";
        this.estHostile = false;
        setArme();
        this.estVivant = true;

    }

    public Personnage(String nom) {
        this.nom = nom;
        this.vie = 100;
        this.force = 10;
        this.magie = 10;
        this.defensePhysique = 10;
        this.defenseMagique = 10;
        this.vitesse = 10;
        this.chance = 10;
        this.precision = 10;
        this.esquive = 10;
        this.niveau = 1;
        this.experience = 0;
        this.positionX = 0;
        this.positionY = 0;
        this.classe = "Neutre";
        this.estHostile = false;
        setArme();
        this.estVivant = true;

    }

    public Personnage(String nom, boolean estHostile) {
        this.nom = nom;
        this.vie = 100;
        this.force = 10;
        this.magie = 10;
        this.defensePhysique = 10;
        this.defenseMagique = 10;
        this.vitesse = 10;
        this.chance = 10;
        this.precision = 10;
        this.esquive = 10;
        this.niveau = 1;
        this.experience = 0;
        this.positionX = 0;
        this.positionY = 0;
        this.classe = "Neutre";
        this.estHostile = estHostile;
        setArme();
        this.estVivant = true;

    }

    public ArrayList<Integer> getStats() {
        ArrayList<Integer> stats = new ArrayList<Integer>();
        stats.add(this.vie);
        stats.add(this.force);
        stats.add(this.magie);
        stats.add(this.defensePhysique);
        stats.add(this.defenseMagique);
        stats.add(this.vitesse);
        stats.add(this.chance);
        stats.add(this.precision);
        stats.add(this.esquive);
        stats.add(this.niveau);
        stats.add(this.experience);
        return stats;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;

    }

    public int getPv() {
        return this.vie;
    }

    public void setPv(int vie) {
        this.vie = vie;
    }

    public String getClasse() {
        return this.classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
        this.setStat();
        this.setArme();
    }

    public int getNiveau() {
        return this.niveau;
    }

    public int getExperience() {
        return this.experience;
    }

    public ArrayList<Integer> getPosition() {
        ArrayList<Integer> position = new ArrayList<Integer>();
        position.add(this.positionX);
        position.add(this.positionY);
        return position;

    }

    public void setStat() {
        switch (this.classe) {
            case "Guerrier":
                this.vie = 150;
                this.force = 15;
                this.magie = 5;
                this.defensePhysique = 15;
                this.defenseMagique = 5;
                this.vitesse = 5;
                this.chance = 10;
                this.precision = 10;
                this.esquive = 5;
                break;
            case "Mage":
                this.vie = 100;
                this.force = 5;
                this.magie = 15;
                this.defensePhysique = 5;
                this.defenseMagique = 15;
                this.vitesse = 10;
                this.chance = 10;
                this.precision = 10;
                this.esquive = 10;
                break;
            case "Voleur":
                this.vie = 100;
                this.force = 7;
                this.magie = 5;
                this.defensePhysique = 5;
                this.defenseMagique = 5;
                this.vitesse = 15;
                this.chance = 15;
                this.precision = 15;
                this.esquive = 15;
                break;
        }
    }

    public void setArme() {
        switch (this.classe) {
            case "Guerrier":
                this.arme = new ArmePhysique("Epee en bois", 10);
                break;
            case "Mage":
                this.arme = new ArmeMagique("Baton en bois", 10);
                break;
            case "Voleur":
                this.arme = new ArmePhysique("Arc en bois", 10);
                break;
            default:
                this.arme = new ArmePhysique("Poings", 0);
                break;
        }
    }

    public void attaque(Personnage cible) {
        if (this.arme.getTypeDegats() == "physique") {

            cible.setPv(cible.vie - ((this.arme.getDegats() + this.force) - cible.defensePhysique));
        }

        else if (this.arme.getTypeDegats() == "magique") {
            cible.setPv(cible.vie - ((this.arme.getDegats() + this.magie) - cible.defenseMagique));

        }
    }

    public void combat() {
        if (this.vie <= 0) {
            this.estVivant = false;
        }
    }

    public String toString() {
        return "Personnage [type=" + this.getClass() + ", nom=" + this.nom + ", vie=" + vie + ", force=" + force
                + ", magie=" + magie
                + ", defensePhysique="
                + defensePhysique + ", defenseMagique=" + defenseMagique + ", vitesse=" + vitesse + ", chance=" + chance
                + ", precision=" + precision + ", esquive=" + esquive + ", niveau=" + niveau + ", experience="
                + experience + ", positionX=" + positionX + ", positionY=" + positionY + ", classe=" + classe
                + ", estHostile=" + estHostile + ", arme=" + arme.getNom() + "]";
    }

    public boolean getEstVivant() {
        return this.estVivant;
    }

}
