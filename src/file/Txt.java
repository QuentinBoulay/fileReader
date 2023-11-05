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
    }

    @Override
    public void displayFile() throws IOException {
        System.out.println(this.getBuffer());
    }

    @Override
    public void reverseRead() {
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
        StringBuffer newBuffer = new StringBuffer(); // Utilisez un nouveau StringBuffer pour le palindrome
        String[] lines = this.getBuffer().toString().split("\n");

        for (String line : lines) {
            // Inverse chaque ligne individuellement sans changer l'ordre des lignes
            String reversedLine = new StringBuilder(line).reverse().toString();
            newBuffer.append(reversedLine);
            newBuffer.append("\n"); // Ajoute un saut de ligne après chaque ligne inversée
        }

        this.getBuffer().setLength(0); // Réinitialise le contenu du buffer
        this.getBuffer().append(newBuffer); // Ajoute le contenu inversé au buffer
    }




    @Override
    public String compareFile(myFile fileText2) throws IOException {
        this.reloadFile();
        fileText2.normalRead();
        StringBuffer buffer1 = this.getBuffer();
        StringBuffer buffer2 = fileText2.getBuffer();

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