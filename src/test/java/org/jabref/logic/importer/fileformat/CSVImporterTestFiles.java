package org.jabref.logic.importer.fileformat;

import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class CSVImporterTestFiles {

    private static final String EXTENSAO = ".csv";

    private static Stream<String> fileNames() throws IOException {
        Predicate<String> fileName = name -> name.startsWith("CSVImporterTest")
                && name.endsWith(EXTENSAO);
        return ImporterTestEngine.getTestFiles(fileName).stream();
    }

    private static Stream<String> nonCsvfileNames() throws IOException {
        Predicate<String> fileName = name -> !name.startsWith("CSVImporterTest");
        return ImporterTestEngine.getTestFiles(fileName).stream();
    }

    @ParameterizedTest
    @MethodSource("nonCsvfileNames")
    public void testIsNotRecognizedFormat(String fileName) throws IOException {
        ImporterTestEngine.testIsNotRecognizedFormat(new CSVImporter(), fileName);
    }

    @ParameterizedTest
    @MethodSource("fileNames")
    public void testIsRecognizedFormat(String fileName) throws IOException {
        ImporterTestEngine.testIsRecognizedFormat(new CSVImporter(), fileName);
    }
    
    @ParameterizedTest
    @MethodSource("fileNames")
    public void testImportEntries(String fileName) throws Exception {
        ImporterTestEngine.testImportEntries(new CSVImporter(), fileName, EXTENSAO);
    }

}