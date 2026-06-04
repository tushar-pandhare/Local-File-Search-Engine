package src.parser;

import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileParser implements FileParser {

    @Override
    public String extractText(Path file)
            throws Exception {

        return Files.readString(file);
    }
}