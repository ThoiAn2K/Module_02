package Utils;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataAccountClients {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy 4\\Finally\\src\\Data\\DataAccountClients.csv";

    public static void writerDataClients(String[] data) {
        try {
            CSVWriter csvWriterClients = new CSVWriter(new FileWriter(PATH));
            csvWriterClients.writeNext(data);
            csvWriterClients.close();
            System.out.println("Successfully");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
