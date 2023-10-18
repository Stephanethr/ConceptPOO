package TDRPG;

import TDRPG.Personnage.*;
import TDRPG.Arme.*;

public class Game {
    public static void main(String[] args) {
        Joueur joueur = new Joueur("Velkia");
        joueur.setClasse("Guerrier");

        Joueur joueur2 = new Joueur("Kuro");
        joueur2.setClasse("Mage");

        Joueur joueur3 = new Joueur("kira");
        joueur3.setClasse("Voleur");

        Ennemi ennemi = new Ennemi("Gobelin");

        Pnj pnj = new Pnj("Marchand");

        System.out.println(joueur + "\n");
        System.out.println(joueur2 + "\n");
        System.out.println(joueur3 + "\n");
        System.out.println(ennemi + "\n");
        System.out.println(pnj + "\n");

        joueur.attaque(pnj);

        System.out.println(pnj.getPv() + "\n");

    }
}
