package Utils;


import View.ViewResultsAnnouncement;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataSellers {

    public void writerDataSellers(String[] data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 5\\case_study\\src\\Data\\DataAccountSellers.CSV";

        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
