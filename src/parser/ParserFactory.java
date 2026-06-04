package src.parser;

import java.nio.file.Path;

public class ParserFactory {

    public static FileParser getParser(Path file) {

        String name =
                file.toString().toLowerCase();

        if (name.endsWith(".txt") ||
            name.endsWith(".java") ||
            name.endsWith(".md") ||
            name.endsWith(".json") ||
            name.endsWith(".xml") ||
            name.endsWith(".csv")) {

            return new TextFileParser();
        }

        if (name.endsWith(".pdf")) {
            return new PdfFileParser();
        }

        return null;
    }
}