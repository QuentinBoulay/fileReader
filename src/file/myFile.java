package file;

import interfaces.ActionsFileReader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public abstract class myFile implements ActionsFileReader {
    private String pathFile;
    private BufferedReader br;
    private StringBuffer buffer;
    private FileReader fr;

    public myFile(String pathFile) throws FileNotFoundException {

        this.pathFile = pathFile;
        this.fr = new FileReader(this.pathFile);
        this.br = new BufferedReader(this.fr);
        this.buffer = new StringBuffer();

    }

    public String getPathFile() {
        return this.pathFile;
    }

 public StringBuffer getBuffer() {
        return this.buffer;
    }

    public FileReader getFr() {
        return this.fr;
    }
    public BufferedReader getBr() {
        return this.br;
    }

    public void reloadFile() throws IOException {
        this.getBuffer().setLength(0); // Réinitialise le contenu du buffer
        this.openFile(); // Réouvre le fichier
        this.normalRead(); // Relit le contenu du fichier dans le buffer
    }

    public abstract void normalRead() throws IOException;

    public abstract void displayFile() throws IOException;

    public abstract void reverseRead() throws IOException;
    public abstract void palindromRead() throws IOException;

    public abstract String compareFile(myFile fileText2) throws IOException;


    @Override
    public void openFile() throws IOException {
        if (this.fr != null) {
            this.fr.close();
        }
        this.fr = new FileReader(this.pathFile);
        this.br = new BufferedReader(this.fr);
    }


    @Override
    public void closeFile() throws IOException {
        this.fr.close();

    }

}
