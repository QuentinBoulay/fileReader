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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayFile() throws IOException {
        System.out.println(this.getBuffer());
    }

    @Override
    public void reverseRead() throws IOException {
        StringBuffer buffer = new StringBuffer(this.getBuffer().toString());
        this.getBuffer().setLength(0); // Réinitialise le contenu du buffer
        String[] lines = buffer.toString().split("\n");
        for (int i = lines.length - 1; i >= 0; i--) {
            this.getBuffer().append(lines[i]);
            if (i > 0) {
                this.getBuffer().append("\n");
            }
        }
    }

    @Override
    public void palindromRead() {
        StringBuffer buffer = new StringBuffer(this.getBuffer().toString());
        this.getBuffer().setLength(0); // Réinitialise le contenu du buffer

        // Divise le contenu en lignes en utilisant le caractère de saut de ligne '\n'
        String[] lines = buffer.toString().split("\n");

        // Parcours de chaque ligne
        for (int i = 0; i < lines.length; i++) {
            // Convertit la ligne actuelle en un tableau de caractères (lettres)
            char[] lineChars = lines[i].toCharArray();

            // Parcours de la ligne dans l'ordre inverse (inversion des lettres mais pas des lignes)
            for (int j = lineChars.length - 1; j >= 0; j--) {
                this.getBuffer().append(lineChars[j]);
            }
            if (i < lines.length - 1) {
                this.getBuffer().append("\n");
            }
        }
    }


    @Override
    public String compareFile(myFile fileCSV2) throws IOException {
        this.reloadFile();

        fileCSV2.normalRead();
        StringBuffer buffer1 = this.getBuffer();
        StringBuffer buffer2 = fileCSV2.getBuffer();

        String[] lines1 = buffer1.toString().split("\n");
        String[] lines2 = buffer2.toString().split("\n");


        String result = "";
        for (int j = 0; j < lines1.length; j++) {
            if (lines1[j].equals(lines2[j])) {
                result += "Ligne " + (j + 1) + " : OK\n";
            } else {
                result += "Ligne " + (j + 1) + " : KO\n";
            }
        }
        return result;
    }
}
