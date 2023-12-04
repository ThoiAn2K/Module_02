package Utils;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataClients {


    public void writerDataClients(String[] data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6\\case_study\\src\\Data\\DataClient.CSV";
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
         e.printStackTrace();
        }
    }
}
