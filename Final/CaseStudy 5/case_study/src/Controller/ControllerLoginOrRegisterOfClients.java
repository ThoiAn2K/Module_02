package Controller;

import Service.TestResultsLoginOfClients;
import Service.TestResultsLoginOfSellers;
import Service.TestResultsRegisterOfClients;
import StartUp.Main;
import View.ViewLoginOfClients;
import View.ViewLoginOrRegisterOfClients;

import View.ViewRegisterOfClients;

import java.util.Scanner;

public class ControllerLoginOrRegisterOfClients {
    public void controllerLoginOfClients() {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        while (!isValid) {
            ViewLoginOrRegisterOfClients.displayLoginOrRegisterOfClients();
            String choice = scanner.nextLine();
            System.out.println();
            switch (choice) {
                case "1":
                    ViewLoginOfClients loginOfClientsObject = new ViewLoginOfClients();
                    loginOfClientsObject.header();
                    loginOfClientsObject.enterAccount();
                    String accountLogin = scanner.nextLine();
                    loginOfClientsObject.enterPassword();
                    String passwordLogin = scanner.nextLine();
                    System.out.println();
                    String[] dataLogin = {accountLogin, passwordLogin};
                    TestResultsLoginOfClients testResultsLoginOfClientsObject = new TestResultsLoginOfClients();
                    testResultsLoginOfClientsObject.testResultsLoginOfClients(accountLogin, passwordLogin);
                    isValid = true;
                    break;
                case "2":
                    ViewRegisterOfClients registerOfClientsObject = new ViewRegisterOfClients();
                    registerOfClientsObject.header();
                    registerOfClientsObject.enterPassword();
                    String accountRegister = scanner.nextLine();

                    registerOfClientsObject.enterPassword();
                    String passwordRegister = scanner.nextLine();

                    registerOfClientsObject.nameOfShop();
                    String shopName=scanner.nextLine();

                    registerOfClientsObject.phoneNumber();
                    String phoneNumber = scanner.nextLine();



                    System.out.println();
                    String[] dataRegister = {accountRegister, passwordRegister,shopName,phoneNumber};
                    TestResultsRegisterOfClients testResultsRegisterOfClients = new TestResultsRegisterOfClients();
                    testResultsRegisterOfClients.testResultsOfClients(accountRegister, dataRegister);
                    isValid = true;

                    break;
                case "3":
                    Main.main(null);
                    break;
            }
        }

    }
}
