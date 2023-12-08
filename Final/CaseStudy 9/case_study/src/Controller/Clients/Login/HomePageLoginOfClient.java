package Controller.Clients.Login;

import Controller.Clients.Register.LoginOrRegisterClientController;
import Model.Implement.HomePage;
import Model.Services.Buyer.BuyerLogin;
import Model.Utils.Client.ReadDataClient;
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
        BuyerLogin buyerLogin = BuyerLogin.getInstance();
        buyerLogin.load();
    }
}
