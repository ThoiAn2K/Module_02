package Model.Utils.Reader;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadSeller {
    private static ReadSeller instance;
    public static ReadSeller getInstance() {
        if (instance == null) {
            synchronized (ReadSeller.class) {
                if (instance == null) {
                    instance = new ReadSeller();
                }
            }
        }
        return instance;
    }
    private String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 7\\case_study\\src\\Model\\Data\\DataSeller.CSV";
    public void readDataSeller(){

        try {
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);
            List<String[]> allData = csvReader.readAll();
            for(String[] row: allData){
                for (String value: row){
                    System.out.printf("%-13s",value);
                }
                System.out.println();
            }
            csvReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public boolean isRegister(String account){
        try {
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);

            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && account.equals(row[0])) {
                    return false;
                }
            }
            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}

