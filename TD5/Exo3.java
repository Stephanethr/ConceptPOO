package TD5;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.*;
import java.nio.channels.FileChannel;

public class Exo3 {

    public class GenerateTextFile {

        /**
         * Génère un texte de 10 000 lignes et l'enregistre dans un fichier texte.
         *
         * @param filePath Chemin du fichier texte dans lequel enregistrer le texte.
         * @throws IOException En cas d'erreur lors de l'écriture dans le fichier.
         */
        public static void generateAndSaveText(String filePath) throws IOException {
            // Crée le BufferedWriter pour écrire dans le fichier
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
                // Génère et écrit 10 000 lignes de texte
                for (int i = 1; i <= 45000; i++) {
                    String line = i + "ihbaezhdfbzaehib";
                    writer.write(line);
                    writer.newLine(); // Ajoute un saut de ligne après chaque ligne
                }
            }
        }

        public static void main(String[] args) {
            try {
                // Spécifiez le chemin du fichier dans lequel vous souhaitez enregistrer le
                // texte généré
                String filePath = "C:\\Users\\march\\Desktop\\programmationL3\\ConceptPOO\\TD5\\text10000.txt";
                generateAndSaveText(filePath);
                System.out.println("Le texte a été généré et enregistré avec succès dans le fichier.");
            } catch (IOException e) {
                System.err.println("Erreur lors de l'enregistrement du texte dans le fichier : " + e.getMessage());
            }

            try{
                long time = System.currentTimeMillis();
                FileInputStream fis = new FileInputStream(new File("C:\\Users\\march\\Desktop\\programmationL3\\ConceptPOO\\TD5\\text10000.txt"));
                FileChannel fc = fis.getChannel();
                int size = (int)fc.size();
                ByteBuffer bBuff = ByteBuffer.allocate(size);
                fc.read(bBuff);
                System.out.println("Temps d'exécution : " + (System.currentTimeMillis() - time) + "ms");

            } catch (IOException e){
                System.err.println("erreur");
            }


        }

    }

}
