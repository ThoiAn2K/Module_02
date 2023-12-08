package Model.Services.Seller;

import Controller.Seller.Login.HomePageOfSeller;
import Controller.Seller.LoginOrRegisterSellerController;
import Model.Entity.Product;
import Model.Implement.HomePage;
import Model.Services.Buyer.BuyerLogin;
import Model.Utils.Seller.CheckTheWarehouse;
import Model.Utils.Seller.ReadDataSeller;
import Model.Utils.Seller.WriterWalletOfSeller;
import View.Home.LoginView;

import java.util.Scanner;

public class SellerLogin implements HomePage {
    private static SellerLogin instance;

    public static SellerLogin getInstance() {
        if (instance == null) {
            instance = new SellerLogin();
        }
        return instance;
    }

    @Override
    public void load() {
        sellerLogin();
    }
//    public String shopName = "";
    private void sellerLogin() {
        Scanner scanner = new Scanner(System.in);
        LoginView loginView = LoginView.getInstance();
        ReadDataSeller readDataSeller = ReadDataSeller.getInstance();
        Product product = new Product();


        boolean isValid = false;

        String account = "";
        String password = "";

        while (!isValid) {
            loginView.enterAccount();
            account = scanner.nextLine();
            loginView.enterPassWord();
            password = scanner.nextLine();
            System.out.println();

            if (readDataSeller.isLogin(account, password)) {
                System.out.println("==============================");
                System.out.println("Welcome " + readDataSeller.name + " to my system");

                CheckTheWarehouse checkTheWarehouse = CheckTheWarehouse.getInstance();
                checkTheWarehouse.checkTheWarehouse(readDataSeller.name);

                HomePageOfSeller homePageOfSeller = HomePageOfSeller.getInstance();
                product.setShopName(readDataSeller.name);
                WriterWalletOfSeller writerWalletOfSeller = WriterWalletOfSeller.getInstance();
                writerWalletOfSeller.load();
                homePageOfSeller.load();
                System.out.println();
                isValid = true;
            } else {
                System.out.println("==============================");
                System.out.println("The account or password you entered is incorrect");

                LoginOrRegisterSellerController loginOrRegisterSellerController = LoginOrRegisterSellerController.getInstance();
                loginOrRegisterSellerController.load();
                isValid = true;
            }
        }
    }
}
