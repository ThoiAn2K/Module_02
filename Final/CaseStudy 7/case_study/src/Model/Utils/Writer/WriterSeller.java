package Model.Utils.Writer;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterSeller {
    private static WriterSeller instance;
    public static WriterSeller getInstance() {
        if (instance == null) {
            synchronized (WriterSeller.class) {
                if (instance == null) {
                    instance = new WriterSeller();
                }
            }
        }
        return instance;
    }
    public void writerDataSellers(String[] data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 7\\case_study\\src\\Model\\Data\\DataSeller.CSV";
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
}
}
