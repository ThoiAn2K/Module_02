package Controller.Seller;

import Controller.HomePage;
import Model.Services.RegexAccountServices;
import Model.Services.RegexPasswordServices;
import Model.Services.ResultPasswordAgainService;
import Model.Utils.ReadDataSeller;
import Model.Utils.ReadSeller;
import Model.Utils.WriterDataSeller;
import View.Home.RegisterSellersView;

import java.util.Scanner;

public class HomePageRegisterOfSeller implements HomePage {
    private static HomePageRegisterOfSeller instance;

    public static HomePageRegisterOfSeller getInstance() {
        if (instance == null) {
            instance = new HomePageRegisterOfSeller();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageRegisterOfSeller();
    }

    public void homePageRegisterOfSeller() {
        RegexAccountServices regexAccountServices = new RegexAccountServices();
        RegexPasswordServices regexPasswordServices = new RegexPasswordServices();
        RegisterSellersView registerSellersView = new RegisterSellersView();
        ResultPasswordAgainService resultPasswordAgainService = new ResultPasswordAgainService();
        ReadDataSeller readDataSeller = ReadDataSeller.getInstance();
        WriterDataSeller writerDataSeller = WriterDataSeller.getInstance();


        Scanner scanner = new Scanner(System.in);

        boolean isValidAccount = false;
        boolean isValidPassword = false;
        boolean isValidPasswordAgain = false;
        boolean isValidShopName = false;

        String account = "";
        String passwordIn = "";
        String password = "";
        String shopName = "";


        while (!isValidAccount) {
            registerSellersView.enterAccount();
            account = scanner.nextLine();
            if (regexAccountServices.regex(account)) {
                if (readDataSeller.isRead(account)) {
                    isValidAccount = true;
                } else {
                    System.out.println("Account already exists");
                }
            } else {
                System.out.println("Wrong account format");
            }
            ;
        }
        while (!isValidPassword) {
            registerSellersView.enterPassword();
            passwordIn = scanner.nextLine();
            if (regexPasswordServices.regex(passwordIn)) {
                isValidPassword = true;
                password = passwordIn;
            }
        }
        while (!isValidPasswordAgain) {
            registerSellersView.enterPasswordAgain();
            String passwordAgain = scanner.nextLine();
            if (resultPasswordAgainService.result(password, passwordAgain)) {
                isValidPasswordAgain = true;
            }
        }
        while (!isValidShopName) {
            registerSellersView.enterName();
            shopName = scanner.nextLine();
            if (readDataSeller.isReadData(shopName)) {
                isValidShopName = true;
            } else {
                System.out.println("name already exists");
            }
        }

        System.out.println("Your account has been successfully registered");
        String[] data = {account, password, shopName};
        writerDataSeller.writer(data);
        LoginOrRegisterSellerController loginOrRegisterSellerController = LoginOrRegisterSellerController.getInstance();
        loginOrRegisterSellerController.load();
    }
}
