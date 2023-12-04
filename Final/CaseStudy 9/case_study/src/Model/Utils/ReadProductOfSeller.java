package Model.Utils;

import Model.Entity.Product;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadProductOfSeller implements ReadProduct {

    private static ReadProductOfSeller instance;

    public static ReadProductOfSeller getInstance() {
        if (instance == null) {
            instance = new ReadProductOfSeller();
        }
        return instance;
    }

    @Override
    public void ReadAll() {
        readListProduct();
    }

    @Override
    public void read() {
        readAType();
    }

    @Override
    public void delete(String name) {
        deleteProduct(name);
    }

    @Override
    public boolean isValid(String product) {
        return isValidProduct(product);
    }

    @Override
    public void readAProduct(String productName) {
        readAProductName(productName);
    }

    private void readAProductName(String productName) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            Product product = new Product();
            List<String[]> allData = csvReader.readAll();
//            boolean found = false;

            for (String[] row : allData) {
                if (product.getShopName().equals(row[0]) && productName.equals(row[1])) {
//                    found = true;
//                }
//                if (found) {
//                    for (String value : row) {
                    product.setNameOfProduct(row[1]);
                    product.setDescription(row[2]);
                    product.setPrice(Integer.parseInt(row[3]));
                    System.out.println(product);
//                        System.out.printf("%-18s", value);
//                        found = false;
                }
//                System.out.println();
            }
            csvReader.close();
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void readListProduct() {
        try {
            FileReader fileReader = new FileReader(PATH);
            CSVReader csvReader = new CSVReader(fileReader);
            Product product = new Product();
            String[] header = csvReader.readNext();
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
//                for (String value : row) {
                product.setShopName(row[0]);
                product.setNameOfProduct(row[1]);
                product.setDescription(row[2]);
                product.setPrice(Integer.parseInt(row[3]));
                System.out.println(product);
//                }
//                System.out.println();
            }
            csvReader.close();
        } catch (
                IOException e) {
            e.printStackTrace();
        }
    }

    private void readAType() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            Product product = new Product();

            System.out.println(product.getShopName());

            List<String[]> allData = csvReader.readAll();
            boolean found = false;

            for (String[] row : allData) {
//                for (String value : row) {
                if (product.getShopName().equals(row[0])) {
                    found = true;
//                    break;
                }
//                }

                if (found) {
                    product.setNameOfProduct(row[1]);
                    product.setDescription(row[2]);
                    product.setPrice(Integer.parseInt(row[3]));
                    System.out.println(product);
//                    for (String value : row) {
//                        System.out.printf("%-18s", value);
                    found = false;
                }
//                    System.out.println();
            }
            csvReader.close();
//            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void deleteProduct(String name) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> oldListProduct = csvReader.readAll();
            csvReader.close();

            List<String[]> newListProduct = new ArrayList<>();
            for (String[] row : oldListProduct) {
                Product product = new Product();
                if (!row[0].equals(product.getShopName()) && !row[1].equals(name)) {
                    newListProduct.add(row);
                }
            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(newListProduct);
            csvWriter.close();
        } catch (IOException e) {
            System.out.println("not find product ");
            ;
        }
    }

    private boolean isValidProduct(String product) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && product.equals(row[1])) {
                    return true;

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("not find product");
        return false;
    }


}



