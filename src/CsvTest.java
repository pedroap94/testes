import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class CsvTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("teste.csv"));

        CSVParser csvParser = new CSVParser(bufferedReader, CSVFormat.DEFAULT);
        Iterable<CSVRecord> registrosCsv = csvParser.getRecords();

        System.out.println( StreamSupport.stream(registrosCsv.spliterator(), false)
                .map(registro -> registro.get(2)).collect(Collectors.toList()));



    }
}
