package Model.Utils.ReadData;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataProduct {
    public void readDataProduct() {
        try {
            String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6 -Copy\\case_study\\src\\Model.Data\\DataProduct.CSV";
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                for (String value : row) {
                    System.out.printf("%-18s", value);
                }
                System.out.println();
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

