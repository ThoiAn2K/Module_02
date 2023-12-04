package Model.Utils.WriterData;

import Model.Object.Item;


import View.Annoucement.ViewProductUpdateNotification;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataProduct {

    public void writerDataProduct(Item data) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6 - Copy\\case_study\\src\\Model.Data\\DataProduct.CSV";
        String[] value = {data.getShopName(), data.getNameOfProduct(), String.valueOf(data.getPrice()), data.getDescription(),String.valueOf(data.getQuantity())};
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
