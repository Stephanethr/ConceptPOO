package TD3;
import TD3.genericite.Ducks;
import java.net.URI;

public class Main {
    public static void main(String[] args) {
        try {
            URI uri = new URI("https://www.universita.corsica/");
            System.out.println("La création de l'URI s'est bien passée " + uri);
        } catch (Exception e) {
            System.out.println("Problème lors de la création, il semble que " + e + "ne soit pas un URI correct");
        }

        try {
            double res = Racine.calculer(-4);
            System.out.println(res);
        } catch (ValeurNegativeException e) {
            System.out.println(e.getMessage());
        }

        Banque banque = new Banque(1000);

        try{
            banque.retrait(2000);
        } catch (RetraitException r){
            System.out.println(r);
        }


        Ducks<Integer> intDuck = new Ducks<>(12, 1, 5);
        Ducks<String> stringDuck = new Ducks<>("riri", "fifi", "loulou");
        Ducks<?> fuckingDuck = new Ducks<>(12, "fifi", 2.45);

        System.out.println(intDuck.getFifi() + " " + intDuck.getRiri() + " " + intDuck.getLoulou());
        System.out.println(stringDuck.getFifi() + " " + stringDuck.getRiri() + " " + stringDuck.getLoulou());
        System.out.println(fuckingDuck.getFifi() + " " + fuckingDuck.getRiri() + " " + fuckingDuck.getLoulou());

    }
}
