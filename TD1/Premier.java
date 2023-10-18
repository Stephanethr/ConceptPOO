package TD1;

public class Premier {
    public static boolean estPremier(int nbr) {
        boolean res = true;
        int reste;

        for (int i = 2; i <= nbr / 2; i++) {
            reste = nbr % i;

            if (reste == 0) {
                res = false;
                break;
            }
        }
        return res;
    }

    public static void listNbPremiers() {
        System.out.println("Liste nombres premiers de 0 à 100 : \n");

        for (int i = 1; i <= 100; i++) {
            if (estPremier(i)) {
                System.out.println(i);
            }
        }
    }
}
