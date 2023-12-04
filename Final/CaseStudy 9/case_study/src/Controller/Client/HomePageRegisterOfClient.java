package Controller.Client;

import Controller.HomePage;
import Controller.Register;
import Controller.Seller.HomePageRegisterOfSeller;
import Controller.Seller.LoginOrRegisterSellerController;
import Model.Services.RegexAccountServices;
import Model.Services.RegexPasswordServices;
import Model.Services.ResultPasswordAgainService;
import Model.Utils.ReadDataClient;
import Model.Utils.ReadDataSeller;
import Model.Utils.WriterDataClient;
import Model.Utils.WriterDataSeller;
import View.Home.RegisterClientsView;
import View.Home.RegisterSellersView;

import java.util.Scanner;

public class HomePageRegisterOfClient implements HomePage {
    private static HomePageRegisterOfClient instance;

    public static HomePageRegisterOfClient getInstance() {
        if (instance == null) {
            instance = new HomePageRegisterOfClient();
        }
        return instance;
    }

    @Override
    public void load() {
        homePageRegisterOfSeller();
    }

    public void homePageRegisterOfSeller() {
        RegexAccountServices regexAccountServices = RegexAccountServices.getInstance();
        RegexPasswordServices regexPasswordServices = RegexPasswordServices.getInstance();
        RegisterClientsView registerClientsView = RegisterClientsView.getInstance();
        ResultPasswordAgainService resultPasswordAgainService = ResultPasswordAgainService.getInstance();
        ReadDataClient readDataClient = ReadDataClient.getInstance();
        WriterDataClient writerDataClient = WriterDataClient.getInstance();


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
            registerClientsView.enterAccount();
            account = scanner.nextLine();
            if (regexAccountServices.regex(account)) {
                if (readDataClient.isRead(account)) {
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
            registerClientsView.enterPassword();
            passwordIn = scanner.nextLine();
            if (regexPasswordServices.regex(passwordIn)) {
                isValidPassword = true;
                password = passwordIn;
            }
        }
        while (!isValidPasswordAgain) {
            registerClientsView.enterPasswordAgain();
            String passwordAgain = scanner.nextLine();
            if (resultPasswordAgainService.result(password, passwordAgain)) {
                isValidPasswordAgain = true;
            }
        }
        while (!isValidShopName) {
            registerClientsView.enterName();
            shopName = scanner.nextLine();
            if (readDataClient.isReadData(shopName)) {
                isValidShopName = true;
            } else {
                System.out.println("name already exists");
            }
        }

        System.out.println("Your account has been successfully registered");
        String[] data = {account, password, shopName};
        writerDataClient.writer(data);
       LoginOrRegisterClientController loginOrRegisterClientController = LoginOrRegisterClientController.getInstance();
       loginOrRegisterClientController.load();
    }
}
