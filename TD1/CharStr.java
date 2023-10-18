package TD1;

public class CharStr {
    public static String inverseString(String str) {
        String res = "";
        for (int i = str.length(); i > 0; i--) {
            res += str.charAt(i - 1);
        }
        return res;
    }

    public static int ascii(char lettre) {
        int ascii = (int) lettre;
        return ascii;
    }

    public static boolean estPalindrome(String str) {
        return str.equals(inverseString(str));
    }
}
