package Controller;

import Controller.Client.LoginOrRegisterClientController;
import Controller.Seller.LoginOrRegisterSellerController;

import java.util.Scanner;

public class Home implements HomePage {

    private static Home instance;

    public static Home getInstance() {
        if (instance == null) {
            instance = new Home();
        }
        return instance;
    }

    @Override
    public void load() {
        loadHome();
    }

    private void loadHome() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {

            View.Home.HomePage homePage = new View.Home.HomePage();
            homePage.load();
            System.out.println("Enter number");
            Scanner scanner1 = new Scanner(System.in);
            String choice = scanner1.nextLine();
//            System.out.println();
            switch (choice) {
                case "1":
                    LoginOrRegisterSellerController loginOrRegisterSellerController = new LoginOrRegisterSellerController();
                    loginOrRegisterSellerController.load();
                    isValid = true;
                    break;

                case "2":
                    LoginOrRegisterClientController loginOrRegisterClientController = new LoginOrRegisterClientController();
                    loginOrRegisterClientController.load();
                    isValid = true;
                    break;
                case "3":
                    System.out.println("GoodBye, see you again");
                    System.exit(0);
            }

        }
    }

}
