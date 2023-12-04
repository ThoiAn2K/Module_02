package Utils;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataProduct {
    public void readDataProduct() {
        try {
            String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 5\\case_study\\src\\Data\\DataProducts.CSV";
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

