package Controller.Seller;


import Model.Service.TestResultsLoginOfSellers;
import Model.Service.TestResultsRegisterOfSellers;
import View.StartUp.Main;

import View.Seller.Login.ViewLoginOfSellers;
import View.Seller.Register.ViewRegisterOfSellers;
import View.Seller.ViewLoginOrRegisterOfSellers;


import java.util.Scanner;

public class LoginOrRegisterOfSellersController {
    public static void controllerLoginOfSellers() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            ViewLoginOrRegisterOfSellers.displayLoginOrRegisterOfSeller();
            String choice = scanner.nextLine();
            System.out.println();
            switch (choice) {
                case "1":
                    ViewLoginOfSellers.header();
                    ViewLoginOfSellers.enterAccount();
                    String accountLogin = scanner.nextLine();
                    ViewLoginOfSellers.enterPassword();
                    String passwordLogin = scanner.nextLine();
                    System.out.println();


                    TestResultsLoginOfSellers.testResultsLoginOfSellers(accountLogin, passwordLogin);
                    isValid = true;


                    break;
                case "2":
                    ViewRegisterOfSellers.header();
                    ViewRegisterOfSellers.enterAccount();
                    String accountRegister = scanner.nextLine();

                    ViewRegisterOfSellers.enterPassword();
                    String passwordRegister = scanner.nextLine();

                    ViewRegisterOfSellers.nameOfShop();
                    String shopName = scanner.nextLine();

                    ViewRegisterOfSellers.phoneNumber();
                    String phoneNumber = scanner.nextLine();

                    System.out.println();
                    String[] data = {shopName, accountRegister, passwordRegister, phoneNumber};
                    TestResultsRegisterOfSellers.testResultsRegisterOfSellers(accountRegister, data,shopName, passwordRegister, phoneNumber);
                    isValid = true;

                    break;
                case "3":
                    Main.main(null);
                    System.out.println();
                    break;
            }
        }

    }
}
