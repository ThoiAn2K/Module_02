package Model.Utils;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterProduct implements Product {

    private static WriterProduct instance;

    public static WriterProduct getInstance() {
        if (instance == null) {
            instance = new WriterProduct();
        }
        return instance;
    }

    @Override
    public void download(String[]data) {
        writerProduct(data);
    }

    public void writerProduct(String [] data) {
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH, true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
