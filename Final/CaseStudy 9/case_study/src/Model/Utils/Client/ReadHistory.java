package Model.Utils.Client;

import Model.Implement.HomePage;
import Model.Entity.Cart;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadHistory implements HomePage {
    private static ReadHistory instance;

    public static ReadHistory getInstance() {
        if (instance == null) {
            instance = new ReadHistory();
        }
        return instance;
    }

    @Override
    public void load() {
        readHistory();
    }
    private void readHistory() {
        String HISTORY = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\History.CSV";
        ReadDataClient readDataClient = ReadDataClient.getInstance();
        String newName = readDataClient.name;

        try {
            CSVReader csvReader = new CSVReader(new FileReader(HISTORY));
            List<String[]> data = csvReader.readAll();
            for (String[] row : data) {
                if (newName.equals(row[0])) {
                    Cart cart = new Cart(row[1], row[2], Double.parseDouble(row[3]), Integer.parseInt(row[4]), Double.parseDouble(row[5]));
                    System.out.println(cart);
                }
            }
            csvReader.close();
        } catch (IOException e) {
            e.getMessage();

        }
    }

}
