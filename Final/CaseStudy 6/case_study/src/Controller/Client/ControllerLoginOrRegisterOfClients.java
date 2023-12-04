package Controller.Client;


import Service.TestResultsRegisterOfClients;
import StartUp.Main;
import View.Client.Login.ViewLoginOfClients;
import View.Client.Register.ViewRegisterOfClients;
import View.Client.ViewLoginOrRegisterOfClients;
import View.Seller.Register.ViewRegisterOfSellers;


import javax.swing.text.View;
import java.util.Scanner;

public class ControllerLoginOrRegisterOfClients {
    public static void controllerLoginOfClients() {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        while (!isValid) {
            ViewLoginOrRegisterOfClients.displayLoginOrRegisterOfClients();
            String choice = scanner.nextLine();
            System.out.println();
            switch (choice) {
                case "1":
//                    ViewLoginOfClients loginOfClientsObject = new ViewLoginOfClients();
                    ViewLoginOfClients.header();
                    ViewLoginOfClients.enterAccount();
                    String accountLogin = scanner.nextLine();
                    ViewLoginOfClients.enterPassword();
                    String passwordLogin = scanner.nextLine();
                    System.out.println();
                    String[] dataLogin = {accountLogin, passwordLogin};
                    TestResultsRegisterOfClients.testResultsOfClients(accountLogin, dataLogin);
                    isValid = true;
                    break;
                case "2":

                    ViewRegisterOfClients.header();
                    ViewRegisterOfClients.enterPassword();
                    String accountRegister = scanner.nextLine();

                    ViewRegisterOfClients.enterPassword();
                    String passwordRegister = scanner.nextLine();

                    ViewRegisterOfSellers.nameOfShop();
                    String shopName=scanner.nextLine();

                    ViewRegisterOfSellers.phoneNumber();
                    String phoneNumber = scanner.nextLine();


                    System.out.println();
                    String[] dataRegister = {accountRegister, passwordRegister,shopName,phoneNumber};
                    TestResultsRegisterOfClients.testResultsOfClients(accountRegister, dataRegister);
                    isValid = true;

                    break;
                case "3":
                    Main.main(null);
                    break;
            }
        }

    }
}
