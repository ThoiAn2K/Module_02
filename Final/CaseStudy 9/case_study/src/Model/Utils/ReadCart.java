package Model.Utils;

import Model.Entity.Cart;
import Model.Implement.Buy;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class ReadCart implements Buy {
    private static ReadCart instance;

    public static ReadCart getInstance() {
        if (instance == null) {
            instance = new ReadCart();
        }
        return instance;
    }

    @Override
    public void buy(String owner, String shop, String product, int quantity) {
        readCart(owner,shop,product,quantity);
    }
    public void readCart(String owner, String shop, String product, int quantity){
        try{
            double total = 0;
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String [] row : allData){
                if (owner.equals(row[0]) ){
                    Cart cart = new Cart(row[1], row[2], Double.parseDouble(row[3]),Integer.parseInt(row[4]),Double.parseDouble(row[5]));
                    System.out.println(cart);
                    total+=Double.parseDouble(row[5]);
                }
            }
            System.out.println("The total amount you need to calculate is : " + total);
        } catch (IOException e){
            e.printStackTrace();

        }
    }
}
