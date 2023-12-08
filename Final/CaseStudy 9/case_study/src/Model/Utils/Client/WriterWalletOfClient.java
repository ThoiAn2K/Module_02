package Model.Utils.Client;

import Model.Implement.HomePage;
import Model.Entity.Wallet;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriterWalletOfClient implements HomePage {
    private static WriterWalletOfClient instance;

    public static WriterWalletOfClient getInstance() {
        if (instance == null) {
            instance = new WriterWalletOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
//        writerWallet();
    }

    public void writerWallet(double newPrice) {

        ReadDataClient readDataClient = ReadDataClient.getInstance();
        String newName = readDataClient.name;
        double money = 0;
        Wallet wallet = new Wallet();
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\WalletOfClient.CSV";
        try {

            List<String[]> allData = new ArrayList<>();
            try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(PATH)).build()) {
                allData = csvReader.readAll();
            }

            boolean isValid = false;
            for (String[] row : allData) {
                if (newName.equals(row[0])) {
                    row[1] = String.valueOf(Double.parseDouble(row[1]) + newPrice);
                    isValid = true;
                }
            }
            if (!isValid) {
                String[] newRow = {newName, String.valueOf(money)};
                allData.add(newRow);
            }
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH))) {
                csvWriter.writeAll(allData);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
