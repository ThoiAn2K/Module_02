package Model.Services.GeneralUse;

import Model.Implement.HomePage;
import Model.Utils.Client.ReadDataClient;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Payment implements HomePage {
    private static Payment instance;

    public static Payment getInstance() {
        if (instance == null) {
            instance = new Payment();
        }
        return instance;
    }

    @Override
    public void load() {
        payment();
    }

    private void payment() {
        ReadDataClient readDataClient = ReadDataClient.getInstance();

        String listProduct = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\DataListProduct.CSV";
        String pathSeller = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\WalletOfSeller.CSV";
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\Carts.CSV";
        String pathClient = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\WalletOfClient.CSV";
        String HISTORY = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\History.CSV";
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            double Total = 0;
            for (String[] row : allData) {
                if (row[0].equals(readDataClient.name)) {
                    Total += Double.parseDouble(row[5]);
                }
            }
            CSVReader csvReaderWallet = new CSVReader(new FileReader(pathClient));
            double money = 0;
            List<String[]> allDataWalletClient = csvReaderWallet.readAll();
            for (String[] row : allDataWalletClient) {
                if (row[0].equals(readDataClient.name)) {
                    money = Double.parseDouble(row[1]);
//                    System.out.println(money);
                }
            }
            double newMoney = 0;
            if (Total <= money) {
                newMoney = money - Total;

                for (String[] row : allDataWalletClient) {
                    if (readDataClient.name.equals(row[0])) {
                        row[1] = String.valueOf(newMoney);
//                        System.out.println(row[1]);
                    }
                }

                CSVWriter csvWriter = new CSVWriter(new FileWriter(pathClient));
                csvWriter.writeAll(allDataWalletClient);
                csvWriter.close();


                CSVReader csvReaderCart = new CSVReader(new FileReader(PATH));
                List<String[]> allDataCart = csvReaderCart.readAll();
                CSVReader csvReaderWalletSeller = new CSVReader(new FileReader(pathSeller));

                CSVReader csvReaderAllProduct = new CSVReader(new FileReader(listProduct));
                List<String []> allDataProductOfSeller = csvReaderAllProduct.readAll();

                for (String [] row : allDataProductOfSeller){
                    for (String [] data : allDataCart ){
                        if(row[0].equals(data[1]) && row[1].equals(data[2])){
                            row[4] = String.valueOf(Integer.valueOf(row[4]) - Integer.valueOf(data[4]));
                        }
                    }
                }

                CSVWriter csvWriterNewDataProduct = new CSVWriter(new FileWriter(listProduct));
                csvWriterNewDataProduct.writeAll(allDataProductOfSeller);
                csvWriterNewDataProduct.close();

                List<String[]> allDataWallet = csvReaderWalletSeller.readAll();

                for (String [] row : allDataCart){
                    for (String [] value : allDataWallet){
                        if (readDataClient.name.equals(row[0]) && row[1].equals(value[0])){
                            value[1] = String.valueOf(Double.parseDouble(value[1]) + Double.parseDouble(row[5]));

                        }
                    }
                }

                System.out.println("You have successfully paid");

                CSVWriter csvWriterNew =  new CSVWriter(new FileWriter(pathSeller));
                csvWriterNew.writeAll(allDataWallet);
                csvWriterNew.close();

                CSVReader csvReaderDelete = new CSVReader(new FileReader(PATH));
                List<String[]> allDataNeed = csvReaderDelete.readAll();
                List<String[]> newData = new ArrayList<>();
                List<String[]> history = new ArrayList<>();
                for (String[] row : allDataNeed) {
                    if (!readDataClient.name.equals(row[0])) {
                        newData.add(row);
                    } else {
                        history.add(row);
                    }
                }
                CSVWriter csvWriterNewData = new CSVWriter(new FileWriter(PATH));
                csvWriterNewData.writeAll(newData);
                csvWriterNewData.close();

                CSVWriter csvWriterHistory = new CSVWriter(new FileWriter(HISTORY , true));
                csvWriterHistory.writeAll(history);
                csvWriterHistory.close();

            } else {
                System.out.println("You don't have enough money in your account");
            }
        } catch (IOException e) {
            System.out.println("error again");
        }
    }
}
