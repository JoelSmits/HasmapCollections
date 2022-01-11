package Collections.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Bianca Burema <b.burema@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class WordMap {
    Map<String, Integer> wordMap = new HashMap<>();

    public void readFromFile(String fileName) {

        try {
            Scanner scanner = new Scanner(new File(fileName));
            while (scanner.hasNext()){
                String word = scanner.next();

                word = word.replaceAll("[^A-Za-z0-9-]", "");

                int newCount = wordMap.getOrDefault(word, 0) + 1;
                wordMap.put(word, newCount);
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
    }

    public int getNumberOfUniqueWords() {
       return wordMap.size();
    }

    public Iterable<String> getWordsSorted() {
        Set<String> keySet = wordMap.keySet();
        ArrayList<String> listOfKeys = new ArrayList<>(keySet);
        Collections.sort(listOfKeys);
        return listOfKeys;
    }

    public int getWordCount(String word) {
         return wordMap.getOrDefault(word, 0);
    }
}
