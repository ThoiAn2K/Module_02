package Model.Utils.Writer;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterClient {
    private static WriterClient instance;
    public static WriterClient getInstance() {
        if (instance == null) {
            synchronized (WriterClient.class) {
                if (instance == null) {
                    instance = new WriterClient();
                }
            }
        }
        return instance;
    }
    public void writerDataClients(String[] data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 7\\case_study\\src\\Model\\Data\\DataClient.CSV";
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
