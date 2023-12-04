package Controller;

import View.ViewRegistrationHomePage;

import java.util.Scanner;

public class ControllerRegistrationHomePage {
    private static ControllerRegistrationHomePage displayStartUp;

    public static ControllerRegistrationHomePage startUp() {
        if (displayStartUp == null) {
            displayStartUp = new ControllerRegistrationHomePage();
        }
        return displayStartUp;

    }

    public void firstLoad() {
        Scanner scanner = new Scanner(System.in);
        boolean isValidChoice = false;

        while (!isValidChoice) {
        ViewRegistrationHomePage.load();
        String choice = scanner.nextLine();
        System.out.println();

            switch (choice) {
                case "1":
                    ControllerLoginOrRegisterOfSellers controllerLoginOfSellersObject = new ControllerLoginOrRegisterOfSellers();
                    controllerLoginOfSellersObject.controllerLoginOfSellers();
                    isValidChoice = true;
                    break;
                case "2":
                    ControllerLoginOrRegisterOfClients controllerLoginOfClientsObject = new ControllerLoginOrRegisterOfClients();
                    controllerLoginOfClientsObject.controllerLoginOfClients();
                    isValidChoice = true;
                    break;
                case "3":
                    System.out.println("GoodBye, see you again");
                    System.exit(0);

            }
        }
    }
}
