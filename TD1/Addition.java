package TD1;

public class Addition {
    public static int addition(int a, int b) {
        return a + b;
    }

    public static int addition(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }

}
