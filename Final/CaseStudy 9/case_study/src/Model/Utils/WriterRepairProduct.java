package Model.Utils;

import Model.Entity.Product;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class WriterRepairProduct implements Model.Utils.Product {
    private static WriterRepairProduct instance;

    public static WriterRepairProduct getInstance() {
        if (instance == null) {
            instance = new WriterRepairProduct();

        }
        return instance;
    }

    @Override
    public void download(String [] data) {

    }
    Scanner scanner = new Scanner(System.in);

    public void setProductName(String productNameNeedRepair, String newName) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                Product product = new Product();
                if (row.length > 0 && product.getShopName().equals(row[0]) && productNameNeedRepair.equals(row[1])) {
                    row[1] = newName;
                }
            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(allData);
            csvWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("not find product");
        }

    }

    public void setProductDescription(String newDescription, String name) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                Product product = new Product();
                if (row.length > 0 && product.getShopName().equals(row[0]) && name.equals(row[1])) {
                    row[2] = newDescription;
                }
            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(allData);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("not find product");
        }

    }

    public void setProductPrice(int price, String name) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                Product product = new Product();
                if (row.length > 0 && product.getShopName().equals(row[0]) && name.equals(row[1])) {
                    row[3] = String.valueOf(price);
                }
            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(allData);
            csvWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("not find product");
        }
    }
}

