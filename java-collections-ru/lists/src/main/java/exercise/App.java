package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String symbols, String word) {
        var temp = word.toLowerCase();
        char[] symbolsArray = symbols.toCharArray();
        char[] wordArray = temp.toCharArray();
        List<Character> listSymbols = new ArrayList<>();
        List<Character> listWord = new ArrayList<>();

        for (int i = 0; i < wordArray.length; i++) {
            listWord.add(wordArray[i]);
        }

        for (int i = 0; i < symbolsArray.length; i++) {
            if (listWord.contains(symbolsArray[i])) {
                listSymbols.add(symbolsArray[i]);
            }
        }

        for (int i = 0; i < listWord.size(); i++) {
            if (listSymbols.contains(listWord.get(i))) {
                listSymbols.remove(listWord.get(i));
            } else {
                return false;
            }
        }

        return true;

    }
}
//END
