package Model.Utils.Client;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class RepairProductInCart {
    private static RepairProductInCart instance;

    public static RepairProductInCart getInstance() {
        if (instance == null) {
            instance = new RepairProductInCart();
        }
        return instance;

    }

    String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\Carts.CSV";

    public void repairProductInCart(String nameCart, String nameShop, String nameProduct, int quantity) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> data = csvReader.readAll();
            for (String[] row : data) {
                if (nameCart.equals(row[0]) && nameShop.equals(row[1]) && nameProduct.equals(row[2])) {
                    row[4] = String.valueOf(quantity);
                }
            }
            System.out.println("Data updated successfully");
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(data);
            csvWriter.close();
        } catch (IOException e) {
            System.out.println(" ");
        }
    }

    public boolean isShop(String nameCart, String shop) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> data = csvReader.readAll();
            for (String[] row : data) {
                if (nameCart.equals(row[0]) && shop.equals(row[1])) {
                    return true;
                }
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
    }

    public boolean isProduct(String nameCart, String shop, String product) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> data = csvReader.readAll();
            for (String[] row : data) {
                if (nameCart.equals(row[0]) && shop.equals(row[1]) && product.equals(row[2])) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
    }

    public boolean isQuantity(String nameCart, String shop, String product, int quantity) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> data = csvReader.readAll();
            for (String[] row : data) {
                if (nameCart.equals(row[0]) && shop.equals(row[1]) && product.equals(row[2]) && quantity <= Integer.valueOf(row[4])) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
        return false;
    }
}
