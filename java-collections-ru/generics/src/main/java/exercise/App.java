package exercise;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// BEGIN
class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map dictionary) {
        List<Map<String, String>> foundedBooks = new LinkedList<>();
        for (Map book
                : books) {
            boolean isFound = true;
            for (Object key
                    : dictionary.keySet()) {
                if (!book.containsValue(dictionary.get(key))) {
                    isFound = false;
                    break;
                }
            }
            if (isFound) {
                foundedBooks.add(book);
            }
        }
        return foundedBooks;
    }
}
//END
