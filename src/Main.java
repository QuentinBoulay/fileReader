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
        fileText.displayFile();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Texte écris à l'envers");
        fileText.reverseRead();
        fileText.displayFile();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Texte écris en palindrome");
        fileText.reloadFile();
        fileText.palindromRead();
        fileText.displayFile();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        CSV fileCSV = new CSV("C:/Users/xb637/Documents/GitHub/fileReader/src/fichier.csv");
        CSV fileCSV2 = new CSV("C:/Users/xb637/Documents/GitHub/fileReader/src/fichier2.csv");
        fileCSV.openFile();
        System.out.println("Fichier CSV écris normalement");
        fileCSV.normalRead();
        fileCSV.displayFile();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Fichier CSV écris à l'envers");
        fileCSV.reverseRead();
        fileCSV.displayFile();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Fichier CSV écris en palindrome");
        fileCSV.reloadFile();
        fileCSV.palindromRead();
        fileCSV.displayFile();
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Comparaison des deux fichiers txt");
        System.out.println(fileText.compareFile(fileText2));
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("==============================");
        System.out.println("Comparaison des deux fichiers csv");
        System.out.println(fileCSV.compareFile(fileCSV2));




    }
}