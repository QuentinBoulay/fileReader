import file.CSV;
import file.Txt;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Txt fileText = new Txt("C:/Users/xb637/Documents/GitHub/fileReader/src/fichier.txt");
        Txt fileText2 = new Txt("C:/Users/xb637/Documents/GitHub/fileReader/src/fichier2.txt");
        fileText.openFile();
        System.out.println("Texte écris normalement");
        fileText.normalRead();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Texte écris à l'envers");
        fileText.reverseRead();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Texte écris en palindrome");
        fileText.palindromRead();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        CSV fileCSV = new CSV("C:/Users/xb637/Documents/GitHub/fileReader/src/fichier.csv");
        fileCSV.openFile();
        System.out.println("Fichier CSV écris normalement");
        fileCSV.normalRead();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Fichier CSV écris à l'envers");
        fileCSV.reverseRead();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Fichier CSV écris en palindrome");
        fileCSV.palindromRead();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Comparaison des deux fichiers");
        System.out.println(fileText.compareFile(fileText2));




    }
}