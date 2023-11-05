# Projet FileReader

## Introduction
Le projet FileReader est une application Java conçue pour lire, afficher et manipuler des fichiers texte et CSV. Elle offre des fonctionnalités pour lire les fichiers de manière normale, inversée et en mode palindrome. De plus, elle peut comparer deux fichiers pour vérifier si leur contenu est identique.

## Fonctionnalités
- Lire des fichiers texte et CSV normalement.
- Afficher le contenu des fichiers dans l'ordre inverse.
- Lire les fichiers en mode palindrome (ligne par ligne).
- Comparer deux fichiers pour vérifier l'identité du contenu.

## Installation
Pour installer le projet FileReader sur votre machine locale, suivez ces étapes :

1. Assurez-vous que Java est installé sur votre machine. Sinon, téléchargez et installez le [Kit de développement Java (JDK)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
2. Clonez le dépôt sur votre machine locale ou téléchargez le code source.
3. Naviguez jusqu'au répertoire où vous avez le code source.
4. Compilez les fichiers Java en utilisant la commande `javac`. Par exemple :
   ```sh
   javac Main.java


## Exécution
Exécutez la classe Main compilée en utilisant la commande java :
```sh
java Main
```
## Utilisation
L'application peut être utilisée pour lire des fichiers .txt et .csv dans différents modes. Voici comment utiliser les différentes fonctionnalités :

## Lire des fichiers normalement
Pour lire un fichier texte ou CSV normalement, utilisez la méthode `normalRead()` de la classe Txt/CSV. Par exemple :
```java
Txt txt = new Txt("file.txt");
txt.openFile();
txt.normalRead();
txt.displayFile();
txt.closeFile();
```

## Lire des fichiers à l'envers
Pour lire un fichier texte ou CSV à l'envers, utilisez la méthode `reverseRead()` de la classe Txt/CSV. Par exemple :
```java
Txt txt = new Txt("file.txt");
txt.openFile();
txt.reverseRead();
txt.displayFile();
txt.closeFile();
```

## Lire des fichiers en palindrome
Pour lire un fichier texte ou CSV en palindrome, utilisez la méthode `palindromeRead()` de la classe Txt/CSV. Par exemple :
```java
Txt txt = new Txt("file.txt");
txt.openFile();
txt.palindromeRead();
txt.displayFile();
txt.closeFile();
```

## Comparer deux fichiers
Pour comparer deux fichiers texte ou CSV, utilisez la méthode `compareFiles()` de la classe Txt/CSV. Par exemple :
```java
Txt txt1 = new Txt("file1.txt");
Txt txt2 = new Txt("file2.txt");
txt1.openFile();
txt2.openFile();
txt1.compareFiles(txt2);
txt1.closeFile();
txt2.closeFile();
```

