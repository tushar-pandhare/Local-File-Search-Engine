package src.parser;

import java.util.Arrays;
import java.util.List;

public class Tokenizer {

    public List<String> tokenize(String text) {

        text = text.toLowerCase()
                .replaceAll("[^a-zA-Z0-9 ]", " ");

        return Arrays.stream(text.split("\\s+"))
                .filter(word -> !word.isBlank())
                .toList();
    }
}