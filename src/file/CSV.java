package file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CSV extends myFile {

    public CSV(String pathFile) throws FileNotFoundException {
        super(pathFile);
    }

    @Override
    public void normalRead() {
        String line = "";
        final String delimiter = ";";
        try {

            while ((line = this.getBr().readLine()) != null) // loops through every line until null found
            {
                String[] token = line.split(delimiter); // separate every token by comma
                for (String s : token) {
                    ;
                    this.getBuffer().append(s+" ");
                }
                this.getBuffer().append("\n");
            }
            System.out.println(this.getBuffer());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void reverseRead() throws IOException {
        StringBuffer buffer = getBuffer();
        String[] lines = buffer.toString().split("\n");
        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }

    @Override
    public void palindromRead() {
        // Divise le contenu en lignes en utilisant le caractère de saut de ligne '\n'
        String[] lines = this.getBuffer().toString().split("\n");

        // Parcours de chaque ligne
        for (int i = 0; i < lines.length; i++) {
            // Convertit la ligne actuelle en un tableau de caractères (lettres)
            char[] lineChars = lines[i].toCharArray();

            // Crée un StringBuilder pour stocker la ligne inversée
            StringBuilder reversedLine = new StringBuilder();

            // Parcours de la ligne dans l'ordre inverse (inversion des lettres)
            for (int j = lineChars.length - 1; j >= 0; j--) {
                reversedLine.append(lineChars[j]);
            }

            // Affiche la ligne inversée
            System.out.println(reversedLine.toString());
        }
    }

    @Override
    public String compareFile(myFile fileCSV2) throws IOException {
        return null;
    }
}
