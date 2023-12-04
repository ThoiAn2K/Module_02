package Controller.Client;

import Controller.HomePage;
import Controller.Seller.HomePageLoginOfSeller;
import Model.Utils.ReadDataClient;
import View.Home.LoginView;

import java.util.Scanner;

public class HomePageLoginOfClient implements HomePage {
    private static HomePageLoginOfClient instance;

    public static HomePageLoginOfClient getInstance() {
        if (instance == null) {
            instance = new HomePageLoginOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageLoginOfClient();
    }

    public void homePageLoginOfClient() {
        Scanner scanner = new Scanner(System.in);
        LoginView loginView = LoginView.getInstance();
        ReadDataClient readDataClient = ReadDataClient.getInstance();
        HomePageOfClient homePageOfClient = HomePageOfClient.getInstance();

        boolean isValid = false;

        String account = "";
        String password = "";

        while (!isValid) {
            loginView.enterAccount();
            account = scanner.nextLine();
            loginView.enterPassWord();
            password = scanner.nextLine();
            if (readDataClient.isLogin(account, password)) {
                System.out.println("welcome " + readDataClient.name + " to my system");
                homePageOfClient.load();
                isValid = true;
            } else {
                System.out.println("The account or password you entered is incorrect");
                LoginOrRegisterClientController loginOrRegisterClientController = LoginOrRegisterClientController.getInstance();
                loginOrRegisterClientController.load();
                isValid = true;

            }
        }
    }
}
