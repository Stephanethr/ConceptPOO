package TD3;

public class ValeurNegativeException extends Exception{
    private String message;
    public ValeurNegativeException(){
        this.message = "La valeur est négative";
    }

    public String toString(){
        return this.message;
    } 
}
