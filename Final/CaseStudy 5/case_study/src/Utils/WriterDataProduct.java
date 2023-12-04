package Utils;

import Model.Product;
import View.ViewProductUpdateNotification;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataProduct {

    public void writerDataProduct(Product data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 5\\case_study\\src\\Data\\DataProducts.CSV";
        String[] value = {String.valueOf(data.getId()), data.getName(),  String.valueOf(data.getPrice()), data.getDescription()};
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH, true));
            csvWriter.writeNext(value);
            csvWriter.close();
            ViewProductUpdateNotification.successful();
        } catch (IOException e) {
            ViewProductUpdateNotification.error();
        }
    }

}
