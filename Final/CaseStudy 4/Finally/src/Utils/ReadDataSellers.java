package Utils;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataSellers {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy 4\\Finally\\src\\Data\\DataAccountSellers.csv";

    public static void readDataSeller(){
        try {
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);

            List<String[]> allData = csvReader.readAll() ;
            for (String[] row: allData){
                for(String value: row){
                    System.out.printf("%-15s",value);
                }
                System.out.println();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        ReadDataSellers.readDataSeller();
//    }

}
