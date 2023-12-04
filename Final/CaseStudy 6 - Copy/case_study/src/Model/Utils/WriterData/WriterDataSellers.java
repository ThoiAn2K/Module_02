package Model.Utils.WriterData;


import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataSellers {

    public void writerDataSellers(String[] data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6 - Copy\\case_study\\src\\Model.Data\\DataSeller.CSV";

        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}
