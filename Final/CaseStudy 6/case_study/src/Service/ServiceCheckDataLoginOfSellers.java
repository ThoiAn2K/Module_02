package Service;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ServiceCheckDataLoginOfSellers {
    public boolean isServiceCheckDataLoginOfSellers(String account,String password){
         String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6\\case_study\\src\\Data\\DataSeller.CSV";
        try {
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && account.equals(row[0]) && password.equals(row[0])) {
                    return true;
                }
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
        }
    }

