package src.index;

import src.parser.*;

import java.nio.file.Path;
import java.util.List;

public class IndexBuilder {

    private final Tokenizer tokenizer =
            new Tokenizer();

    public void buildIndex(List<Path> files,
                           InvertedIndex index)
            throws Exception {

        for (Path file : files) {

            FileParser parser =
                    ParserFactory.getParser(file);

            if (parser == null) {
                continue;
            }

            String content =
                    parser.extractText(file);

            List<String> words =
                    tokenizer.tokenize(content);

            for (String word : words) {

                index.addWord(
                        word,
                        file.getFileName().toString()
                );
            }
        }
    }
}