package Utils;

import com.opencsv.CSVWriter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class InputWriterSaler {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy\\Case_Study\\src\\Data\\DataSaler.csv";
    public static void writeDataSaler(String[] data) {
        try {

            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH, true));

            csvWriter.writeNext(data);
            csvWriter.close();
            System.out.println("Succesfully");
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}