package Model.Utils.Seller;

import Model.Implement.Writer;
import Model.Implement.WriterSeller;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataSeller implements WriterSeller, Writer {
private static WriterDataSeller instance;

    @Override
    public void writer(String [] data) {
        writerDataSellers(data);
    }

    public static WriterDataSeller getInstance(){
    if(instance == null){
        instance = new WriterDataSeller();

    }
    return instance;
}
    public void writerDataSellers(String[] data) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



