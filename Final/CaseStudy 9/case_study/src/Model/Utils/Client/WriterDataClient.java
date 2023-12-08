package Model.Utils.Client;

import Model.Implement.Writer;
import Model.Implement.WriterClient;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataClient implements Writer, WriterClient {
    private static WriterDataClient instance;

    @Override
    public void writer(String [] data) {
        writerDataClients(data);
    }

    public static WriterDataClient getInstance(){
        if(instance == null){
            instance = new WriterDataClient();

        }
        return instance;
    }
    public void writerDataClients(String[] data) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
