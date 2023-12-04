package Controller;

import Model.Product;
import Utils.WriterDataProduct;
import Utils.WriterDataSellers;
import View.MoreProductFormSeller;
import View.ViewSeller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ControllerSeller {
    public void load() {

        Scanner scanner = new Scanner(System.in);
        boolean isValidate = false;


        while (!isValidate) {
            ViewSeller.display();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    MoreProductFormSeller.nameOfShop();
                    String  nameShop= scanner.nextLine();

                    MoreProductFormSeller.addId();
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    MoreProductFormSeller.addName();
                    String name = scanner.nextLine();

                    MoreProductFormSeller.addDescription();
                    String description = scanner.nextLine();

                    MoreProductFormSeller.addPrice();
                    double price = scanner.nextDouble();

                    Product product = new Product(nameShop,id,name,description,price);
                    WriterDataProduct writerDataProductObject = new WriterDataProduct();
                    writerDataProductObject.writerDataProduct(product);

                    isValidate = true;
                    break;

                case "2":

                    isValidate = true;
                    break;
            }
        }
    }

}
