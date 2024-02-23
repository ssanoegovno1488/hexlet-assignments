package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        if (sentence.isEmpty()) {
            return new HashMap<String, Integer>();
        }
        String[] words = sentence.split("\\s");
        Map<String, Integer> result = new HashMap<>();

        for (String word
                : words) {
            int count = 1;
            if (result.containsKey(word)) {
                count = result.get(word);
                count++;
            }
            result.put(word, count);
        }
        return result;
    }

    public static String toString(Map<String, Integer> words) {
        String result = "{\n";
        if (words.isEmpty()) {
            return "{}";
        }
        for (Map.Entry<String, Integer> word: words.entrySet()) {
            result = result + "  " + word.getKey() + ": " + word.getValue() + "\n";
        }
        result = result + "}";
        return result;
    }
}
//END
