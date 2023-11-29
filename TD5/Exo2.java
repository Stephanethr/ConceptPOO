package TD5;

import java.io.*;

public class Exo2 {

    public static void main(String[] args) {

        // Exercice 1
        try {
            long time = System.currentTimeMillis();
            FileReader fReader = new FileReader("C:\\Users\\march\\Desktop\\programmationL3\\ConceptPOO\\TD5\\text10000.txt");
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            while ((line = bReader.readLine()) != null) {
                System.out.print(line);
            }
            bReader.close();
            System.out.println("Temps d'exécution : " + (System.currentTimeMillis() - time) + "ms");
        } catch (java.io.FileNotFoundException e) {
            System.out.println("File not found");
        } catch (java.io.IOException e) {
            System.out.println("IO error");
        }

    }

}
