package Model.Utils.Seller;

import Model.Entity.Product;
import Model.Implement.HomePage;
import Model.Implement.LinkProduct;
import Model.Services.Buyer.BuyerLogin;
import com.opencsv.CSVReader;

import javax.imageio.IIOException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CheckTheWarehouse implements LinkProduct, HomePage {
    private static CheckTheWarehouse instance;

    public static CheckTheWarehouse getInstance() {
        if (instance == null) {
            instance = new CheckTheWarehouse();

        }
        return instance;
    }

    @Override
    public void load() {
//        checkTheWarehouse();
    }

    public void checkTheWarehouse( String name) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (name.equals(row[0])) {
                    if (Integer.valueOf(row[4]) == 0) {
                        System.out.println("Your product ís sold out, please add or change the quantity of this product in stock");
                        Product product = new Product(name,row[1], row[2], Double.parseDouble(row[3]), Integer.parseInt(row[4]));
                        System.out.println(product);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error again");
        }

    }
}
