package Collections.controller;

import Collections.model.WordLinesMap;
import Collections.model.WordMap;
import Collections.model.WordSet;

/**
 * @author Joël Smits, Bianca Burema
 * Dit is wat het programma doet
 */
public class CollectionsLauncher {

    public static void main(String[] args) {
        WordMap wordMap = new WordMap();
        WordLinesMap wordLinesMap = new WordLinesMap();
//        returnWordSet();

        wordMap.readFromFile("src/Collections/resources/input.txt");
        System.out.println(wordMap.getNumberOfUniqueWords());

        for (String word : wordMap.getWordsSorted()) {
            System.out.printf("%-18s%d\n", word, wordMap.getWordCount(word));
        }

        wordLinesMap.readFromFile("src/Collections/resources/input.txt");
        System.out.println(wordLinesMap.getNrOfUniqueWords());
        for (String word : wordLinesMap.getWordsSorted()) {
            System.out.printf("%-18s%s\n", word, wordLinesMap.getWordLineNrs(word));
        }
    }

//    public static void returnWordSet() {
//        WordSet wordset = new WordSet();
//        wordset.readFromFile("src/Collections/resources/input.txt");
//
//        System.out.println("Returning number of words and in alphabetical order: \n");
//        System.out.printf("The file has %d unique words\n", wordset.getNrOfUniqueWords());
//        System.out.println("The words in alphabetical order are: ");
//        for (String word : wordset.getWordsSorted()) {
//            System.out.printf("%s\n", word);
//        }
//    }
}
