package Model.Utils.WriterData;

import Model.Object.ListSeller;
import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.io.IOException;

public class WriterDataListSeller {

    public static void writerDataListSeller(ListSeller dataList) {
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6 - Copy\\case_study\\src\\Model.Data\\DataListSeller.CSV";
String [] data = {String.valueOf(dataList)};
        try {
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH,true));
            csvWriter.writeNext(data);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
