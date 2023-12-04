package Utils;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OutputWriterClient {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy\\Case_Study\\src\\Data\\DataClient.csv";

    public static void readDataClient() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            String[] nextLine;
            boolean isLoginSaler = false;

            while ((nextLine = csvReader.readNext()) != null) {
                for (String value : nextLine) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }

            csvReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
