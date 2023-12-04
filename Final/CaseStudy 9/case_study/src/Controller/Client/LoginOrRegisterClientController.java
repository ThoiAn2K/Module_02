package Controller.Client;

import Controller.Home;
import Controller.HomePage;
import View.Home.LoginOrRegisterOfClientsView;

import java.util.Scanner;

public class LoginOrRegisterClientController implements HomePage {
    private static LoginOrRegisterClientController instance;

    public static LoginOrRegisterClientController getInstance() {
        if (instance == null) {
            instance = new LoginOrRegisterClientController();
        }
        return instance;
    }

    @Override
    public void load() {
        login0rRegister();
    }

    public void login0rRegister() {
        Scanner scanner = new Scanner(System.in);
//        boolean isValid = false;
        System.out.println();

//        while (!isValid) {
            LoginOrRegisterOfClientsView loginOrRegisterOfClientsView = LoginOrRegisterOfClientsView.getInstance();
            loginOrRegisterOfClientsView.load();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    HomePageLoginOfClient homePageLoginOfClient = HomePageLoginOfClient.getInstance();
                    homePageLoginOfClient.load();
//                    isValid = true;

                    break;
                case "2":
                    HomePageRegisterOfClient homePageRegisterOfClient = HomePageRegisterOfClient.getInstance();
                    homePageRegisterOfClient.load();
//                    isValid = true;
                    break;
                case "3":
                    Home home = Home.getInstance();
                    home.load();
                    break;
                default:
                    login0rRegister();
                    break;
            }
        }
    }
//}
