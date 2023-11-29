package TD4;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        // Exo 1
        Pokemon p1 = new Pokemon("Pikachu", 5);
        Pokemon p2 = new Pokemon("Bulbizarre", 5);
        Pokemon p3 = new Pokemon("Salamèche", 5);
        Pokemon p4 = new Pokemon("Carapuce", 5);

        ArrayList<Pokemon> pokemons = new ArrayList<Pokemon>();
        pokemons.add(p1);
        pokemons.add(0, p2);
        pokemons.remove(1);
        for (int i = 0; i < pokemons.size(); i++) {
            System.out.println(pokemons.get(i).getNom() + " : " + pokemons.get(i).getNiveau());
        }

        // Exo 2
        ArrayList<Integer> entiers = new ArrayList<Integer>(100);
        for (int i = 0; i < 100; i++) {
            entiers.add((int) (Math.random() * 1000));
            System.out.println(entiers.get(i));

        }
        System.out.println("Entiers : " + entiers.size());

        // Exo 3
        Queue<Integer> entiersSorted = new PriorityQueue<Integer>(100);
        for (int i = 0; i < 100; i++) {
            entiersSorted.add((int) (Math.random() * 1000));

        }
        System.out.println("Entiers sorted : " + entiersSorted.size());

        for (int i = 0; i < 100; i++) {
            System.out.println("priority queue : " + entiersSorted.poll());
        }

        // Exo 4
        Set<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < 100; i++) {
            treeSet.add((int) (Math.random() * 10));
        }
        System.out.println("TreeSet : " + treeSet.size());
        System.out.println(treeSet.toString());

        // la taille de treeSet est inférieure à 100 car un Set ne peut pas contenir de
        // doublons
        // et donc les doublons sont supprimés lors de l'ajout dans le Set
        // elle est aussi triée par ordre croissant

        // Exo 5

        Map<Integer, String> etudiants = new HashMap<>();

        etudiants.put(20191218, "BUTEAU LUCIA");
        etudiants.put(20190628, "CASTELLI SERENA");
        etudiants.put(20190556, "JOND JEAN");
        etudiants.put(20192688, "LEFEVRE JULIEN");
        etudiants.put(20190628, "MARIACCIA MARIE-DOMINIQUE");
        etudiants.put(20190707, "MORETTI PIERRE-FRANCOIS");

        System.out.println(etudiants.toString());

        // Il ne peut pas y avoir deux clés identiques dans une Map, donc la clé
        // 20190628 est écrasée

        // Exo 6

        String phrase = "C'est une époque de guerre civile. A bord de vaisseaux spatiaux opérant à partir d'une base cachée, les Rebelles ont emporté leur première victoire sur le maléfique Empire Galactique.";

        // Tri dans l'ordre alphabétique
        List<String> alphabeticOrder = new ArrayList<>();
        alphabeticOrder.add(phrase);
        Collections.sort(alphabeticOrder);
        System.out.println("Tri dans l'ordre alphabétique :");
        for (String word : alphabeticOrder) {
            System.out.println(word);
        }

        // Tri dans l'ordre militaire
        List<String> militaryOrder = new ArrayList<>();
        militaryOrder.add(phrase);
        Collections.sort(militaryOrder, new MilitaryComparator());
        System.out.println("\nTri dans l'ordre militaire :");
        for (String word : militaryOrder) {
            System.out.println(word);
        }

        // Tri dans l'ordre alphabétique inversé
        List<String> reverseAlphabeticOrder = new ArrayList<>();
        reverseAlphabeticOrder.add(phrase);
        Collections.sort(reverseAlphabeticOrder, Collections.reverseOrder());
        System.out.println("\nTri dans l'ordre alphabétique inversé :");
        for (String word : reverseAlphabeticOrder) {
            System.out.println(word);
        }

        // Exo 7

        // Création d'une liste de personnes
        List<Personne> personnes = new ArrayList<>();
        personnes.add(new Personne("Doe", "John", 30));
        personnes.add(new Personne("Smith", "Alice", 28));
        personnes.add(new Personne("Doe", "Jane", 28));

        // Tri de la liste de personnes
        Collections.sort(personnes);

        // Affichage des personnes triées
        for (Personne personne : personnes) {
            System.out.println(personne.getNom() + " " + personne.getPrenom() + ", Age: " + personne.getAge());
        }
    }
}
