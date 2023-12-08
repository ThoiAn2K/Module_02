package Model.Utils.Seller;

import Model.Entity.Product;
import Model.Implement.ReadProduct;
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
    public void readShop(String shop) {
        readAType(shop);
    }

    @Override
    public void delete(String name) {
        deleteProduct(name);
    }

    @Override
    public boolean isValid(String shop, String product) {
        return isValidProduct(shop, product);
    }

    @Override
    public void readAProduct(String productName, String shop) {
        readAProductName(productName, shop);
    }

    private void readAProductName(String productName, String shop) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            Product product = new Product();
            List<String[]> allData = csvReader.readAll();

            for (String[] row : allData) {
                if (shop.equals(row[0]) && productName.equals(row[1])) {

                    product.setShopName(row[0]);
                    product.setNameOfProduct(row[1]);
                    product.setDescription(row[2]);
                    product.setPrice(Double.parseDouble(row[3]));
                    product.setQuantity(Integer.parseInt(row[4]));
                    System.out.println(product);
                }
            }
            csvReader.close();
        } catch (IOException e) {
            System.out.println("not find product ");
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
                product.setPrice(Double.parseDouble(row[3]));
                product.setQuantity(Integer.parseInt(row[4]));
                System.out.println(product);
//                }
//                System.out.println();
            }
            csvReader.close();
        } catch (
                IOException e) {
            System.out.println("not find product ");
        }
    }

    private void readAType(String shop) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            Product product = new Product();

//            System.out.println(product.getShopName());

            List<String[]> allData = csvReader.readAll();
            boolean found = false;

            for (String[] row : allData) {
//                for (String value : row) {
                if (shop.equals(row[0])) {

//                    if (shop.contains(row[0])) {
                    found = true;
//                    break;
                }
//                }

                if (found) {
                    product.setShopName(row[0]);
                    product.setNameOfProduct(row[1]);
                    product.setDescription(row[2]);
                    product.setPrice(Double.parseDouble(row[3]));
                    product.setQuantity(Integer.parseInt(row[4]));
                    System.out.println(product);
//                    for (String value : row) {
//                        System.out.printf("%-18s", value);
                    found = false;
                }
            }
            csvReader.close();
//            }

        } catch (IOException e) {
            System.out.println("not find product ");
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
                if (!row[0].equals(product.getShopName()) || row[0].equals(product.getShopName()) && !row[1].equals(name)) {
                    newListProduct.add(row);
                }
            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(newListProduct);
            csvWriter.close();
            System.out.println("The changes have been updated successfully");
        } catch (IOException e) {
            System.out.println("not find product ");
            ;
        }
    }

    private boolean isValidProduct(String shop, String product) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && shop.equals(row[0]) && product.equals(row[1])) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("not find product");
        return false;
    }

    public boolean isValidExistProduct(String shop, String product){
        try{
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && shop.equals(row[0]) && product.equals(row[1])) {
                    System.out.println("product already exists");
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }




    public boolean isValidShop(String shop) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && shop.equals(row[0])) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("not find shop");
        return false;
    }

    public boolean isValidPrice(String shop, String product, int quantity) {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> allData = csvReader.readAll();
            for (String[] row : allData) {
                if (row.length > 0 && shop.equals(row[0]) && product.equals(row[1]) && Integer.parseInt(row[4]) >= quantity) {
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("The remaining product quantity is not enough to meet your needs");
        return false;
    }
}



