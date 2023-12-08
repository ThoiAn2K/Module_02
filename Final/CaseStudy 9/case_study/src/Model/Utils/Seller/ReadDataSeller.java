package Model.Utils.Seller;

import Model.Implement.ReadSeller;
import Model.Implement.ReadUser;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataSeller implements ReadUser, ReadSeller {
    private static ReadDataSeller instance;

    public static ReadDataSeller getInstance() {
        if (instance == null) {
            instance = new ReadDataSeller();
        }
        return instance;
    }

    @Override
    public boolean isRead(String account) {
        return idReadAccountSellers(account);
    }

    @Override
    public void read(String[] data) {
        readDataSellers();
    }

    @Override
    public boolean isReadData(String name) {
        return isReadName(name);
    }

    @Override
    public boolean isLogin(String account, String password) {
        return isLoginOfSeller(account,password);
    }

    public void readDataSellers() {
        try {
            FileReader fileReader = new FileReader(PATH);
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

    public boolean idReadAccountSellers(String account) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && account.equals(row[0])) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }


    public boolean isReadName(String shopName){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && shopName.equals(row[2])) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

   public String name;


    public boolean isLoginOfSeller(String account, String password){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && account.equals(row[0]) && password.equals(row[1])) {
                    name = row[2];
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
