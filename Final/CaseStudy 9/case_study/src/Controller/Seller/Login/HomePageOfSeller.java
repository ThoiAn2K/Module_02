package Controller.Seller.Login;

import Controller.Home;
import Controller.Seller.LoginOrRegisterSellerController;
import Model.Implement.HomePage;
import Model.Entity.Product;

import Model.Services.Seller.AddProduct;
import Model.Utils.Seller.CheckTheWarehouse;
import Model.Utils.Seller.ReadProductOfSeller;
import Model.Utils.Seller.ReadWalletOfSeller;
import Model.Utils.Seller.WriterWalletOfSeller;
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
        int quantity = 0;
        double price = 0;
        Product product = new Product(nameOfProduct, description, price);


        switch (number) {
            case "1":
                readProductOfSeller.readShop(product.getShopName());
                load();
                System.out.println();
                break;
            case "2":
                AddProduct addProduct = AddProduct.getInstance();
                addProduct.add(nameOfProduct,description,price,quantity);
                load();
                System.out.println();
                break;

            case "3":
                RepairProduct repairProduct = RepairProduct.getInstance();
                repairProduct.load();
                System.out.println();
                break;

            case "4":
                System.out.println("Enter name Of Product you want delete");
                String delete = scanner.nextLine();
                readProductOfSeller.delete(delete);
                load();
                System.out.println();
                break;


            case "5":
                WriterWalletOfSeller writerWalletOfSeller = WriterWalletOfSeller.getInstance();
                writerWalletOfSeller.load();

                ReadWalletOfSeller readWalletOfSeller = ReadWalletOfSeller.getInstance();
                readWalletOfSeller.load();
                load();
                System.out.println();
                break;

            case "6":
                LoginOrRegisterSellerController loginOrRegisterSellerController = LoginOrRegisterSellerController.getInstance();
                loginOrRegisterSellerController.load();
                System.out.println();
                break;

            case "7":
                Home home = Home.getInstance();
                home.load();
                System.out.println();
                break;

            default:
                load();
                System.out.println();
                break;
        }
    }
}
