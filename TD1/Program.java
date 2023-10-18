package TD1;

public class Program {
    public static void main(String[] args) {
        System.out.println(Addition.addition(1, 2));
        int[] tabInt = { 1, 2, 5, 6, 3, 4 };
        System.out.println(Addition.addition(tabInt));
        Multiplication.tableMultiplications(5);
        System.out.println(Geometrie.aire(5));
        System.out.println(Geometrie.perimetre(5));
        System.out.println(Moyenne.moyenne(tabInt));

        System.out.println(CharStr.inverseString("bonjour"));
        System.out.println(CharStr.ascii('A'));

        System.out.println(Temperature.celsius(35));
        System.out.println(Temperature.farenheit(86));

        System.out.println(Premier.estPremier(18));

        Premier.listNbPremiers();

        System.out.println("bonjour palindrome ? : " + CharStr.estPalindrome("bonjour"));
        System.out.println("kayak palindrome ? : " + CharStr.estPalindrome("kayak"));

    }

}