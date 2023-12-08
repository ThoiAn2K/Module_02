package Model.Utils;

import Controller.Clients.Login.HomePageOfClient;
import Model.Implement.Buy;
import Model.Utils.Client.ReadDataClient;
import Model.Utils.Seller.ReadProductOfSeller;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.CSVWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WriterCart implements Buy {

    private static WriterCart instance;

    public static WriterCart getInstance() {
        if (instance == null) {
            instance = new WriterCart();
        }
        return instance;
    }

    @Override
    public void buy(String owner, String shop, String product, int quantity) {
        writerInCart(owner, shop, product, quantity);
    }

    public void writerInCart(String owner, String shop, String product, int quantity) {
//        try {
//            String pathProduct = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\.CSV";
//            CSVReader csvReader = new CSVReader(new FileReader(pathProduct));
//
//            String ownerName = null;
//            String shopName = null;
//            String quantityOfProduct = null;
//            String productName = null;
//            boolean isValid = false;
//            CSVReader csvReaderCart = new CSVReader(new FileReader(PATH));
//            List<String[]> allDataCart = csvReaderCart.readAll();
//            for (String[] row : allDataCart) {
//                if (owner.equals(row[0]) && shop.equals(row[1]) && product.equals(row[2])) {
//                    row[3] = String.valueOf(quantity);
//                    isValid = true;
//                }
//            }
//            CSVWriter csvWriterCart = new CSVWriter(new FileWriter(PATH,true));
//            csvWriterCart.writeNext(allDataCart);
//            csvWriterCart.close();
//
//            if (!isValid) {
//                List<String[]> allData = csvReader.readAll();
//                for (String[] row : allData) {
//                    if (row.length > 0 && shop.equals(row[0]) && product.equals(row[1])) {
//                        ownerName = owner;
//                        shopName = row[0];
//                        productName = row[1];
//                        quantityOfProduct = String.valueOf(quantity);
//
//                    }
//                }
//                if (!isValid){
//                String[] data = {ownerName, shopName, productName, quantityOfProduct};
//                CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH, true));
//                csvWriter.writeNext(data);
//                csvWriter.close();}
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//

        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\Carts.CSV";

        try {
            // Đọc toàn bộ dữ liệu từ tệp CSV vào một danh sách
            List<String[]> allData = new ArrayList<>();
            try (CSVReader csvReader = new CSVReaderBuilder(new FileReader(PATH)).build()) {
                allData = csvReader.readAll();
            }
            String priceProduct = null;
            String PathProduct = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\DataListProduct.CSV";
            ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
            CSVReader csvReader = new CSVReader(new FileReader(PathProduct));
            List<String[]> value = csvReader.readAll();
            for (String[] row : value) {
                if (shop.equals(row[0]) && product.equals(row[1])) {

                    priceProduct = row[3];
                }
            }
            boolean isValid = false;
            for (String[] row : allData) {
                if (owner.equals(row[0]) && shop.equals(row[1]) && product.equals(row[2])) {
                    row[4] = String.valueOf(quantity);
                    row[5] = String.valueOf(Double.parseDouble(priceProduct) * quantity);
                    isValid = true;
                }
            }

            if (!isValid) {
                // Thêm dòng mới vào danh sách nếu không tìm thấy dòng để cập nhật
                String[] newRow = {owner, shop, product, priceProduct, String.valueOf(quantity), String.valueOf(Double.parseDouble(priceProduct) * quantity)};
                allData.add(newRow);
            }

            // Ghi lại toàn bộ dữ liệu vào tệp CSV
            try (CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH))) {
                csvWriter.writeAll(allData);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void delete( String shop, String product){
        String PATH = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 9\\case_study\\src\\Model\\Data\\Carts.CSV";
        try {
            ReadDataClient readDataClient = ReadDataClient.getInstance();
            String newName = readDataClient.name;
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            List<String[]> data = csvReader.readAll();
            List<String []> newData = new ArrayList<>();
            for (String [] row : data){
                if (!newName.equals(row[0]) && !shop.equals(row[1]) && !product.equals(row[2])){
                    newData.add(row);
                } else if(newName.equals(row[0]) && !shop.equals(row[1]) ){
                    newData.add(row);
                } else if (newName.equals(row[0]) && shop.equals(row[1]) && !product.equals(row[2])){
                    newData.add(row);
                };
            }
            CSVWriter csvWriter = new CSVWriter(new FileWriter(PATH));
            csvWriter.writeAll(newData);
            csvWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

