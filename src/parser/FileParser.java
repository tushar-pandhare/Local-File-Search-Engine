package src.parser;

import java.nio.file.Path;

public interface FileParser {

    String extractText(Path file) throws Exception;
}