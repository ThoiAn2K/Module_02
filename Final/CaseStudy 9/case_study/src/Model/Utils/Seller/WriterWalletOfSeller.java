package Model.Utils.Seller;

import Model.Implement.HomePage;
import Model.Entity.Product;
import Model.Entity.Wallet;
import Model.Implement.WalletSeller;
import Model.Utils.Client.ReadDataClient;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriterWalletOfSeller implements HomePage, WalletSeller {
    private static WriterWalletOfSeller instance;

    public static WriterWalletOfSeller getInstance() {
        if (instance == null) {
            instance = new WriterWalletOfSeller();
        }
        return instance;
    }

    @Override
    public void load() {
        writerWallet();
    }

    private void writerWallet() {

        ReadDataClient readDataClient = ReadDataClient.getInstance();
        Product product = new Product();
        String shop = product.getShopName();
        double money = 0;
        Wallet wallet = new Wallet();

        try {
            List<String[]> allData = new ArrayList<>();
            try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(PATH)).build()) {
                allData = csvReader.readAll();
            }

            boolean isValid = false;
            for (String[] row : allData) {
                if (shop.equals(row[0])) {
//                    row[1] = String.valueOf(Double.parseDouble(row[1]) + newPrice);
                    isValid = true;
                }
            }

            if (!isValid) {
                String[] newRow = {shop, String.valueOf(money)};
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
