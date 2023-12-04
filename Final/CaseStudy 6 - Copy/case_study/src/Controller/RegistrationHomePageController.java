package Controller;

import Controller.Client.LoginOrRegisterOfClientsController;
import Controller.Seller.LoginOrRegisterOfSellersController;
import View.ViewRegistrationHomePage;

import java.util.Scanner;

public class RegistrationHomePageController {
    private static RegistrationHomePageController displayStartUp;

    public static RegistrationHomePageController startUp() {
        if (displayStartUp == null) {
            displayStartUp = new RegistrationHomePageController();
        }
        return displayStartUp;

    }

    public void firstLoad() {
        Scanner scanner = new Scanner(System.in);
        boolean isValidChoice = false;

        while (!isValidChoice) {
        ViewRegistrationHomePage.load();
        String choice = scanner.nextLine();
//        System.out.println();

            switch (choice) {
                case "1":

                    LoginOrRegisterOfSellersController.controllerLoginOfSellers();
                    isValidChoice = true;
                    break;
                case "2":

                    LoginOrRegisterOfClientsController.controllerLoginOfClients();
                    isValidChoice = true;
                    break;
                case "3":
                    System.out.println("GoodBye, see you again");
                    System.exit(0);

            }
        }
    }
}
