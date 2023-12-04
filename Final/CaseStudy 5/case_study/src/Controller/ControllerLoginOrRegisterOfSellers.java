package Controller;

import Service.TestResultsLoginOfSellers;
import Service.TestResultsRegisterOfSellers;
import StartUp.Main;
import Utils.WriterDataSellers;
import View.ViewLoginOfSellers;

import View.ViewRegisterOfSellers;
import View.ViewLoginOrRegisterOfSellers;


import java.util.Scanner;

public class ControllerLoginOrRegisterOfSellers {
    public void controllerLoginOfSellers() {
        Scanner scanner = new Scanner(System.in);
        boolean isValid = false;

        while (!isValid) {
            ViewLoginOrRegisterOfSellers viewLoginOrRegisterOfSellersObject = new ViewLoginOrRegisterOfSellers();
            viewLoginOrRegisterOfSellersObject.displayLoginOrRegisterOfSeller();
            String choice = scanner.nextLine();
            System.out.println();
            switch (choice) {
                case "1":
                    ViewLoginOfSellers loginOfSellersObject = new ViewLoginOfSellers();
                    loginOfSellersObject.header();
                    loginOfSellersObject.enterAccount();
                    String accountLogin = scanner.nextLine();
                    loginOfSellersObject.enterPassword();
                    String passwordLogin = scanner.nextLine();
                    System.out.println();
                    TestResultsLoginOfSellers testResultsLoginOfSellersObject = new TestResultsLoginOfSellers();
                    testResultsLoginOfSellersObject.testResultsLoginOfSellers(accountLogin, passwordLogin);
                    isValid = true;




                    break;
                case "2":
                    ViewRegisterOfSellers registerOfSellersObject = new ViewRegisterOfSellers();
                    registerOfSellersObject.header();
                    registerOfSellersObject.enterAccount();
                    String accountRegister = scanner.nextLine();

                    registerOfSellersObject.enterPassword();
                    String passwordRegister = scanner.nextLine();

                    registerOfSellersObject.nameOfShop();
                    String shopName = scanner.nextLine();

                    registerOfSellersObject.phoneNumber();
                    String phoneNumber = scanner.nextLine();

                    System.out.println();
                    String[] data = {shopName, accountRegister, passwordRegister,phoneNumber};
                    TestResultsRegisterOfSellers testResultsRegisterOfSellersObject = new TestResultsRegisterOfSellers();
                    testResultsRegisterOfSellersObject.testResultsRegisterOfSellers(accountRegister, data);
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
