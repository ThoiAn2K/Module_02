package Utils;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterDataAccountSellers {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy 4\\Finally\\src\\Data\\DataAccountSellers.csv";
    public static void writerDataSellers(String[] data){
        try {
            CSVWriter csvWriterSellers = new CSVWriter(new FileWriter(PATH));
            csvWriterSellers.writeNext(data);
            csvWriterSellers.close();
            System.out.println("Successfully");
            } catch (IOException e){
            System.out.println("Error");
        }
    }
}
