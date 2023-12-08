package Controller.Seller.Login;

import Controller.Seller.LoginOrRegisterSellerController;
import Model.Implement.HomePage;
import Model.Entity.Product;
import Model.Services.Seller.SellerLogin;
import Model.Utils.Seller.ReadDataSeller;
import Model.Utils.Seller.WriterWalletOfSeller;
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



    public void homePageLoginOfSeller() {
        SellerLogin sellerLogin = SellerLogin.getInstance();
        sellerLogin.load();
    }
}
