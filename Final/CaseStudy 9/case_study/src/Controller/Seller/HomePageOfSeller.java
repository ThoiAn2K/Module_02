package Controller.Seller;

import Controller.Home;
import Controller.HomePage;
import Model.Entity.Product;

import Model.Utils.ReadProductOfSeller;
import Model.Utils.WriterProduct;
import View.Home.AddProductView;

import java.util.Scanner;

public class HomePageOfSeller implements HomePage {
    private static HomePageOfSeller instance;

    public static HomePageOfSeller getInstance() {
        if (instance == null) {
            instance = new HomePageOfSeller();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageOfSeller();
    }

    public void homePageOfSeller() {
        View.Home.HomePageOfSeller homePageOfSeller = View.Home.HomePageOfSeller.getInstance();
        homePageOfSeller.load();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        AddProductView addProductView = AddProductView.getInstance();
        HomePageLoginOfSeller homePageLoginOfSeller = HomePageLoginOfSeller.getInstance();
        ReadProductOfSeller readProductOfSeller = ReadProductOfSeller.getInstance();
        String nameOfProduct = "";
        String description = "";
        double price = 0;
        Product product = new Product(nameOfProduct, description, price);


            switch (number) {
                case "1":
                    readProductOfSeller.read();
                    load();
                    break;
                case "2":
                    addProductView.nameOfProduct();
                    nameOfProduct = scanner.nextLine();
                    product.setNameOfProduct(nameOfProduct);

                    addProductView.description();
                    description = scanner.nextLine();
                    product.setDescription(description);

                    addProductView.price();
                    price = scanner.nextInt();
                    System.out.println();
                    product.setPrice(price);


                    String[] data = {product.getShopName(), product.getNameOfProduct(), product.getDescription(), String.valueOf(product.getPrice())};
                    WriterProduct writerProduct = WriterProduct.getInstance();
                    writerProduct.download(data);
                    System.out.println("Product updated successfully");
                    System.out.println();
                    load();
                    break;

                case "3":
                    RepairProduct repairProduct = RepairProduct.getInstance();
                    repairProduct.load();

                    break;

                case "4":
                    System.out.println("Enter name Of Product you want delete");
                    String delete = scanner.nextLine();
                    readProductOfSeller.delete(delete);
                    load();
                    break;
                case "5":
                    LoginOrRegisterSellerController loginOrRegisterSellerController = LoginOrRegisterSellerController.getInstance();
                    loginOrRegisterSellerController.load();
                    break;

                case "6":
                    Home home = Home.getInstance();
                    home.load();
                    break;
                default:
                    load();
        }
    }
}
