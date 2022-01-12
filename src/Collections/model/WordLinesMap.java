package Collections.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Bianca Burema <b.burema@st.hanze.nl>
 * <p>
 * Dit is wat het programma doet.
 */
public class WordLinesMap {
    Map<String, List<Integer>> wordLinesMap = new HashMap<>();

    public WordLinesMap() {
        wordLinesMap = new HashMap<>();
    }

    public void readFromFile(String fileName) {
        try {
            Scanner scanner = new Scanner(new File(fileName));
            int lineNr = 0;
            while (scanner.hasNextLine()){
                lineNr++;
                String line = scanner.nextLine();
                String[] words = line.split("\\s+");
                for (String word : words) {
                    word.replaceAll("[^A-Za-z0-9-]", "").toLowerCase();
                    if (word.length() > 0) {
                        wordLinesMap.putIfAbsent(word, new ArrayList<>());
                        wordLinesMap.get(word).add(lineNr);
                    }
                }
            }
        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(fileNotFoundException);
        }
    }

    public int getNrOfUniqueWords(){
        return wordLinesMap.size();
    }

    public Iterable<String> getWordsSorted(){
        List<String> words = new ArrayList<>(wordLinesMap.keySet());
        Collections.sort(words);
        return words;
    }

    public List<Integer> getWordLineNrs(String word){
        return wordLinesMap.get(word);
    }

}
