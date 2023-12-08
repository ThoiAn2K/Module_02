package Model.Utils.Client;

import Model.Implement.HomePage;
import Model.Entity.Wallet;
import Model.Implement.WalletClient;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

import java.util.List;

public class ReadWalletOfClient implements HomePage, WalletClient {
    private static ReadWalletOfClient instance;

    public static ReadWalletOfClient getInstance() {
        if (instance == null) {
            instance = new ReadWalletOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
        readWalletOfClient();
    }

    public void readWalletOfClient(){



        ReadDataClient readDataClient = ReadDataClient.getInstance();
        String name = readDataClient.name;

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
