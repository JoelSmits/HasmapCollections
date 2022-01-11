package Collections.controller;

import Collections.model.WordSet;

/**
 * @author Joël Smits, Bianca Burema
 * Dit is wat het programma doet
 */
public class CollectionsLauncher {

    public static void main(String[] args) {
        returnWordSet();
    }

    public static void returnWordSet() {
        WordSet wordset = new WordSet();
        wordset.readFromFile("src/Collections/resources/input.txt");

        System.out.println("Returning number of words and in alphabetical order: \n");
        System.out.printf("The file has %d unique words\n", wordset.getNrOfUniqueWords());
        System.out.println("The words in alphabetical order are: ");
        for (String word : wordset.getWordsSorted()) {
            System.out.printf("%s\n", word);
        }
    }
}
