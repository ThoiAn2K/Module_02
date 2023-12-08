package Model.Services.Buyer;

import Controller.Clients.Login.HomePageOfClient;
import Controller.Clients.Register.LoginOrRegisterClientController;
import Model.Implement.HomePage;
import Model.Utils.Client.ReadDataClient;
import Model.Utils.Seller.CheckTheWarehouse;
import View.Home.LoginView;

import java.util.Scanner;

public class BuyerLogin implements HomePage {
    private static BuyerLogin instance;

    public static BuyerLogin getInstance() {
        if (instance == null) {
            instance = new BuyerLogin();
        }
        return instance;
    }

    @Override
    public void load() {
        buyerLogin();
    }

    private void  buyerLogin(){
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
            System.out.println();

            if (readDataClient.isLogin(account, password)) {
                System.out.println("==============================");
                System.out.println("Welcome " + readDataClient.name + " to my system");
                homePageOfClient.load();
                isValid = true;
            } else {
                System.out.println("==============================");
                System.out.println("The account or password you entered is incorrect");
                LoginOrRegisterClientController loginOrRegisterClientController = LoginOrRegisterClientController.getInstance();
                loginOrRegisterClientController.load();
                isValid = true;

            }
        }
    }
}
