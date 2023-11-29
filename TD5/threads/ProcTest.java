package TD5.threads;

public class ProcTest {
    public static void main(String[] args) {
        for (int i = 0 ; i < 100 ; i++) {
            int seconde = (int) (Math.random() * 10);
            Process p = new Process(seconde);
            p.start();
        }
    }
}
