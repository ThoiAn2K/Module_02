package Model.Utils.Reader;


import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadClient {
    private static ReadClient instance;
    public static ReadClient getInstance() {
        if (instance == null) {
            synchronized (ReadClient.class) {
                if (instance == null) {
                    instance = new ReadClient();
                }
            }
        }
        return instance;
    }
    private String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 7\\case_study\\src\\Model\\Data\\DataClient.CSV";
    public void readDataClients(){

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
