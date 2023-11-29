package TD5.threads;

public class Process extends Thread {
    public int seconde;

    public Process(int seconde) {
        this.seconde = seconde;
    }

    public void run() {
        try {
            Thread.sleep(this.seconde * 1000);
            System.out.println("Le processus a attendu " + seconde + " secondes");
        } catch (Exception e) {
            System.out.println("Erreur : " + e);
        }
    }
}
