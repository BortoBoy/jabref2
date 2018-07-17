package org.jabref.logic.importer.fileformat;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import org.jabref.logic.importer.Importer;
import org.jabref.logic.importer.ParserResult;
import org.jabref.logic.util.FileType;
import org.jabref.model.entry.BibEntry;
import org.jabref.model.entry.FieldName;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CSVImporter extends Importer {

    private static final Logger LOGGER = LoggerFactory.getLogger(CSVImporter.class);
    private static final String DELIMITADOR = ",";

    @Override
    public String getName() {
        return "CSV";
    }

    @Override
    public FileType getFileType() {
        return FileType.CSV;
    }

    @Override
    public String getDescription() {
        return "Importando o formato CSV.";
    }

    @Override
    public String getId() {
        return "csv";
    }

    @Override
    public boolean isRecognizedFormat(BufferedReader reader) throws IOException {
        String linha = "";
        int linhas = 0;
        boolean isvalid = true;
        while (((linha = reader.readLine()) != null) && (linhas < 10)) {
            String[] fields = linha.split(",");
            if (fields.length == 0) {
                isvalid = false;
            }
            linhas++;
        }
        return isvalid;
    }

    @Override
    public ParserResult importDatabase(Path filePath, Charset encoding) throws IOException {
        try (BufferedReader bufferedReader = getReader(filePath, StandardCharsets.UTF_8)) {
            ParserResult parserResult = importDatabase(bufferedReader);
            parserResult.getMetaData().setEncoding(encoding);
            parserResult.setFile(filePath.toFile());
            return parserResult;
        }
    }

    @Override
    public ParserResult importDatabase(BufferedReader reader) throws IOException {
        List<BibEntry> csvResults = new ArrayList<>();
        String linha = "";

        try {
            while ((linha = reader.readLine()) != null) {

                String[] dado = linha.split(DELIMITADOR);
                BibEntry e = new BibEntry();

                /* Assume order of fields are:
                 * Book = [author, title, publisher, year, editor]
                 * Article = [author, title, journal, year]
                 *
                 * Also assume author names are delimited by ';', which will be replaced by ' and '.
                */
                if (dado[0].equals("Book")) {
                    e.setType("book");
                    e.setField(FieldName.AUTHOR, dado[1].replaceAll(";", " and "));
                    e.setField(FieldName.TITLE, dado[2]);
                    e.setField(FieldName.PUBLISHER, dado[3]);
                    e.setField(FieldName.YEAR, dado[4]);
                    e.setField(FieldName.EDITOR, dado[5]);
                    csvResults.add(e);
                } else if (dado[0].equals("Article")) {
                    e.setType("article");
                    e.setField(FieldName.AUTHOR, dado[1].replaceAll(";", " and "));
                    e.setField(FieldName.TITLE, dado[2]);
                    e.setField(FieldName.JOURNAL, dado[3]);
                    e.setField(FieldName.YEAR, dado[4]);
                    csvResults.add(e);
                }
            }
        } catch (Exception e) {
            LOGGER.error("Houve um erro ao importar arquivo CSV");
            return ParserResult.fromError(e);
        }

        return new ParserResult(csvResults);
    }

}