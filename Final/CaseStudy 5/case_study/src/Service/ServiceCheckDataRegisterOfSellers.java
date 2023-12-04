package Service;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ServiceCheckDataRegisterOfSellers {
    public  String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 5\\case_study\\src\\Data\\DataAccountSellers.CSV";

    public  boolean isDataSellers(String account) {
        try {
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && account.equals(row[0])) {
                return false;}
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
