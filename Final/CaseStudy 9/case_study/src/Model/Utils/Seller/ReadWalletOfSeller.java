package Model.Utils.Seller;

import Model.Implement.HomePage;
import Model.Entity.Product;
import Model.Entity.Wallet;
import Model.Implement.WalletSeller;
import Model.Utils.Client.ReadDataClient;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadWalletOfSeller implements HomePage, WalletSeller {
    private static ReadWalletOfSeller instance;

    public static ReadWalletOfSeller getInstance() {
        if (instance == null) {
            instance = new ReadWalletOfSeller();
        }
        return instance;
    }

    @Override
    public void load() {
        readWalletOfSeller();
    }

    public void readWalletOfSeller(){



        Product product = new Product();
        ReadDataClient readDataClient = ReadDataClient.getInstance();
        String name = product.getShopName(); ;
        System.out.println(name);

        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String []> allData = csvReader.readAll();
            for (String [] row : allData){
                if (name.equals(row[0])){
                    Wallet wallet = new Wallet(row[0],Double.parseDouble(row[1]));
                    System.out.println(wallet);
                }
            }

            csvReader.close();
            System.out.println();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
