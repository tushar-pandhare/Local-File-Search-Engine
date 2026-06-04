package src.scanner;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class FileScanner {

    public List<Path> scanFiles(String rootDir) throws IOException {
        List<Path> files = new ArrayList<>();

        Files.walk(Paths.get(rootDir))
                .filter(Files::isRegularFile)
                .forEach(files::add);

        return files;
    }
}