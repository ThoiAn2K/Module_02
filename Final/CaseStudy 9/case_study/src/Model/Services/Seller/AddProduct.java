package Model.Services.Seller;

import Controller.Seller.Login.HomePageLoginOfSeller;
import Controller.Seller.Login.HomePageOfSeller;
import Model.Entity.Product;
import Model.Implement.AddProductServices;
import Model.Utils.Seller.ReadProductOfSeller;
import Model.Utils.WriterProduct;
import View.Home.AddProductView;

import javax.swing.plaf.IconUIResource;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AddProduct implements AddProductServices {
    private static AddProduct instance;

    public static AddProduct getInstance() {
        if (instance == null) {
            instance = new AddProduct();
        }
        return instance;
    }

    @Override
    public void add(String nameOfProduct, String description, double price, int quantity) {
        addProduct(nameOfProduct, description, price, quantity);
    }

    private void addProduct(String nameOfProduct, String description, double price, int quantity) {
        Scanner scanner = new Scanner(System.in);

        Product product = new Product();
        HomePageLoginOfSeller homePageLoginOfSeller = HomePageLoginOfSeller.getInstance();
        ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
        AddProductView addProductView = AddProductView.getInstance();
        HomePageOfSeller homePageOfSeller = HomePageOfSeller.getInstance();
        int count = 0;
        do {

            addProductView.nameOfProduct();
            nameOfProduct = scanner.nextLine();
            product.setNameOfProduct(nameOfProduct);
            count++;
            if (count == 3) {
                System.out.println("product already exists. Please return to the menu to review the product list");

                homePageOfSeller.load();
                break;

            }

        } while (readProductOfSeller.isValidExistProduct(product.getShopName(), nameOfProduct));


        addProductView.description();
        description = scanner.nextLine();
        product.setDescription(description);


        int countInvalidInput = 0;

        while (countInvalidInput < 3) {
            System.out.println("Enter price of product: (The price must be entered as a number and cannot contain alphanumeric characters)");

            if (scanner.hasNextDouble()) {
                price = scanner.nextDouble();
                product.setPrice(price);
                break;
            } else {
                System.out.println("Invalid input. Please enter a valid numeric price.");
                scanner.nextLine();
                countInvalidInput++;
            }
        }

        if (countInvalidInput == 3) {
            System.out.println("Too many incorrect inputs. Exiting...");
            homePageOfSeller.load();
        }


        int countInvalidInputQuantity = 0;

        while (countInvalidInputQuantity < 3) {

            System.out.println("Enter quantity of product: (Quantities can only be entered as integers and cannot be entered as decimals or words)");

            try {
                quantity = scanner.nextInt();
                scanner.nextLine();
                product.setQuantity(quantity);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                scanner.nextLine();
                countInvalidInputQuantity++;
            }
        }
        if (countInvalidInputQuantity == 3) {
            System.out.println("Too many incorrect inputs. Exiting...");
            homePageOfSeller.load();

        }

//        quantity = scanner.nextInt();
////        System.out.println(quantity);
//        System.out.println();
//        product.setQuantity(quantity);

        String[] data = {product.getShopName(), product.getNameOfProduct(), product.getDescription(), String.valueOf(product.getPrice()), String.valueOf(product.getQuantity())};
        WriterProduct writerProduct = WriterProduct.getInstance();
        writerProduct.download(data);
        System.out.println("Product updated successfully");
        System.out.println();

        homePageOfSeller.load();
    }
}
