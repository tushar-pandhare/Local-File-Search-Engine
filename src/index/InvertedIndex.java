package src.index;

import java.util.*;

public class InvertedIndex {

    private final Map<String, List<String>> index = new HashMap<>();

    public void addWord(String word, String fileName) {

        index.putIfAbsent(word, new ArrayList<>());

        if (!index.get(word).contains(fileName)) {
            index.get(word).add(fileName);
        }
    }

    public List<String> search(String word) {
        return index.getOrDefault(word, new ArrayList<>());
    }

    public void printIndex() {
        index.forEach((key, value) ->
                System.out.println(key + " -> " + value));
    }
}