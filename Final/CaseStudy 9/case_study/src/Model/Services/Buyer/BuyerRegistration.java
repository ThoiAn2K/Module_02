package Model.Services.Buyer;

import Controller.Clients.Register.LoginOrRegisterClientController;
import Model.Implement.HomePage;
import Model.Services.GeneralUse.RegexAccountServices;
import Model.Services.GeneralUse.RegexPasswordServices;
import Model.Services.GeneralUse.ResultPasswordAgainService;
import Model.Utils.Client.ReadDataClient;
import Model.Utils.Client.WriterDataClient;
import View.Home.RegisterClientsView;

import java.util.Scanner;

public class BuyerRegistration implements HomePage {
    private static BuyerRegistration instance;

    public static BuyerRegistration getInstance() {
        if (instance == null) {
            instance = new BuyerRegistration();
        }
        return instance;
    }

    @Override
    public void load() {
        buyerRegister();
    }

    private void buyerRegister() {
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
            } else {
                System.out.println("Wrong password format");
            }
        }
        while (!isValidPasswordAgain) {
            registerClientsView.enterPasswordAgain();
            String passwordAgain = scanner.nextLine();
            if (resultPasswordAgainService.result(password, passwordAgain)) {
                isValidPasswordAgain = true;
            }else {
                System.out.println("Wrong password format");
            }
        }
        while (!isValidShopName) {
            registerClientsView.enterName();
            shopName = scanner.nextLine();
            if (readDataClient.isReadData(shopName)) {
                isValidShopName = true;
            } else {
                System.out.println("The name you entered already exists, please rename it with another name");
            }
        }

        System.out.println("Congratulations, your account has been successfully registered");
        String[] data = {account, password, shopName};
        writerDataClient.writer(data);
        LoginOrRegisterClientController loginOrRegisterClientController = LoginOrRegisterClientController.getInstance();
        loginOrRegisterClientController.load();
    }
}
