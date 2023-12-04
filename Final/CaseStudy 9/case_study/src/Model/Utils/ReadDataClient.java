package Model.Utils;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadDataClient implements ReadClient, ReadUser {
    private static ReadDataClient instance;

    public static ReadDataClient getInstance() {
        if (instance == null) {
            instance = new ReadDataClient();
        }
        return instance;
    }

    @Override
    public boolean isRead(String account) {
        return idReadAccountClient(account);
    }

    @Override
    public void read(String[] data) {
        readDataClient();
    }

    @Override
    public boolean isReadData(String name) {
        return isReadName(name);
    }

    @Override
    public boolean isLogin(String account, String password) {
        return isLoginOfClient(account,password);
    }

    private void readDataClient() {
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

   private boolean idReadAccountClient(String account) {
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
private boolean isReadName(String name){
    try {
        CSVReader csvReader = new CSVReader(new FileReader(PATH));
        List<String[]> allData = csvReader.readAll();
        for (String[] row : allData) {
            if (row.length > 0 && name.equals(row[2])) {
//            if ( name.equals(row[0])) {
                return false;
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
    return true;
}

public String name="";
    private boolean isLoginOfClient(String account, String password){
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
