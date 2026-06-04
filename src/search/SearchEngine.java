package src.search;

import java.util.List;

import src.index.InvertedIndex;

public class SearchEngine {

    private final InvertedIndex index;

    public SearchEngine(InvertedIndex index) {
        this.index = index;
    }

    public void search(String query) {

        List<String> results =
                index.search(query.toLowerCase().trim());

        if (results.isEmpty()) {
            System.out.println("No files found.");
        } else {

            System.out.println("Found in:");

            results.forEach(System.out::println);
        }
    }
}