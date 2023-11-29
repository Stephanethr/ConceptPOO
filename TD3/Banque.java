package TD3;

public class Banque {
    private int solde;


    public Banque(int solde){
        this.solde = solde;
    }

    public void retrait(int somme) throws RetraitException{
            if (somme > this.solde){
                RetraitException e = new RetraitException();
                throw e;
            }
            this.solde -= somme;
        
    }
}
