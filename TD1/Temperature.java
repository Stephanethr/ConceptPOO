package TD1;

public class Temperature {
    public static double farenheit(int degre) {
        return (degre - 32) * 5 / 9;
    }

    public static double celsius(int degre) {
        return (degre * 9 / 5) + 32;
    }

}
