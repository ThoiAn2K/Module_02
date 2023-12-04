package Utils;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataClients {
    public static void readDataClients(){
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 5\\case_study\\src\\Data\\DataAccountClients.CSV";
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

}
