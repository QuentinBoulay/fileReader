package file;

import interfaces.ActionsFileReader;

import java.io.FileInputStream;
import java.util.List;

public abstract class myFile implements ActionsFileReader {
    private String pathFile;
    private char[] buffer;

    public myFile(String pathFile) {
        this.pathFile = pathFile;
        this.buffer = new char[100];
    }

    public String getPathFile() {
        return this.pathFile;
    }

    public String[] getBuffer() {
        String[] bufferString = new String[this.buffer.length];
        return bufferString;
    }

    public abstract void normalRead();
    public abstract void reverseRead();
    public abstract void palindromRead();

    @Override
    public void openFile() {
        try {
            FileInputStream in = new FileInputStream(this.pathFile);

            int i = in.read();

            while (i != -1) {
                int j = 0;
                System.out.println((char) i);
                i = in.read();
                // stocker chaque caractère dans le buffer :
                this.buffer[j] = (char) i;
                j++;

            }

            // afficher mon buffer avec tout le texte de mon fichier, sans les sauts de ligne :
            System.out.println(this.buffer);




            in.close();

        } catch (Exception e){
            e.getStackTrace();
        }
    }
}
