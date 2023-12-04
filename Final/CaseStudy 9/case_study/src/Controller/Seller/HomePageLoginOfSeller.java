package Controller.Seller;

import Controller.Client.LoginOrRegisterClientController;
import Controller.HomePage;
import Controller.Login;
import Model.Entity.Product;
import Model.Utils.ReadDataClient;
import Model.Utils.ReadDataSeller;
import View.Home.LoginView;

import java.util.Scanner;

public class HomePageLoginOfSeller implements HomePage {
    private static HomePageLoginOfSeller instance;

    public static HomePageLoginOfSeller getInstance() {
        if (instance == null) {
            instance = new HomePageLoginOfSeller();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageLoginOfSeller();
    }

    public String shopName = "";

    public void homePageLoginOfSeller() {
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
            if (readDataSeller.isLogin(account, password)) {
                System.out.println("welcome " + readDataSeller.name + " to my system");
                HomePageOfSeller homePageOfSeller = HomePageOfSeller.getInstance();
                product.setShopName(readDataSeller.name);
                homePageOfSeller.load();
                isValid = true;
            } else {
                System.out.println("The account or password you entered is incorrect");
                LoginOrRegisterSellerController loginOrRegisterSellerController = LoginOrRegisterSellerController.getInstance();
                loginOrRegisterSellerController.load();
                isValid = true;
            }
        }
    }
}
