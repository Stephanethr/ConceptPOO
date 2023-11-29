package TD3.genericite;

public class Ducks<T> {
    private T riri;
    private T fifi;
    private T loulou;

    public Ducks(T riri, T fifi, T loulou){
        this.riri = riri;
        this.fifi = fifi;
        this.loulou = loulou;
    }

    public T getRiri() {
        return riri;
    }

    public T getFifi() {
        return fifi;
    }

    public T getLoulou() {
        return loulou;
    }
    
}