package file;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Txt extends myFile {
    public Txt(String pathFile) throws FileNotFoundException {
        super(pathFile);
    }

    @Override
    public void normalRead() throws IOException {
        int i;
        while ((i = this.getFr().read()) != -1) {
            this.getBuffer().append((char) i);
        }
        StringBuffer buffer = getBuffer();
    }

    @Override
    public void reverseRead() {
        StringBuffer buffer = getBuffer();
        String[] lines = buffer.toString().split("\n");
        for (int i = lines.length - 1; i >= 0; i--) {
            System.out.println(lines[i]);
        }
    }

    @Override
    public void palindromRead() throws IOException {
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
    public String compareFile(myFile fileText2) throws IOException {
        int i;
        while ((i = fileText2.getFr().read()) != -1) {
            fileText2.getBuffer().append((char) i);
        }
        StringBuffer buffer2 = fileText2.getBuffer();
        StringBuffer buffer1 = getBuffer();

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