package TD3;

public class Racine {
    public static double calculer(double x) throws ValeurNegativeException{
            if (x < 0) throw new ValeurNegativeException();

            return Math.sqrt(x);
        
    }
}
