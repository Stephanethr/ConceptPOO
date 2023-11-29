package TD4;

/**
 * La classe Personne représente une personne avec les attributs nom, prénom et âge.
 * Elle implémente l'interface Comparable pour permettre le tri en fonction de l'âge
 * puis de l'ordre alphabétique du nom et prénom.
 */
public class Personne implements Comparable<Personne> {

    private String nom;
    private String prenom;
    private int age;

    /**
     * Constructeur de la classe Personne.
     *
     * @param nom    Le nom de la personne.
     * @param prenom Le prénom de la personne.
     * @param age    L'âge de la personne.
     */
    public Personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    /**
     * Accesseur pour l'attribut nom.
     *
     * @return Le nom de la personne.
     */
    public String getNom() {
        return nom;

    }

    /**
     * Accesseur pour l'attribut prenom.
     *
     * @return Le prénom de la personne.
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * Accesseur pour l'attribut age.
     *
     * @return L'âge de la personne.
     */

    public int getAge() {
        return age;
    }
    

    /**
     * Méthode compareTo nécessaire pour implémenter l'interface Comparable.
     * Compare d'abord par l'âge, puis par l'ordre alphabétique du nom et prénom.
     *
     * @param autrePersonne La personne à comparer.
     * @return Un entier négatif, zéro ou positif selon que cette personne est
     *         inférieure, égale ou supérieure à l'autre personne.
     */
    @Override
    public int compareTo(Personne autrePersonne) {
        // Comparaison par âge
        int comparaisonAge = Integer.compare(this.age, autrePersonne.age);

        if (comparaisonAge == 0) {
            // Si l'âge est le même, compare par l'ordre alphabétique du nom et prénom
            int comparaisonNomPrenom = this.nom.concat(this.prenom)
                    .compareTo(autrePersonne.nom.concat(autrePersonne.prenom));

            return comparaisonNomPrenom;
        }

        return comparaisonAge;
    }
}
