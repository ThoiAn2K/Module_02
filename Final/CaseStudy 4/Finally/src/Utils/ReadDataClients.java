package Utils;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataClients {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy 4\\Finally\\src\\Data\\DataAccountClients.csv";

    public static void readDataClients() {
        try {
            FileReader fileReader = new FileReader(PATH);
//            CSVReader csvReader = new CSVReaderBuilder(fileReader).withSkipLines(1).build();
            CSVReader csvReader = new CSVReader(fileReader);

            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                for (String value : row) {
                    System.out.printf("%-13s", value);
                }
                System.out.println();
            }

            csvReader.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        ReadDataClients.readDataClients();
//    }
}