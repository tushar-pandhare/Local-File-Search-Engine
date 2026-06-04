package src.parser;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import java.nio.file.Path;

public class PdfFileParser implements FileParser {

    @Override
    public String extractText(Path file)
            throws Exception {

        PDDocument document =
                Loader.loadPDF(file.toFile());

        PDFTextStripper stripper =
                new PDFTextStripper();

        String text =
                stripper.getText(document);

        document.close();

        return text;
    }
}