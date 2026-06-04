package src;
import src.scanner.FileScanner;
import src.parser.Tokenizer;
import src.index.InvertedIndex;
import src.index.IndexBuilder;
import src.search.SearchEngine;

import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
            throws Exception {

        FileScanner scanner = new FileScanner();

        List<Path> files =
                scanner.scanFiles("src/data/documents");

        InvertedIndex index =
                new InvertedIndex();

        IndexBuilder builder =
                new IndexBuilder();

        builder.buildIndex(files, index);

        SearchEngine searchEngine =
                new SearchEngine(index);

        try (Scanner input = new Scanner(System.in)) {
                while (true) {

                    System.out.print("Search: ");

                    String query = input.nextLine();

                    if (query.equalsIgnoreCase("exit")) {
                        break;
                    }

                    searchEngine.search(query);
                }
        }
    }
}