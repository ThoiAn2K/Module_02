package Controller;

import Model.Client;
import View.LoginOfClients;
import View.LoginOrRegisterOfClients;
import View.LoginOrRegisterOfSellers;
import View.RegistrationHomePage;

import java.util.Scanner;

public class DisplayStartUp {
    private static DisplayStartUp displayStartUp;

    public static DisplayStartUp startUp() {
        if (displayStartUp != null) {
            displayStartUp = new DisplayStartUp();
        }
        return displayStartUp;
    }

    public void firstLoad() {
        Scanner scanner = new Scanner(System.in);
        RegistrationHomePage.load();
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                ControllerLoginOfSellers controllerLoginOfSellersObject = new ControllerLoginOfSellers();
                controllerLoginOfSellersObject.controllerLoginOfSellers();
                break;
            case "2":
                ControllerLoginOfClients controllerLoginOfClientsObject = new ControllerLoginOfClients();
                controllerLoginOfClientsObject.controllerLoginOfClients();
                break;

        }


    }


}
