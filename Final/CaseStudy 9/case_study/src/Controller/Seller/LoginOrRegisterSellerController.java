package Controller.Seller;


import Controller.Home;
import Controller.HomePage;

import View.Home.LoginOrRegisterOfSellerView;

import java.util.Scanner;

public class LoginOrRegisterSellerController implements HomePage {
    private static LoginOrRegisterSellerController instance;

    public static LoginOrRegisterSellerController getInstance() {
        if (instance == null) {
            instance = new LoginOrRegisterSellerController();
        }
        return instance;
    }

    @Override
    public void load() {
        login0rRegister();
    }

    public void login0rRegister() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;
        System.out.println();

        while (!isValid) {
            LoginOrRegisterOfSellerView loginOrRegisterOfSellerView = new LoginOrRegisterOfSellerView();
            loginOrRegisterOfSellerView.load();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    HomePageLoginOfSeller homePageLoginOfSeller = HomePageLoginOfSeller.getInstance();
                    homePageLoginOfSeller.load();
                    isValid = true;
                    break;
                case "2":
                    HomePageRegisterOfSeller homePageRegisterOfSeller = HomePageRegisterOfSeller.getInstance();
                    homePageRegisterOfSeller.load();
                    isValid = true;
                    break;
                case "3":
                    Home home = Home.getInstance();
                    home.load();
                    break;
            }
        }
    }
}
