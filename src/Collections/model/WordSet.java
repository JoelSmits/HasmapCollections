package Collections.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Joël Smits, Bianca Burema
 * Dit is wat het programma doet
 */
public class WordSet {

    Set<String> wordSet = new HashSet<>();

    public void readFromFile(String fileName) {
        try {
            File text = new File(fileName);
            Scanner fileScanner = new Scanner(text);
            while (fileScanner.hasNext()){
                String word = fileScanner.next();

                word = word.replaceAll("[^A-Za-z0-9-]", "");

                wordSet.add(word);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
    }

    public int getNrOfUniqueWords(){
        return wordSet.size();
    }

    public Iterable<String> getWordsSorted(){
        List<String> wordList = new ArrayList<>(wordSet);

        Collections.sort(wordList);

        return wordList;
    }
}


