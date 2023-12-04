package Utils;

import Controller.LoginOfSaler;
import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class OutputWriterSaler {
    public static String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\CaseStudy\\Case_Study\\src\\Data\\DataSaler.csv";

    public static void readDataSaler() {

        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            String[] nextLine;


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

